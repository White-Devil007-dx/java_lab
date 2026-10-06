class SentenceUtility {
    static final String DELIMITER = " ";

    String sentence;

    SentenceUtility() {
        sentence = "";
    }

    SentenceUtility(String sentence) {
        this.sentence = sentence;
    }

    static String reverseWords(String sentence) {
        String words[] = sentence.split(DELIMITER);
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0)
                result.append(DELIMITER);
        }

        return result.toString();
    }

    void display() {
        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reverseWords(sentence));
    }
}

public class SentenceWordReverse17 {
    public static void main(String[] args) {
        SentenceUtility s1 = new SentenceUtility();
        SentenceUtility s2 = new SentenceUtility("Java is fun");

        s2.display();
    }
}