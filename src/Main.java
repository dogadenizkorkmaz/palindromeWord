import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) { //define static return method
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) { //define main
        Scanner scanner = new Scanner(System.in);//define scanner
        System.out.print("Bir metin girin: ");
        String input = scanner.nextLine();//get value from user

        System.out.println("is Palindrome? ==>>  " + isPalindrome(input));

    }
}