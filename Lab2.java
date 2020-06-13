// Lab-2 Control Structures
/* Write an encryption method, and a decryption method. Both methods should take in a String, and an encryption value.
   The encryption method should add the value to each character in the String, and the decryption method should
   subtract the value from each method in the String
        Write a method that takes a 10 integer array as an argument.
        The method should return the sum of all of the elements
   Write a method that checks if the array contains a specific number (can be hard-coded)
   The method searches for a variable, the hard-coded value is in main
*/

import java.util.Arrays;
import java.util.Scanner;

public class Methods
{

    public static void main(String[] args) {

        //Question 1

        int key ;

        System.out.print("Please enter a string:");
        Scanner s1=new Scanner(System.in);
        String input = s1.nextLine();
        System.out.print("Enter an integer key:");
        key=s1.nextInt();


        String encryptValue = "";
        for (int i = 0; i < input.length(); i++)
        {
            encryptValue = encryptValue + ((char) (input.charAt(i) + key));
        }
        System.out.println("Encrypted String for "+input+" is "+encryptValue);


        String decryptValue="";
        for (int j = 0; j < encryptValue.length(); j++)
        {
            decryptValue = decryptValue + ((char) (encryptValue.charAt(j) - key));
        }
        System.out.println("Decrypted String for "+encryptValue+" is "+decryptValue);

        // Question 2

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[11];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i=1; i<11; i++)
        {
            System.out.print("num["+i+"]=");
            array[i] = scanner.nextInt();
        }
        for( int num : array)
        {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is = "+sum);

        // Question 3

        int[] arr1 = { 2, 5, 7, 10, 12, 15, 17, 20 };
        System.out.println("Search if number is present in the array or not:");
        int toCheckValue1=scanner.nextInt();

        System.out.println("Array: " + Arrays.toString(arr1));
        check(arr1, toCheckValue1);

    }

    private static void check(int[] arr,int toCheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
            }
        }

        System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }

}
