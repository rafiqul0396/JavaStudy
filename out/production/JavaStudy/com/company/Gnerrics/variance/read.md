### Generic types

> Definition: “A generic type is a generic class or interface that is parameterized over types.”

### Covariance and contravariance

> Variance refers to how subtyping between more complex types relates to subtyping between their components [source](https://en.wikipedia.org/wiki/Covariance_and_contravariance_(computer_science)).

```text
An easy-to-remember (and extremely informal) definition of covariance and contravariance is:

Covariance: accept subtypes
Contravariance: accept supertypes
```

### Arrays

- In Java, arrays are covariant, which has 2 implications.
- Firstly, an array of type T[] may contain elements of type T and its subtypes
- Secondly, an array of type S[] is a subtype of T[] if S is a subtype of T.

