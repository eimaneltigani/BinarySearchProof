import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinarySearchProof {
     
    static Random rand = new Random();

    public static int randomGuesser(int min, int max, int magicNumber) {
        List<Integer> pickedNumbers = new ArrayList<Integer>();
        int guess = rand.nextInt((max - min) + 1) + min;
        int guesses = 0;

        do {
            guess = rand.nextInt((max - min) + 1) + min;

            if (!pickedNumbers.contains(guess)) {
                guesses+=1;
                pickedNumbers.add(guess);
            }

        } while (guess!=magicNumber);

        return guesses;

    }

    public static int highLowGuesser(int min, int max, int magicNumber) {
        int guesses = 0;
        int guess = rand.nextInt((max - min) + 1) + min;

        do {
            guess = rand.nextInt((max - min) + 1) + min;
            if (guess > magicNumber) {
                max = guess;
                guesses+=1;
            } else {
                min = guess;
                guesses+=1;
            }
        } while (guess!=magicNumber);

        return guesses;
    } 

    public static void main(String[] args) throws Exception {
        //Pick a random number and rub both randomGuesser and highlowGuess
        //atleast 20 times, find and output the average number of tries it takes 
        //for each method to reach the outcome
    
        int magicNum = rand.nextInt(500 + 1);
        int averageRandomGuesses = 0;
        int averageHighLowGuesses = 0;
        for (int i = 0; i<=20; i++) {
            averageRandomGuesses += randomGuesser(0, 500, magicNum);
        }
        for (int i = 0; i<=20; i++) {
            averageHighLowGuesses += highLowGuesser(0, 500, magicNum);
        }

        int randomResult = averageRandomGuesses/20;
        int binaryResult = averageHighLowGuesses/20;
        System.out.println("It took the randomGuesser an average of " + randomResult + " tries to guess the magic number.");
        System.out.println("It took the highlowGuesser an average of " + binaryResult + " tries to guess the magic number.");

    }
}
