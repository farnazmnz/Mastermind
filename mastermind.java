package mastermind;
//library for calculate random
import java.util.Random;
//library for achieve input 
import java.util.Scanner;

public class mind {
    
public static void main(String[] args) throws InterruptedException {
//tell the rules of the game
    System.out.println("\t hello!");
    System.out.println("welcome to mastermind");
    System.out.println("please read this text");
    System.out.println(" to play game first you should enter a number as the time you have chance\n second guess 5 colors until find the correct answer");
    System.out.println("at the time you are playing game you can exit and start again by enter 0 ;\n and you can see the answer for one second by enter 1 ");

//make 5 random number	
    Random rand = new Random();  
    int rand1 = rand.nextInt(8);
    int rand2 = rand.nextInt(8);
    int rand3=rand.nextInt(8);
    int rand4 = rand.nextInt(8);
    int rand5 = rand.nextInt(8);
 //make an array for colors   
    char[] Colors= {'R','B','P','Y','O','V','W','G' };
 //make an array to print the main answer
    char[] secret= {Colors[rand1], Colors[rand2],Colors[rand3],Colors[rand4],Colors[rand5]};
  //achieve how much time you want to play
    System.out.println("enter a number : ");
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    
  //the loop  for play 
    for(int i=0;i<n;i++){ 
     System.out.println("guess :");
        Scanner scanner=new Scanner(System.in);
        String input1;
        input1=scanner.next();
 //show the answer       
        if(input1.equals("1")) {
            System.out.print(secret);
            Thread.sleep(1000);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
 //play again       
        else if(input1.equals("0")) {
            System.out.println("\n\n\n\n\n\n\n\n\n");
            main(args);
        }
  //check guesses      
        else {
       //put the character of string in an array
            char[] ch = { input1.charAt(0),input1.charAt(1),input1.charAt(2),input1.charAt(3),input1.charAt(4)};
            int p=0;
          
          
            for(int j=0;j<5;j++) { 
            	boolean f=false;
           //check the the same colors in same place
            	if(ch[j]==secret[j]){
                    System.out.print("#");
                    p++;
                    
                }
            	//check the same colors in different place
                else if(ch[j]!=secret[j]){
                    for(int k=0;k<5;k++){
                        if(ch[j]==secret[k]&&k!=j){
                            System.out.print("+");
                            f=true;
                             
                        }
                    }
                    //show "-" for the colors that they aren't available in main answer
                     if(f==false)
                    System.out.print("-");
                    
                }
            }
            //tell you win after get 5 # and back to first of the game
            if(p==5)  
            	
            	
                System.out.print("that's right =)\n\nyou win\n\n enter 0 to play again");
        
        	  
        }//go to next line for getting new guess
        System.out.print("\n");
    }  //show the answer when all of the guess are false and play again
    System.out.print("the correct answer was : ");  
    System.out.print(secret);
    System.out.print("\n enter 0 to play again");
    		Scanner scan=new Scanner(System.in);
        String input2;
        input2=scan.next();
        if(input2.equals("0")) {
            System.out.println("\n\n\n\n\n\n\n\n\n");
            main(args);}
}
} 
