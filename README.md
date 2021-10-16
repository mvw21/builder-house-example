# builder-house-example

Advantages of Builder Design Pattern

The parameters to the constructor are reduced and are provided in highly readable method calls.
Builder design pattern also helps in minimizing the number of parameters in constructor and thus there is no need to pass in null for optional parameters to the constructor.
Object is always instantiated in a complete state
Immutable objects can be build without much complex logic in object building process.
 


Disadvantages of Builder Design Pattern

The number of lines of code increase at least to double in builder pattern, but the effort pays off in terms of design flexibility and much more readable code.
Requires creating a separate ConcreteBuilder for each different type of Product.
