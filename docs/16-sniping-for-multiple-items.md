# 16. Sniping for Multiple Items

## Testing for Multiple Items

### A Tale of Two Items

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/176pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### The rest is similar, which means we can write a new test:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/176pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### The `ApplicationRunner`

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/177pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### We run the test and watch it fail:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/177pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### A Diversion, Fixing the Failure Message

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/177pro03.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/178pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### Which produces this more helpful failure report:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/178pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### Restructuring `Main`

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/178pro03.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/179pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### We loop through each of the items that we’ve been given:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/179pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/179pro03.jpg)

------------------------------------------------------------------------------------------------------------------------

### Extending the Table Model

------------------------------------------------------------------------------------------------------------------------
#### Writing an empty implementation in `SnipersTableModel` to satisfy the compiler:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/180pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/180pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
#### These changes break the existing Sniper update test, because there’s no longer a default Sniper, so we fix it:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/181pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/181pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/182pro01.jpg)

#### This makes the current end-to-end test pass.

------------------------------------------------------------------------------------------------------------------------

![The Sniper handles multiple items](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/16fig01.jpg "The Sniper handles multiple items")

## Adding Items through the User Interface

### A Simpler Design

![The Sniper with input fields in its bar](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/16fig02.jpg "The Sniper with input fields in its bar")

### Update the Test

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/184pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/184pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
#### Neither of these components exist yet, so the test fails looking for the text field:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/184pro03.jpg)

------------------------------------------------------------------------------------------------------------------------

### Adding an Action Bar

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/185pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
#### Our next test fails because we don’t create the identified rows in the table model:

![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/185pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### A Design Moment

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/186pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

### Another Level of Testing

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/186pro02.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/187pro01.jpg)

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/187pro02.jpg)

------------------------------------------------------------------------------------------------------------------------

### Implementing the `UserRequestListener`

------------------------------------------------------------------------------------------------------------------------
![](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/188pro01.jpg)

------------------------------------------------------------------------------------------------------------------------

## Observations

### Making Steady Progress

### TDD Confidential

### Ship It?

![Everything implemented in Main](https://www.safaribooksonline.com/library/view/growing-object-oriented-software/9780321574442/graphics/16fig03.jpg "Everything implemented in Main")
