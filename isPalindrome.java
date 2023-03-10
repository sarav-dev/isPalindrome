import java.util.*;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String input = sc.nextLine();
        boolean check = true;

        for (int i=0; i<input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(input.length()-1-i)) {
                check = false;
                break;
            }
        }

        if(check) {
            System.out.println("The input string is a palindrome");
        } else {
            System.out.println("The input string is not a palindrome");
        }

        sc.close();
    }
}