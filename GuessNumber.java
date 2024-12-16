import java.util.*;
class GuessNumber{
    public static void main(String[] args) {
        System.out.println("====== Welcome to Guess A Number Program. ======");
        System.out.println();
        System.out.println("Please Select a Number between 0-100.");
        Scanner sc = new Scanner(System.in);
        boolean ab = false;
        int no = (int)(Math.random()*(100));
        int count = 0;
        while(ab == false){
        int guess = sc.nextInt();
        if(guess == no){
            ab = true;
            System.out.println("You Guessed the Right Number.");
            System.out.println("your Right answer comes after " + count + " attempt.");
        }else if(guess >no){
            System.out.println("Your guessed Number is greater than Right Answer");
        } else{
            System.out.println("Your Guessed Number is Lower than Right Answer");
        }
        count++;
        }
    }
}