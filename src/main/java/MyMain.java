import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z'){
            ch -= 'A';
            ch += 'a';
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        
        int length = str.length();
        String returnValue = "";
        for(int i = 0; i < length; i++){
            char indexedChar = str.charAt(i);
            char lowerChar = toLower(indexedChar);
            returnValue += lowerChar;

        }
        return returnValue;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z'){
            ch -= 'a';
            ch += 'A';
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        int length = str.length();
        String returnValue = "";
        for(int i = 0; i < length; i++){
            char indexedChar = str.charAt(i);
            char upperChar = toUpper(indexedChar);
            returnValue += upperChar;

        }
        return returnValue;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scan.nextLine();
        System.out.println("Would you like to make your string lowercase or uppercase?");
        String lowerOrUpper = scan.nextLine();
        if (lowerOrUpper.equals("lowercase") || lowerOrUpper.equals("Lowercase")){
            System.out.println(myToLowerCase(input));
        }
        else if (lowerOrUpper.equals("uppercase") || lowerOrUpper.equals("Uppercase")){
            System.out.println(myToUpperCase(input));
        }
        else
            System.out.println("Wrong input, try again.");
        



        
    }
}
