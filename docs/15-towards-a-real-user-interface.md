# 15. Towards a Real User Interface

## A More Realistic Implementation

### What Do We Have to Do Next?

![Swing table model for the AuctionSniper](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/15fig01.jpg "Swing table model for the AuctionSniper")

### Replacing `JLabel`

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/150pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### This generates a failure message because we don’t yet have a table:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/150pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/151pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Still Ugly

![Sniper with a single-cell table](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/15fig02.jpg "Sniper with a single-cell table")

## Displaying Price Details

### First, a Failing Test

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/152pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/153pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### The test fails because the row has no details, only the status text:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/153pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### Sending the State out of the Sniper

------------------------------------------------------------------------------------------------------------------------
#### Here's the first cut:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/154pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/155pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### Then we make the test pass:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/155pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/156pro03.jpg)

------------------------------------------------------------------------------------------------------------------------

### Showing a Bidding Sniper

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/156pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/156pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/158pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/159pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

![Sniper showing a row of detail](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/15fig03.jpg "Sniper showing a row of detail")

## Simplifying Sniper Events

### Listening to the Mood Music

### Re-purposing `sniperBidding()`

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/160pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### In the table model, we use simple indexing to translate the enum into displayable text:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/161pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### We rewrite the expectation with a custom matcher that checks just the state:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/161pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### Filling In the Numbers

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/162pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/163pro01.jpg)

#### Now, the end-to-end test passes.

------------------------------------------------------------------------------------------------------------------------

## Follow Through

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/164pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/164pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### Converting Won and Lost

### Trimming the Table Model

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/166pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Object-Oriented Column

------------------------------------------------------------------------------------------------------------------------
#### We add a method to `Column` that will extract the appropriate field:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/167pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### And the code in `SnipersTableModel` becomes negligible:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/167pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### Shortening the Event Path

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/167pro03.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/168pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

![TableModel as a SniperListener](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/15fig04.jpg "TableModel as a SniperListener")

## Final Polish

### A Test for Column Titles

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/169pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### The test fails:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/170pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Implementing the `TableModel`

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/170pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/170pro03.jpg)

------------------------------------------------------------------------------------------------------------------------

![Sniper with column headers](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/15fig05.jpg "Sniper with column headers")

### Enough for Now

![The Sniper shows price information](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/15fig06.jpg "The Sniper shows price information")

## Observations

### Single Responsibilities

### Keyhole Surgery for Software

### Programmer Hyper-Sensitivity

### Celebrate Changing Your Mind

### This Isn't the Only Solution