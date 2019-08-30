
import java.util.Scanner;

class q5string3 {
    public static void main(String[] args) {

        System.out.println("Enter the string1");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();

        System.out.println("Enter the string2");
        Scanner sc1 = new Scanner(System.in);
        String input2 = sc1.nextLine();

        char[] try1 = input1.toCharArray();

        char[] try2 = input2.toCharArray();

        boolean equalOrNot = true;

        if (try1.length == try2.length) {
            for (int i = 0; i < try1.length; i++) {
                if (try1[i] != try2[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }

        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }

    }
}
