### When you see “new”, think “concrete”

Yes, when you use new you are certainly instantiating a concrete
class, so that’s definitely an implementation, not an interface. And
it’s a good question; you’ve learned that tying your code to a
concrete class can make it more fragile and less flexible.

```java
Duck duck = new MallardDuck();
```

```plantuml
class MallarDuck
interface Duck
note "We want to use interfaces \nto keep code flexible" as h1
note "But we have to create an\ninstance of a concrete class!" as h2
note "Duck duck = new MallardDuck();" as main
h1 ..  Duck
h2..MallarDuck
Duck .. main
main..MallarDuck

```

### BAD code

```java

Duck duck;
if (picnic) {
 duck = new MallardDuck();
} else if (hunting) {
 duck = new DecoyDuck();
} else if (inBathTub) {
 duck = new RubberDuck();
}
```

> We have a bunch of different
> duck classes, and we don’t know
> until runtime which one we need
> to instantiate.

* this code violated the open/closed principle

#### Identifying the aspects that vary

Let’s say you have a pizza shop, and as a cutting-edge pizza store

* you write some code for pizza

  ```java
  Pizza orderPizza() {
   Pizza pizza = new Pizza();
   pizza.prepare();
   pizza.bake();
   pizza.cut();
   pizza.box();
   return pizza;
  }

  ```

  ##### But you need more than one type of pizza...

  So then you’d add some code that determines the appropriate type of pizza
  and then goes about making the pizza:


  ```java
  Pizza orderPizza(String type) {
   Pizza pizza;
   if (type.equals(“cheese”)) {
   pizza = new CheesePizza();
   } else if (type.equals(“greek”) {
   pizza = new GreekPizza();
   } else if (type.equals(“pepperoni”) {
   pizza = new PepperoniPizza();
   }
   pizza.prepare();
   pizza.bake();
   pizza.cut();
   pizza.box();
   return pizza;
  }

  ```

  > note: We’re now passing in the type of pizza to orderPizza.
  >

  Based on the type of pizza, we instantiate the correct concrete class and assign it to the pizza instance variable. Note that each pizza here has to implement the Pizza interface.

  Once we have a Pizza, we prepare it (you know, roll the dough, put on the sauce and add the toppings & cheese),then we bake it, cut it and box it!. Each Pizza subtype (CheesePizza,VeggiePizza, etc.) knows how to
  prepare itself

  #### But the pressure is on to add more pizza types

  - You realize that all of your competitors have added a couple of trendy pizzas to
    their menus: the Clam Pizza and the Veggie Pizza. Obviously you need to keep
    up with the competition, so you’ll add these items to your menu. And you haven’t
    been selling many Greek Pizzas lately, so you decide to take that off the menu.
  - ```java
    Pizza orderPizza(String type) {
     Pizza pizza;
     if (type.equals(“cheese”)) {
     pizza = new CheesePizza();
     } else if (type.equals(“greek”) {
     pizza = new GreekPizza();
     } else if (type.equals(“pepperoni”) {
     pizza = new PepperoniPizza();
     } **else if (type.equals(“clam”) {
     pizza = new ClamPizza();
     } else if (type.equals(“veggie”) {
     pizza = new VeggiePizza();
     }**
     pizza.prepare();
     pizza.bake();
     pizza.cut();
     pizza.box();
     return pizza;
    }
    ```

    - *Problem 1*: This is what varies As the pizza selection changes over time, you’ll have to modify this code over and over.
    - *Problem 2*:This code is **NOT closed for modification**. If the Pizza Shop changes its pizza offerings, we have to get into this code and modify it.
    - *Problem 3:* This is what we expect to stay the same. For the most part,preparing, cooking, and packaging
      a pizza has remained the same for years and years. So, we don’t expect this code to change,just the pizzas it operates on.
