package GuessNumber;
import java.util.Random;;

public class GuessNumber {
    //Class instances 
    private int high;
    private int low;
    private int currentGuess;
    private Random random; //create a Random object

   //constructor for GurssNumber class
    public GuessNumber(int low, int high){
        this.high = high;// pass high from outside to this class's high
        this.low = low;// pass low from outside to this class'slow
        random = new Random();//use a Random object
    }
    //setter
    public void higher(){
        low = getCurrentGuess() + 1; //if need to get a higher value, the lowest number needs to get higher. plus 1 because lowest number need to get least one higher than the previous lowest in order to make the function works. 
    }
    //setter 
    public void lower(){
        high = getCurrentGuess() - 1;//if need to get a lower value, the highest number needs to get lower. subtract 1 because highest number need to get least one lower than the previous highest in order to make the function works. 
    }

    public int getCurrentGuess(){
        if(currentGuess < low || currentGuess > high){ // need to set the currentGuess in the range between low and high. not just some random number. then it will set the random currentGuess. Like if we did not run setter higher or lower, currentGuess would stay the same. 
            currentGuess = low + random.nextInt(1 + (high-low));// generate currentGuess. random.nextInt(Number) output 0 to Number - 1, so I need to add one to it. 
        }
        return currentGuess;
    }

   


}
