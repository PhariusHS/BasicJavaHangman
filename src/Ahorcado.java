import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String secretWord = "rivotril";
        int maxTrys = 10;
        int Trys = 0;
        Boolean isGuessed = false;

        char[] guessedLetters = new char[secretWord.length()];

        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        while (!isGuessed && Trys < maxTrys) {
            System.out.println("Word: " + String.valueOf(guessedLetters));

            System.out.print("Put a letter: ");
            char letter = Character.toLowerCase(scanner.next().charAt(0));

            Boolean isCorrect = false;

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    guessedLetters[i] = letter;
                    isCorrect = true;
                }
            }

            if (!isCorrect) {
                Trys++;
                System.out.println("Incorrect, you have " + (maxTrys - Trys) + " trys left.");
            }

            if (String.valueOf(guessedLetters).equals(secretWord)) {
                isGuessed = true;
                System.out.println("Congratulations, you win, the word was: " + secretWord);
            }

        }

        if (!isGuessed) {
            System.out.println("Game over.");
        }

        scanner.close();

    }
}
