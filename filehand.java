import java.io.*;
import java.util.*;
import java.lang.*;

class filehand {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING ");

        String str = sc.nextLine();
        str = str.toUpperCase();
        System.out.println(str);
        FileWriter w = new FileWriter("info.txt");
        for (int i = 0; i < str.length(); i++) {
            w.write(str.charAt(i));
        }
        System.out.println("WRITING SUCCESSFUL");
        w.close();
    }
}