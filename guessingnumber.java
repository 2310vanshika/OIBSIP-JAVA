import java.util.Scanner;
public class guessingnumber {
    // Java program for the above approach
        public static void guessingNumberGame()
        {
            System.out.println("game rules are :");
            System.out.println("1. If score = 100 , you won the game");
            System.out.println("2. If score = 0 , you loose the game");
            int score = 0;
            // Scanner Class
            Scanner sc = new Scanner(System.in);

            // Generate the numbers
            int number = 1 + (int)(100 * Math.random());

            // Given K trials
            int K ;
            System.out.println("enter the number of trails in which you can guess the number");
            K=sc.nextInt();

            int i, guess;

            System.out.println(
                    "A number is chosen"
                            + " between 1 to 100."
                            + "Guess the number"
                            + " within choosen number of  trials.");


            for (i = 0; i < K; i++) {

                System.out.println(
                        "Guess the number:");
                guess = sc.nextInt();



                if (number == guess) {
                    System.out.println(
                            "Congratulations!"
                                    + " You guessed the number correct");
                    score=score+100;
                    System.out.print("score is : " + score);
                    break;
                }
                else if (number > guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is "
                                    + "greater than " + guess);
                }
                else if (number < guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is"
                                    + " less than " + guess);
                }
            }

            if (i == K) {
                System.out.println(
                        "You have exhausted"
                                + " K trials.");

                System.out.println(
                        "The number was " + number);
                System.out.println("your score=0, you loose the game");
            }
        }


        public static void main(String arg[])
        {


            guessingNumberGame();
        }
    }


