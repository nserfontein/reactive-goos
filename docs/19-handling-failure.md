# 19. Handling Failure

## What If It Doesn't Work?

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/216pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### The test fails:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/217pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

## Detecting the Failure

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/217pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/217pro03.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/218pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### Our fix is to throw an exception whenever we try to get a value that has not been set, and we define `MissingValueException` for this purpose.

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/218pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

## Displaying the Failure

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/218pro03.jpg)

------------------------------------------------------------------------------------------------------------------------
#### All we have to do is add a failed() transition to SniperSnapshot and use it in the new method:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/219pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

![The Sniper shows a failed auction](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/19fig01.jpg "The Sniper shows a failed auction")

## Disconnecting the Sniper

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/220pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/220pro02.jpg)

#### The end-to-end test, as far as it goes, passes.

------------------------------------------------------------------------------------------------------------------------

## Recording the Failure

### Filling In the Test

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/221pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Failure Reporting in the Translator

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/222pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### We amend our existing failure tests, wrapping up message creation and common expectations in helper methods:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/222pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/222pro03.jpg)

#### The unit test passes.

------------------------------------------------------------------------------------------------------------------------

### Generating the Log Message

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/223pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Closing the Loop

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/224pro01.jpg)

#### The end-to-end test passes completely.

------------------------------------------------------------------------------------------------------------------------

![The Sniper reports failed messages from an auction](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/19fig02.jpg "The Sniper reports failed messages from an auction")

## Observations

### "Inverse Salami" Development

### Small Methods to Express Intent

### Logging Is Also a Feature

