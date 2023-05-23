import java.util.*;
public class testop {
 public static void main(String args[]) {
  int x, a, b;
  Scanner sc = new Scanner(System.in);
  System.out.println("\nWelcome to java operator tester");
  System.out.println("*******************************\n");
  System.out.println(
    "* Enter 1 for unary operator menu\n\n* Enter 2 for binary operator menu\n\n* Enter 3 for testing ternary operator");
  x = sc.nextInt();
  System.out.println("\nEnter the values of operand 'a' and 'b'\n");
  System.out.print("a =\n");
  a = sc.nextInt();
  System.out.print("b =\n");
  b = sc.nextInt();

  switch (x) // principle switch case
  {
   case 1: // unary operator
    int ch;
    System.out.println("* Enter 1 to perform increment\n* Enter 2 to perform decrement\n");
    ch = sc.nextInt();
    switch (ch) {
     case 1: // increment
      System.out.printf("the post increment of a is %d and b is %d\n", (a++), (b++));
      a = a - 1;
      b = b - 1;
      System.out.printf("\nthe pre increment of a is %d and b is %d\n", (++a), (++b));
      break;
     case 2: // decrement
      System.out.printf("the post decrement of a is %d and b is %d\n", (a--), (b--));
      a = a + 1;
      b = b + 1;
      System.out.printf("\nthe pre decrement of a is %d and b is %d\n", (--a), (--b));
      break;
    }
    break;
   case 2: // binary operator
    int bch;
    System.out.println(
      "* Enter 1 for arithmetic operation\n\n* Enter 2 for logical operation\n\n* Enter 3 for relational operation\n\n* Enter 4 for assignment operation\n\n");
    bch = sc.nextInt();
    switch (bch) {
     case 1: // arithmetic operator
      System.out.println(" -> addition of a and b is \t" + (a + b)+"\n");
      System.out.println(" -> subtraction  of a and b is \t" + (a - b)+"\n");
      System.out.println(" -> product  of a and b is \t" + (a * b)+"\n");
      System.out.println(" -> quotient of a divides b is \t" + (b / a)+"\n");
      System.out.println(" -> remainder of a divides b is \t" + (a % b)+"\n");
      break;

     case 2: // logical operator
      int lch;
      System.out.println("* Enter 1 for logical AND (&&)\n* Enter 2 for logical OR (||)\n");
      lch = sc.nextInt();
      switch (lch) {
       case 1:
        if (a % 2 == 0 && b % 2 == 0)
         System.out.println(" both a and b are even\n");
        else
         System.out.println("atleast one of them is not even\n");
        break;
       case 2:
        if (a % 2 == 0 || b % 2 == 0)
         System.out.println(" atleast one or both a and b are even\n");
        else
         System.out.println("no-one among them is even\n");
        break;
      }
      break;

     case 3: // relational operator
      if (a > b)
       System.out.println("a is greater than b\n");
      else if (a < b)
       System.out.println("\nb is greater than a\n");
      else if (a == b)
       System.out.println("\na is equal to b\n");
      break;
     case 4: // assignment operator
      System.out.printf("-> initially a is %d and b is %d\n", a, b);
      int temp;
      temp = a;
      a = b;
      b = temp;
      System.out.printf("\n-> after swap using assignment to temporary variable a is %d and b is %d\n", a, b);
      break;
    }
    break;
   case 3: // ternary operator
    String result = (a > b) ? "a is greater than b\n" : "\nb is greater than a \n";
    System.out.println(result);
    break;
   default:
    System.out.println("\n Wrong choice!!! enter from 1 to 3 only\n");
  }

 }
}