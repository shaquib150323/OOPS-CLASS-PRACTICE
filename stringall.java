import java.util.*;
import java.io.*;

class stringall {
 public static void main(String args[]) {
  int x, in;
  String st,str;
  Scanner sc = new Scanner(System.in);
  System.out.println("\n**this is a program to manipulate string\n and perform different information on it**\n");
  System.out.println("\nenter the string you want to manipulate\n");
  st = sc.nextLine();

  System.out.println(
    "press 1 for finding length\npress 2 for finding character at index\npress 3 for converting to lower case\npress 4 for converting to upper case\npress 5 for joining 2 strings\n");
  System.out.println(
    "press 6 to compare 2 strings\npress 7 to compare 2 strings but by ignoring its case\npress 8 to verify ending string\npress 9 to verify starting string\npress 10 to extract a part of the string\n");
  System.out.println(
    "press 11 to find index of a string]\npress 12 to split strings based on delimiter character\npress 13 to replace character in strings\n");

  x = sc.nextInt();
  switch (x)
   {
   case 1:
    System.out.println("lenth is " + st.length());
    break;
   case 2:
    System.out.println("enter the index\n");
    in = sc.nextInt();
    System.out.println("character at entered index is " + st.charAt(in));
    break;
   case 3:
    System.out.println("after conversion the string is " + st.toLowerCase());
    break;
   case 4:
    System.out.println("after conversion the string is " + st.toUpperCase());
    break;
   case 5:
    System.out.println("enter the second string\n");
    str = sc.nextLine();
    System.out.println("after joining result is\n" + st.concat(str));
    break;
   case 6:
    System.out.println("enter the second string\n");
    str = sc.nextLine();
    System.out.println("are two strings equal?...answer =>\n" + st.equals(str));
    break;
   case 7:
    System.out.println("enter the second string\n");
    str = sc.nextLine();
    System.out.println("are two strings equal (by not considering case)?...answer =>\n" + st.equalsIgnoreCase(str));
    break;
   case 8:
    System.out.println("enter the ending string\n");
    str = sc.nextLine();
    System.out.println("is the string ending with this word?...answer =>\n" + st.endsWith(str));
    break;
   case 9:
    System.out.println("enter the starting string\n");
    str = sc.nextLine();
    System.out.println("is the string starting with this word?...answer =>\n" + st.startsWith(str));
    break;
   case 10:
    System.out.println("enter the index from which you want to extract\n");
    in = sc.nextInt();
    System.out.println("extracted string is " + st.substring(in));
    break;
   case 11:
    System.out.println("enter the string you want to know index of\n");
    str = sc.nextLine();
    System.out.println("index is " + st.indexOf(str));
    break;
   case 12:
    System.out.println("enter the delimiter like @ , # , $ etc.\n");
    str = sc.nextLine();
    System.out.println("after splitting the string is " + st.split(str));
    break;
   case 13:
    char ch1, ch2;
    System.out.println("enter the character you want to replace\n");
    ch1 = sc.next().charAt(0);
    System.out.println("enter the new character\n");
    ch2 = sc.next().charAt(0);
    System.out.println("string after swapping characters is " + st.replace(ch1, ch2));
    break;
  }
 }
}