import java.util.*;         // array swap with temp. variable

class arrayswap {
    public static void main(String args[]) {
        int size, i,temp;                          // normal integer variable
        Scanner is = new Scanner(System.in);       // 1st scanner object 'is'
        System.out.println("enter the size of arrays");
        size = is.nextInt();
        int[] array1 = new int[size], array2 = new int[size];   //integer array variable
      //  Scanner sc = new Scanner(System.in);      // 2nd scanner object 'sc'
        System.out.println("enter the elements of first array");
        for (i = 0; i < size; i++)
            array1[i] = is.nextInt();
        System.out.println("enter the elements of second array");
        for (i = 0; i < size; i++)
            array2[i] = is.nextInt();
        System.out.println("before swapping");
        System.out.println("1st array:");
        for (i = 0; i < size; i++)
            System.out.print(array1[i]+"\t");
        System.out.println("\n2nd array:");
        for (i = 0; i < size; i++)
            System.out.print(array2[i]+"\t");
        for (i = 0; i < size; i++)

        {
            temp = array1[i];        // MAIN LOGIC OF SWAPPING WITH TEMP. ARRAY
            array1[i] = array2[i];
            array2[i] = temp;
        }
        System.out.println("\nafter swapping");
        System.out.println("1st array:");
        for (i = 0; i < size; i++)
            System.out.print(array1[i]+"\t");
        System.out.println("\n2nd array:");
        for (i = 0; i < size; i++)
            System.out.print(array2[i]+"\t");

    }
}