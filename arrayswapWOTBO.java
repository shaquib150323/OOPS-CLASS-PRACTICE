import java.util.*;

class arrayswapWOTBO // swapping array without temp. variable(BITWISE EXOR operator)
{
    public static void main(String shaquib[]) {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        size = sc.nextInt();
        int[] arr1 = new int[size], arr2 = new int[size];
        System.out.println("enter the elements of 1st array");
        for (i = 0; i < size; i++)
            arr1[i] = sc.nextInt();
        System.out.println("enter the elements of 2nd array");
        for (i = 0; i < size; i++)
            arr2[i] = sc.nextInt();
        // printing initial arrays
        System.out.println("ARRAY 1:");
        for (i = 0; i < size; i++)
            System.out.println(arr1[i]);
        System.out.println("ARRAY 2:");
        for (i = 0; i < size; i++)
            System.out.println(arr2[i]);

        for (i = 0; i < size; i++) // main logic
        {
            arr1[i] = arr1[i] ^ arr2[i];
            arr2[i] = arr1[i] ^ arr2[i];
            arr1[i] = arr1[i] ^ arr2[i];
        }

        System.out.println("* ARRAYs AFTER SWAPPING ARE *");
        System.out.println("ARRAY 1:");
        for (i = 0; i < size; i++)
            System.out.println(arr1[i]);
        System.out.println("ARRAY 2:");
        for (i = 0; i < size; i++)
            System.out.println(arr2[i]);
    }
}