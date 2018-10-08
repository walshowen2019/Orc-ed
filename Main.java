import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Random rand = new Random();
    	
    	System.out.print("Input your intelligence, which must be a number between 10-30: ");
    	int INT = scan.nextInt();
    	
    	double baseDmg = INT*5;
    	double dmgModifier = 0;
    	double totalArray[];
    	totalArray = new double[10];

    	int i = 0;
	    	// Assigns multiplier and calculates actual damage
	    	for (i = 0; i < totalArray.length; i++) {
	    		dmgModifier = Math.random()+0.5;
	    		double actualDmg = dmgModifier*baseDmg;
	    		totalArray[i] = actualDmg;
	    	}
	    	
	    	// Adds all hits
	    	double totalDmg = 0;
	    	for (i = 0; i < totalArray.length; i++) {
	    		totalDmg += totalArray[i];
	    	}
	    	System.out.println("You hit the Orc for " + totalDmg + " damage");
	    	
   
    }
}
