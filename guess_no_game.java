import java.util.*;
public class guess_no_game {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int minRange=1;
        int maxRange=100;
        int maxAttempts = 10;
        int score=0;
        boolean playAgain=true;
        while(playAgain){
            int targetNumber =random.nextInt(maxRange-minRange+1) + minRange;
            System.out.println("Welcome to the Number Game!");
            System.out.println("I have selected a number between" +minRange+ "and" +maxRange+".Try  to guess it");
            int attempts =0;
            while(attempts<maxAttempts){
                System.out.print("Enter your guess Number :");
                int userGuess =scanner.nextInt();
                attempts++;
                if(userGuess < targetNumber){
                    System.out.println("Too Low!Try Again");
                }else if(userGuess > targetNumber){
                    System.out.println("Too high!Try Again.");
                }else{
                    System.out.println("Congratulations!you have guessed the number \t \t" + targetNumber + "\tin \t " +attempts+ "\tattempts");
                    score+= maxAttempts =attempts+1;
                    break;
                }
            }
            if(attempts== maxAttempts){
                System.out.println("Sorry you have reached the maximum number of attempts.The correct number is:"+targetNumber);
            }
            System.out.print("Do u want to play again?(yes/no:)");
            String playAgainResponse=scanner.next().toLowerCase();
            playAgain=playAgainResponse.equals("yes");
        }
        System.out.println("Thanks for playing!your total score is"+score);
    }
}