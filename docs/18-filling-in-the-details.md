# 18. Filling In the Details

## A More Useful Application

## Stop When We've Had Enough

### Introducing a Losing State

![A bidder may now be losing](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/18fig01.jpg "A bidder may now be losing")

### The First Failing Test

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/206pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/207pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/207pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
#### To complete the loop, we add a value to the display text in `SnipersTableModel`:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/207pro03.jpg)

------------------------------------------------------------------------------------------------------------------------
#### The failure message says that we have no stop price field:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/207pro04.jpg)

------------------------------------------------------------------------------------------------------------------------

### Typing In the Stop Price

![The Sniper with a stop price field in its bar](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/18fig02.jpg "The Sniper with a stop price field in its bar")

------------------------------------------------------------------------------------------------------------------------
#### We get the test failure we expect, which is that the Sniper is not losing because it continues to bid:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/208pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Propagating the Stop Price

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/209pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### We push `Item` into the code and see what breaks, starting with `UserRequestListener`:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/209pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/209pro03.jpg)

------------------------------------------------------------------------------------------------------------------------
#### We make this test pass by extracting the stop price value within `MainWindow`:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/210pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Restraining the `AuctionSniper`

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/210pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
#### The other tests are similar:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/211pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### We change `AuctionSniper`, with supporting features in `SniperSnapshot` and `Item`, to make the test pass:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/211pro02.jpg)

#### The end-to-end tests pass.

------------------------------------------------------------------------------------------------------------------------

![The Sniper stops bidding at the stop price](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/18fig03.jpg "The Sniper stops bidding at the stop price")

## Observations

### User Interfaces, Incrementally

### Other Modeling Techniques Still Work

### Domain Types Are Better Than Strings
