/*
    Function that validates palindromes
*/
import java.util.Scanner;  // Import the Scanner class

public class Palindrome {
    public static void main(String[] args) {

        Scanner myWord = new Scanner(System.in);
        String inputString;

        //Enter a string or N to exit the program
        do{
            System.out.println("Enter a string to test for Palindrome or N to exit:");
            inputString = myWord.nextLine();
            if(!(inputString.equals("n") || inputString.equals("N"))){
                System.out.println("Is this string a Palindrome: " + isPalindrome(inputString));
            }
        } while(!(inputString.equals("n") || inputString.equals("N")));
    }

    /*
        Function isPalindrome resturns true if the input string is a Palindrome
        @parameter: user input
        @return: true if the string is a palindrome
    */
    public static boolean isPalindrome (String word) {
        String myWord = word.replaceAll("\\s+","");
        String reverse = new StringBuffer(myWord).reverse().toString();
        return reverse.equalsIgnoreCase(myWord);
    }
}
