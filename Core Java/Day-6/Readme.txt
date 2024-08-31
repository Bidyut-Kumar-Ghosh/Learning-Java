
# Java Operators

## Introduction
Java operators are special symbols that perform operations on variables and values. They are classified into several categories based on the type of operation they perform.

## Types of Java Operators

1. **Arithmetic Operators**
   - Used to perform basic mathematical operations.
   - Examples: `+` (addition), `-` (subtraction), `*` (multiplication), `/` (division), `%` (modulus).

   ```java
   int a = 10, b = 5;
   int sum = a + b; // 15
   ```

2. **Relational Operators**
   - Used to compare two values.
   - Examples: `==` (equal to), `!=` (not equal to), `>` (greater than), `<` (less than), `>=` (greater than or equal to), `<=` (less than or equal to).

   ```java
   if (a > b) {
       System.out.println("a is greater than b");
   }
   ```

3. **Logical Operators**
   - Used to combine multiple boolean expressions.
   - Examples: `&&` (logical AND), `||` (logical OR), `!` (logical NOT).

   ```java
   boolean result = (a > b) && (b > 0); // true
   ```

4. **Bitwise Operators**
   - Perform operations on bits and are used for bit manipulation.
   - Examples: `&` (bitwise AND), `|` (bitwise OR), `^` (bitwise XOR), `~` (bitwise NOT), `<<` (left shift), `>>` (right shift).

   ```java
   int c = a & b; // Bitwise AND
   ```

5. **Assignment Operators**
   - Used to assign values to variables.
   - Examples: `=` (simple assignment), `+=` (add and assign), `-=` (subtract and assign).

   ```java
   int x = 10;
   x += 5; // x is now 15
   ```

6. **Unary Operators**
   - Operate on a single operand.
   - Examples: `++` (increment), `--` (decrement), `+` (positive), `-` (negative).

   ```java
   int y = 10;
   y++; // y is now 11
   ```

7. **Ternary Operator**
   - A shorthand for the if-else statement.
   - Syntax: `condition ? value_if_true : value_if_false`.

   ```java
   int max = (a > b) ? a : b; // max is 10
   ```

## Conclusion
Understanding Java operators is fundamental for performing operations on data. Mastery of these operators will enhance your ability to write efficient Java programs.

## Further Reading
- [Java Documentation](https://docs.oracle.com/javase/tutorial/java/javaOO/operators/index.html)
- [Java Operators on W3Schools](https://www.w3schools.com/java/java_operators.asp)
