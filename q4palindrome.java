
import java.util.Scanner;

class q4palindrome {
    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        // String original = "ACCA";

        String reverse = "";
        // convert String to character array
        // by using toCharArray
        char[] try1 = original.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)

            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {
            System.out.println("The String is a Palindrome");
        } else {
            System.out.println("The String is not a Palindrome");
        }

    }
}
