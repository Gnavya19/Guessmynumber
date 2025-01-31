import java.util.Scanner;
public class Guessmynum{
    public static void main(String[] args) {
        int numbertoguess=(int)
        (Math.random()*100)+1;
        int userguess = 0;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");
        while(userguess !=numbertoguess){
            System.out.print("Enter your guess:");
            userguess=Scanner.nextInt();
            if(userguess<numbertoguess){
                System.out.println("Too low! Try again.");
            }
            else if(userguess>numbertoguess){
                System.out.println("Too high! Try again.");
            }else{
                System.out.println("Congratulations! You guessed the number.");
           }
      }
      Scanner.close();
    }
}