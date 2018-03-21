# 9. Commissioning an Auction Sniper

## Overview
- We're a development team for a company:
    - Called _Markup and Gouge_.
    - Buys antiques online from _Southabee's_.
    - Sells to clients (a.k.a. buyers).
- Need to solve a problem where buyers manually bid on items and sometimes miss out.
- Build an application that automatically bids in auctions:
    - Slightly higher whenever price changes.
    - Until stop-price reached or auction closes.
- Buyers are keen for this application and will help us clarify what to build.

## Basic terms defined by buyers:
- **Item** is something that can be identified and bought.
- **Bidder** is a person or organization that is interested in buying an item.
- **Bid** is a statement that a bidder will pay a given price for an item.
- **Current price** is the current highest bid for the item.
- **Stop price** is the most a bidder is prepared to pay for an item.
- **Auction** is a process for managing bids for an item.
- **Auction house** is an institution that hosts auctions.

## Preliminary discussions
- In online systems, there's an auction per item.
- Can use item identifier to refer to its auction.
- Other systems will handle payment and delivery of items bought.

## Application requirements
- Desktop application.
- Allows user to bid for multiple items at a time.
- Inputs:
    - Item Code
    - Maximum Bid (stop price)
- Display:
    - Item Code
    - Last Price
    - Last Bid
    - Maximum Bid (stop price)
    - Status
- Change display values in response to events from auction house.

![A first user interface](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/09fig01.jpg "A first user interface")

## Southabee's API
- XMPP Protocol.
- Handles multiple bidders.
- Sends events on price changes and auction lifecycle.

![Southabee's online auction system](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/09fig02.jpg "Southabee's online auction system")

### Commands
- **Join**:
    - A bidder joins an auction.
    - Bidder identifier.
    - Item identifier (chat session ID).
- **Bid**: 
    - A bidder sends a bidding price to the auction.

### Events
- **Price**: 
    - Currently accepted price.
    - Bidder identifier who bid this price.
    - Minimum price for next bid.
    - Sent to new bidders and broadcast on new accepted bid.
- **Close**: 
    - Announcement that auction is closed.
    - Last accepted bid is the winner.

### States
![A bidder's behavior](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/09fig03.jpg "A bidder's behavior")

## Getting There Safely
![The initial plan](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/09fig04.jpg "The initial plan")

## Planning and Design resources
- [The Art of Agile Development](https://www.goodreads.com/book/show/1654215.The_Art_of_Agile_Development)
- [Agile Estimating and Planning](https://www.goodreads.com/book/show/9267.Agile_Estimating_and_Planning)