* ### Encapsulating object creation


  - we’re going to do is take the creation code and move it out
    into another object that is only going to be concerned with
    creating pizzas.
  - We’ve got a name for this new object: **we call it a Factory**
  - Once we have a **SimplePizzaFactory**, our **orderPizza()** method just becomes a client of that object. Any time it needs a pizza it asks the pizza factory to make one.
  - #### Building a simple pizza factory
  - ```java
    public class SimplePizzaFactory {
     public Pizza createPizza(String type) {
     Pizza pizza = null;
     if (type.equals(“cheese”)) {
     pizza = new CheesePizza();
     } else if (type.equals(“pepperoni”)) {
     pizza = new PepperoniPizza();
     } else if (type.equals(“clam”)) {
     pizza = new ClamPizza();
     } else if (type.equals(“veggie”)) {
     pizza = new VeggiePizza();
     }
     return pizza;
     }
    }
    ```

    - Here’s our new class, the SimplePizzaFactory. It has one job in life: *creating pizzas for its clients*
    - First we define a createPizza() method in the factory. This is the method all clients will use to instantiate new obj.
    - Here’s the code we plucked out of the orderPizza() method.
    - This code is still parameterized by the type of the pizza, just like our original orderPizza() method was.
  - ### What’s the advantage of this? It looks like we are just pushing the problem off to another object.

    - **Soln:** One thing to remember is that the SimplePizzaFactory may have many clients.We’ve only seen the orderPizza() method;however, there may be a PizzaShopMenu class that uses the factory to get pizzas
      for their current description and price. We might also have a HomeDelivery class that handles pizzas in a different way than our PizzaShop class but is also a client of the factory.So, by encapsulating the pizza creating in one class, we now have only one place to make modifications when the implementation changes.Don’t forget, we are also just about to remove the concrete instantiations from our client code!
  - ### I’ve seen a similar design where a factory like this is defined as a static method. What is the difference?

    - **Soln:** Defining a simple factory as a static method is a common technique and is often called a static factory. Why use a static method? Because you don’t need to instantiate an object to make use of the
      create method. But remember it also has the disadvanage that you can’t subclass and change the behavior of the create method.
* #### Reworking the PizzaStore class


  - ```java
    public class PizzaStore {
     SimplePizzaFactory factory;
     public PizzaStore(SimplePizzaFactory factory) {
     this.factory = factory;
     }
     public Pizza orderPizza(String type) {
     Pizza pizza;
     pizza = factory.createPizza(type);
     pizza.prepare();
     pizza.bake();
     pizza.cut();
     pizza.box();
     return pizza;
     }
     // other methods here
    }
    ```

    - Now we give PizzaStore a reference to a SimplePizzaFactory.
    - PizzaStore gets the factory passed to it in the constructor.
    - And the orderPizza() method uses the factory to create its pizzas by simply passing on the type of the order.
    - Notice that we’ve replaced the new operator with a create method on the factory object. No more concrete instantiations here!.


### The Simple Factory defined

```plantuml
class PizzaStore{
+ orderPiza()
}
class SimplePizzaFactory{
+ createPizza()
}
class Pizza{
+prepare()
+bake()
+cut()
+box(

}
class CheesePizza extends Pizza
class VeggiePizza extends Pizza
class ClamPizza extends Pizza
class PepperoniPizza extends Pizza

note "This is the client of the factory.\nPizzaStore now goes through\n the SimplePizzaFactory to get\n instances of pizza." as p1
note "The create method is often\ndeclared statically." as p2
note "This is the factory where we create\npizzas; it should be the\n only part of our application\n that refers to \nconcrete Pizza classes.." as p3
note "This is the product of the factory: pizza!" as p4
note "We’ve defined Pizza\nas an abstract class\nwith some helpful\nimplementations that\ncan be overridden" as p5
note "These are our concrete products. Each\nproduct needs to implement the Pizza\ninterface* (which in this case means\nextend theabstract\nPizza class) and\nbe concrete. As long as that’s the case,\nit can be created by the factory and\nhanded back to the client." as p6 





p1 -right->PizzaStore
p2 -up->SimplePizzaFactory
p3 -down->SimplePizzaFactory
p4 -down->Pizza
p5 -left->Pizza
p6 -up->CheesePizza
PizzaStore -right->SimplePizzaFactory
SimplePizzaFactory -right->Pizza

```
