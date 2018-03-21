# 17. Teasing Apart Main

## Finding a Role

------------------------------------------------------------------------------------------------------------------------
#### One clue is to look at its imports:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/191pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

## Extracting the `Chat`

### Isolating the `Chat`

------------------------------------------------------------------------------------------------------------------------
#### We’d like to split them up. Here it is again:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/192pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/193pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Encapsulating the `Chat`

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/193pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/194pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

![With XMPPAuction extracted](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/17fig01.jpg "With XMPPAuction extracted")

### Writing a New Test

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/195pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

## Extracting the Connection

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/196pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### The end result of this refactoring is:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/196pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

![With XMPPAuctionHouse extracted](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/17fig02.jpg "With XMPPAuctionHouse extracted")

## Extracting the `SnipersTableModel`

### Sniper Launcher

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/197pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/198pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/198pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/199pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Sniper Portfolio

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/199pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/200pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

![With the SniperPortfolio](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/17fig03.jpg "With the SniperPortfolio")

![Adding items through the user interface](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/17fig04.jpg "Adding items through the user interface")

## Observations

### Incremental Architecture

![The application now has a "ports and adapters" architecture](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/17fig05.jpg "The application now has a 'ports and adapters' architecture")

### Three-Point Contact

### Dynamic as Well as Static Design

![An Interaction Diagram](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/17fig06.jpg "An Interaction Diagram")

### An Alternative Fix to `notToBeGCd`
