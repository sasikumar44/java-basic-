
// Java program to Reverse a String by 
// converting string to characters one 
// by one 
import java.util.Scanner;

// Class of ReverseString 
class q3string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string want to reverse: ");
        String input = sc.nextLine();

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}
