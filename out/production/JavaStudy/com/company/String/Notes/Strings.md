##  Strings

Strings (java.lang.String) are pieces of text stored in your program. Strings are not a primitive data type in Java,
however, they are very common in Java programs.
> In Java, Strings are immutable, meaning that they cannot be changed.

#### Comparing Strings:
In order to compare Strings for equality, you should use the String object's **equals** or **equalsIgnoreCase** methods.
```java
String firstString = "Test123";
String secondString = "Test" + 123;
if (firstString.equals(secondString)) {
 // Both Strings have the same content.
}

```
This example will compare them, independent of their case:
```java
String firstString = "Test123";
String secondString = "TEST123";
if (firstString.equalsIgnoreCase(secondString)) {
 // Both Strings are equal, ignoring the case of the individual characters.
}

```
> Do not use the == operator to compare Strings

Unless you can guarantee that all strings have been interned (see below), you should not use the == or != operators to compare Strings. These operators actually test references, and since multiple String objects can
represent the same String, this is liable to give the wrong answer.

> use the String.equals(Object) method, which will compare the String objects based on their values. For a
detailed explanation, please refer to Pitfall: using == to compare strings.


##### Comparing Strings in a switch statement:
It is possible to compare a String variable to literals in a switch statement. Make sure that the String
is not null, otherwise it will always throw a NullPointerException.

```java
String stringToSwitch = "A";
switch (stringToSwitch) {
 case "a":
 System.out.println("a");
 break;
 case "A":
 System.out.println("A"); //the code goes here
 break;
 case "B":
 System.out.println("B");
 break;
 default:
 break;
}

```
#### Comparing Strings with constant values:

When comparing a String to a constant value, you can put the constant value on the left side of **equals** to ensure
that you won't get a **NullPointerException** if the other String is **null**.
```java
"baz".equals(foo)

```
While **foo.equals("baz")** will throw a **NullPointerException** if foo is **null**, **"baz".equals(foo)** will evaluate to
**false**

>A more readable alternative is to use Objects.equals(), which does a null check on both parameters:
Objects.equals(foo, "baz").


#### Changing the case of characters within a String:
The **String** type provides two methods for converting strings between upper case and lower case:

- **toUpperCase** : to convert all characters to upper case
- **toLowerCase** : to convert all characters to lower case

These methods both return the converted strings as **new String instances**: the original String objects are not
modified because String is immutable in Java.
```java
String string = "This is a Random String";
String upper = string.toUpperCase();
String lower = string.toLowerCase();
System.out.println(string); // prints "This is a Random String"
System.out.println(lower); // prints "this is a random string"
System.out.println(upper); // prints "THIS IS A RANDOM STRING"
```