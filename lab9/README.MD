Decorator Pattern using Lambda

In regular java code to use decorator pattern we create a class and then decorate that class using the parent class as base class. So in the code we added BlackShapeDecorator.java a separate class which decorated the shape passed to it.

When using lambda function we did not use additional class for it, we can decorate the class just by calling a lambda decorator for whichever shape we need to decorate will draw that shape. Hence this reduces the memory of creating another class and efforts. If we need to decorate more classes we can just call another lambda function rather than creating other class.

In normal code we had to create object of specific decorator class But, in Lamba we create object of generic decorator class.

