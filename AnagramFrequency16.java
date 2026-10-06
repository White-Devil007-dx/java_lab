import java.util.Scanner;

public class AnagramFrequency16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        if (java.util.Arrays.equals(a, b))
            System.out.println("Anagram: Yes");
        else
            System.out.println("Anagram: No");

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        String words[] = sentence.split(" ");

        System.out.println("Word Frequencies:");

        for (int i = 0; i < words.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                int count = 0;

                for (int j = 0; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j]))
                        count++;
                }

                System.out.println(words[i] + ": " + count);
            }
        }

        sc.close();
    }
}