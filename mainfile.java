package GuessNumber;
import java.util.Scanner;
class mainfile{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);// scanner object
        char response;// define response
        System.out.println("Rule of the game: l for lower, h for higher, c for correct.");
        do{
            playOneGame();// helping function. 
            System.out.print("Continue to play? (y/n) ");
            response = scan.next().charAt(0); // user input. 
            
        }while(response == 'y');// function always perform at least once.if user input is y,  it loop one more time. 

        System.out.println("Thank you. Good Luck. Bye");
        scan.close();
    }
        
    public static void playOneGame(){
        int count = 0;// define count
        char response;// define response
        GuessNumber randomNum = new GuessNumber(1,100); // use GuessNumber object
        Scanner scan = new Scanner(System.in);// use Scanner object
        do{
            System.out.print("Is " + randomNum.getCurrentGuess() + " a correct number? ");
            response = scan.next().charAt(0);// user input
            if(response == 'h'){ // when user input is h, it excute this block
                randomNum.higher(); //excute the higher function in class GuessNumber
            }else if(response == 'l'){// when user input is l, it excute this block
                randomNum.lower();//excute the lower function in class GuessNumber
            }
            count += 1;// count the time this do block runs

        } while(response != 'c');// run at least one time. exit the loop when user input is c
        
    System.out.println("The robot has guessed "+count+" times");
    
    }

}