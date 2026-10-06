import java.util.Scanner;

public class PalindromeSentence18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String clean = "";

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                clean = clean + Character.toLowerCase(ch);

                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        vowels++;
                    else
                        consonants++;
                }
                else if (Character.isDigit(ch)) {
                    digits++;
                }
            }
            else if (!Character.isWhitespace(ch)) {
                special++;
            }
        }

        String reverse = "";

        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse = reverse + clean.charAt(i);
        }

        if (clean.equals(reverse))
            System.out.println("Palindrome: Yes");
        else
            System.out.println("Palindrome: No");

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);

        sc.close();
    }
}