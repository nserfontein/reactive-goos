# 10. The Walking Skeleton

## Get the Skeleton out of the Closet
- Help us understand the requirements well enough to propose and validate a broad-brush system structure.
- Can change mind later.
- Start with something that maps out the landscape of our solution. 
- Takes a surprising amount of effort.
- Deciding what to do will flush out all sorts of questions about the application and its place in the world. 
- Automation of building, packaging, and deploying into a production-like environment will flush out all sorts of technical and organizational questions.
- Iteration zero: 
    - Initial analysis.
    - Setting up environments.
    - Infrastructure, not much visible functionality.
    - Use the walking skeleton to test-drive the initial architecture.
- Start walking skeleton by writing a test.

## Our Very First Test
- Cover all components of system: user interface, sniping component and communication with auction server.
- Thinnest testable slice.
- First item on to-do list.
- Join auction and wait for close.
- Not concerned with sending a bid at this early stage.
- Confirm communication.
- Start by writing test as if its implementation already exists.
- Fill in whatever is needed to make it work.
- Work backward from test to focus on "what" not "how".
- Build the infrastructure to support the way we want to test the system.
- With infrastructure in place, implement the feature and make the test pass.

### Test outline:
1. When an auction is selling an item,
2. And an Auction Sniper has started to bid in that auction,
3. Then the auction will receive a `Join` request from the Auction Sniper.
4. When an auction announces that it is `Closed`,
5. Then the Auction Sniper will show that it lost the auction.

![A Sniper joins, then loses](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/10fig01.jpg "A Sniper joins, then loses")

### Southabee's _Test Doubles_
- Southabee's does not have a free testing service.
- Simulate how we think the real thing behaves according to documentation.
- Will be as simple as we can make it.
- See [Test Doubles](https://martinfowler.com/bliki/TestDouble.html).

### Controlling the Sniper Application
- Exercise our application as close to end-to-end as possible.
- Start by working through the publicly visible features.
- Tests must be clear about what is being checked:
    - Written in terms of the relationship between a Sniper and its auction.
    - Hide all the messy code for manipulating UI in an `ApplicationRunner` class.

------------------------------------------------------------------------------------------------------------------------
#### Failing skeleton code
    
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/085pro01.jpg)

[Branch: ch10-01-our-very-first-test--fail](https://github.com/nserfontein/tdd-goos/tree/ch10-01-our-very-first-test--fail)

#### Naming conventions
- If a method triggers an event to drive the test, its name will be a command.
    - Eg. `startBiddingIn()`.
- If a method asserts that something should have happened, its name will be descriptive.
    - Eg. `showsSniperHasLostAuction()` will throw an exception if the application is not showing the auction status as lost.

------------------------------------------------------------------------------------------------------------------------

## Some Initial Choices
- Need to make test pass.
- Require a lot of preperation.
- Four components:
    - XMPP message broker.
    - A stub auction that can communicate over XMPP.
    - A GUI testing framework.
    - A test harness that can cope with our multithreaded, asynchronous architecture.
- Get the project under version control with an automated build/deploy/test process.
- Will force some of the structural decisions we need to make, such as packaging and deployment.

### Package selections
- Open source implementation of XMPP called **Openfire**.
- XMPP client library called **Smack**.
- **Swing** testing framework called **WindowLicker**.

#### When assembled, the infrastructure will look like:
![The end-to-end test rig](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/10fig02.jpg "The end-to-end test rig")

### End-to-End Testing

### Ready to Start
