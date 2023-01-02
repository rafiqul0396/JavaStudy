### Assertion

#### All the assertions are in the Assert class.

```java
public class Assert extends java.lang.Object
```

This class provides a set of assertion methods, useful for writing tests. Only failed assertions are recorded.
Some of the important methods of Assert class are as follows −


| Sr.No. | Methods                                                 | Description                                                                                |
| ------ | ------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| 1      | **void assertEquals(boolean expected, boolean actual)** | Checks that two primitives/objects are equal.                                              |
| 2      | **void assertTrue(boolean condition)**                  | Checks that a condition is true.                                                           |
| 3      | **void assertFalse(boolean condition)**                 | Checks that a condition is false                                                           |
| 4      | **void assertNotNull(Object object)**                   | Checks that an object isn't null.                                                          |
| 5      | **void assertNull(Object object)**                      | Checks that an object is null.                                                             |
| 6      | **void assertSame(object1, object2)**                   | The assertSame() method tests if two object references point to the same object.           |
| 7      | **<br/>void assertNotSame(object1, object2)**           | The assertNotSame() method tests if two object references do not point to the same object. |
| 8      |                                                         |                                                                                            |

### Annotation

Annotations are like meta-tags that you can add to your code, and apply them to methods or in class. These annotations in JUnit provide the following information about test methods −

* which methods are going to run before and after test methods.
* which methods run before and after all the methods, and.
* which methods or classes will be ignored during the execution.


| Sr. No: | Annotation       | description                                                                                                                                                                                                            |
| ------- | ---------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1.      | **@Test**        | The Test annotation tells JUnit that the public void<br /> method to which it is attached can be run as a test case.                                                                                                   |
| 2.      | **@Before**      | Several tests need similar objects created before <br />they can run.<br /> Annotating a public void method with @Before <br />causes that method to be run before each Test method.                                   |
| 3.      | **@After**       | If you allocate external resources in a Before method,<br /> you need to release them after the test runs. Annotating <br />a public void method with @After causes that method <br />to be run after the Test method. |
| 4.      | **@BeforeClass** | Annotating a public static void method with<br /> @BeforeClass causes it to be run once before <br />any of the test methods in the class.                                                                             |
| 5.      | **@AfterClass**  | This will perform the method after all<br /> tests have finished. This can be <br />used to perform clean-up activities.                                                                                               |
| 6.      | **@Ignore**      | The Ignore annotation <br />is used to ignore the<br /> test and that test will not be executed.                                                                                                                       |
| 7.      |                  |                                                                                                                                                                                                                        |
| 8.      |                  |                                                                                                                                                                                                                        |
| 9.      |                  |                                                                                                                                                                                                                        |
