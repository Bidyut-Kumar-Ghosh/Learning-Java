# Java Control Flow Statements

## Introduction
Control flow statements allow you to control the flow of program execution based on conditions or loops.

## Types of Control Flow Statements

1. **If-Else Statements**
   - Used for conditional branching
   - Syntax:
   ```java
   if (condition) {
       // code block
   } else if (condition) {
       // code block
   } else {
       // code block
   }
   ```

2. **Switch Statements**
   - Used when you have multiple conditions based on a single variable
   - Syntax:
   ```java
   switch (variable) {
       case value1:
           // code block
           break;
       case value2:
           // code block
           break;
       default:
           // code block
   }
   ```

3. **For Loop**
   - Used when you know the number of iterations
   - Syntax:
   ```java
   for (initialization; condition; increment/decrement) {
       // code block
   }
   ```

4. **While Loop**
   - Used when you don't know the number of iterations beforehand
   - Syntax:
   ```java
   while (condition) {
       // code block
   }
   ```

5. **Do-While Loop**
   - Similar to while loop but executes at least once
   - Syntax:
   ```java
   do {
       // code block
   } while (condition);
   ```

6. **Break and Continue**
   - break: exits the loop
   - continue: skips current iteration

## Practice Examples
Check the following files:
1. IfElseExample.java - Grade calculation using if-else
2. SwitchExample.java - Day of week using switch
3. LoopsExample.java - Various loop demonstrations
4. BreakContinueExample.java - Usage of break and continue statements