In Java, generics provide a way to ensure type safety and avoid class cast exceptions by allowing you to define classes, interfaces, and methods with type parameters. Wildcards in Java generics add flexibility to these definitions. A wildcard is represented by a question mark (`?`) and can be used in various ways to denote an unknown type.

### Types of Wildcards

1. **Unbounded Wildcard (`<?>`)**:
    - Represents an unknown type.
    - Can be used when you do not know what type to expect but want to ensure type safety.
    - Example: `List<?> list` means the list can hold any type of object.

   ```java
   public void printList(List<?> list) {
       for (Object elem : list) {
           System.out.println(elem);
       }
   }
   ```

2. **Bounded Wildcards**:
    - **Upper Bounded Wildcard (`<? extends Type>`)**:
        - Restricts the unknown type to be a subtype of a specific class.
        - Useful for reading data where you want to read items as a specific type or its subtype.

      ```java
      public void processNumbers(List<? extends Number> list) {
          for (Number num : list) {
              System.out.println(num.doubleValue());
          }
      }
      ```

    - **Lower Bounded Wildcard (`<? super Type>`)**:
        - Restricts the unknown type to be a supertype of a specific class.
        - Useful for writing data where you want to add items of a specific type or its subtype.

      ```java
      public void addNumbers(List<? super Integer> list) {
          list.add(10);
          list.add(20);
      }
      ```

### Examples and Usage

#### Example with Unbounded Wildcard:
```java
public static void printList(List<?> list) {
    for (Object elem : list) {
        System.out.println(elem);
    }
}

public static void main(String[] args) {
    List<String> stringList = Arrays.asList("One", "Two", "Three");
    List<Integer> intList = Arrays.asList(1, 2, 3);

    printList(stringList); // Works fine
    printList(intList); // Works fine
}
```

#### Example with Upper Bounded Wildcard:
```java
public static double sumOfList(List<? extends Number> list) {
    double sum = 0.0;
    for (Number number : list) {
        sum += number.doubleValue();
    }
    return sum;
}

public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1, 2, 3);
    List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

    System.out.println("Sum of intList: " + sumOfList(intList)); // Outputs 6.0
    System.out.println("Sum of doubleList: " + sumOfList(doubleList)); // Outputs 6.6
}
```

#### Example with Lower Bounded Wildcard:
```java
public static void addIntegers(List<? super Integer> list) {
    list.add(1);
    list.add(2);
    list.add(3);
}

public static void main(String[] args) {
    List<Number> numberList = new ArrayList<>();
    List<Object> objectList = new ArrayList<>();

    addIntegers(numberList); // Works fine
    addIntegers(objectList); // Works fine

    System.out.println("Number List: " + numberList); // Outputs [1, 2, 3]
    System.out.println("Object List: " + objectList); // Outputs [1, 2, 3]
}
```

### Summary
- **Unbounded Wildcard (`<?>`)**: Any type, used when the type is not known.
- **Upper Bounded Wildcard (`<? extends Type>`)**: Any type that is a subtype of `Type`, used for reading.
- **Lower Bounded Wildcard (`<? super Type>`)**: Any type that is a supertype of `Type`, used for writing.

Wildcards add flexibility to Java generics, making it possible to write more general and reusable code.