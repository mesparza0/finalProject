import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TypeGrid {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		try (Scanner scan = new Scanner(System.in)) {
			double start = 0;
			double end;
			double elapsedTime;
			double seconds;
			int numOfCharacters;
			int wpm;

			// Create arrays for easy and hard mode words
			String wordEasy[] = { "act ", "and ", "any ", "bug ", "but ", "bye ", "cog ", "con ", "cry ", "cut ",
					"day ", "ear ", "eat ", "eel ", "egg ", "ego ", "elf ", "elk ", "eye ", "fed ", "few ", "fit ",
					"fog ", "for ", "fun ", "fur ", "get ", "gut ", "guy ", "had ", "has ", "hat ", "her ", "him ",
					"his ", "hit ", "icy ", "ill ", "ink ", "its ", "kit ", "lap ", "leg ", "let ", "lid ", "lie ",
					"lip ", "log ", "man ", "map" };

			String wordHard[] = { "abuse ", "admit ", "adult ", "after ", "again ", "agent ", "agree ", "alibi ",
					"alive ", "allow ", "apple ", "balmy ", "beach ", "begin ", "beige ", "belly ", "bench ", "blame ",
					"blind ", "blame ", "brain ", "break ", "breed ", "brief ", "bring ", "brink ", "broad ", "brown ",
					"brush ", "build ", "built ", "buyin ", "canny ", "carry ", "catch ", "chain ", "chair ", "chalk ",
					"chant ", "china ", "climb ", "clink ", "close ", "cloth ", "clown ", "coast ", "comic ", "cooky ",
					"craft ", "crazy " };
			// Prompt the user to choose a difficulty level
			// Prompt the user to choose a difficulty level
			System.out.print("Do you want to play hard(2) or easy(1) mode? Enter: ");
			int userAnswer = scan.nextInt();

			// Consume the newline character in the input stream
			scan.nextLine();

			if (userAnswer == 1) {
				System.out.print("\nYou selected Easy!\n");
				System.out.println('3');
				TimeUnit.SECONDS.sleep(1);
				System.out.println('2');
				TimeUnit.SECONDS.sleep(1);
				System.out.println('1');
				TimeUnit.SECONDS.sleep(1);
				// The user selected easy mode, generate random words from the easy mode array
				for (int i = 0; i < 10; i++) {
					System.out.print(wordEasy[rand.nextInt(wordEasy.length)] + " ");
				}

			} else if (userAnswer == 2) {
				System.out.print("\nYou selected HARD! I see you like a challenge!\n");
				System.out.println('3');
				TimeUnit.SECONDS.sleep(1);
				System.out.println('2');
				TimeUnit.SECONDS.sleep(1);
				System.out.println('1');
				TimeUnit.SECONDS.sleep(1);
				// The user selected hard mode, generate random words from the hard mode array
				for (int i = 0; i < 10; i++) {
					System.out.print(wordHard[rand.nextInt(wordHard.length)] + " ");
				}
			}

			start = LocalTime.now().toNanoOfDay();

			// Prompt the user to type the sequence of words
			System.out.println("\nCopy: ");
			String userInput = scan.nextLine().trim();

			end = LocalTime.now().toNanoOfDay();
			elapsedTime = end - start;
			seconds = elapsedTime / 1000000000;

			// Use the userInput variable instead of typedWords
			numOfCharacters = userInput.length();
			wpm = (int) ((((double) numOfCharacters / 5) / seconds) * 60);
			System.out.print("\nYour WPM is " + wpm + "!");
		}

	}

}
