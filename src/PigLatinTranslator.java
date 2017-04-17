import java.util.Scanner;

public class PigLatinTranslator {

    public static void main(String[] args) {

        //Welcome message
        System.out.println("Welcome to the Pig Latin Translator");

        //Enter a word
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word to be translated: ");
        String englishWord = scan.nextLine();
        String pigWord;

        //Convert word to lower case
        englishWord = englishWord.toLowerCase();
        System.out.println(englishWord);

        if(beginsWithVowel(englishWord)){
            pigWord = englishWord.concat("way");
            System.out.println(pigWord);
        }
        else {
            int i = findFirstVowel(englishWord);
            if (i == -1){                            // No vowels, print word as is
                System.out.println(englishWord);
            }
            else {
                String beginningLetters = englishWord.substring(0, i);
                String endingLetters = englishWord.substring(i, englishWord.length());
                pigWord = endingLetters.concat(beginningLetters).concat("ay");
                System.out.println(pigWord);
            }
        }
    }

        //Method determines if word begins with vowel
        public static boolean beginsWithVowel (String englishWord) {
            String vowels = "aeiou";
            char letter = englishWord.charAt(0);
            return (vowels.indexOf(letter) != -1);
        }

        //Method determines where the first vowel is
        public static int findFirstVowel (String englishWord){
            String vowels = "aeiou";
            for (int i = 1; i < englishWord.length(); i++){
                String letter = englishWord.substring(i, i + 1);
                if (vowels.contains(letter)){
                    return i;
                }
            } return -1;
        }
}

