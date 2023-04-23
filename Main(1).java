/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in); //scanner for the console inputs
	    Random rand = new Random();
	    int randomNum;
	    int i;
	    
	    //random character
	    System.out.print("Your character is ");
	    int temp = rand.nextInt(4);
	    if(temp % 2 == 0)
	        if(temp == 0)
	            System.out.println("Ironclad");
	        else System.out.println("Defect");
	    else {
	        if(temp == 1)
	            System.out.println("Silent");
	        else System.out.println("Watcher");
	    }
	    
	    //grab number of modifiers
	    System.out.println("Enter Number of Modifiers:\n(0 chooses a random number, and if you choose a number higher than 11 choose random)");
	    int mods = in.nextInt();
	    
	    
		System.out.println("1: Easy\n2: Medium\n3: Hard\n4: Random");
		temp = in.nextInt();
		if(mods == 0)
		    if(temp == 4)
	            mods = rand.nextInt(33) + 1;
	        else mods = rand.nextInt(11) + 1;
		
		switch(temp) {
		    case(1) :
		        String[] outputArr1 = {"All Star", "Diverse", "Red Cards", "Green Cards", "Blue Cards", "Purple Cards", "Colorless Cards", "Heirloom", "Time Dilation", "Flight", "My True Form"};
		        int[] usedArr1 = {0,0,0,0,0,0,0,0,0,0,0};
		        for(i = 0; i < mods;)
		        {
		            randomNum = rand.nextInt(11);
		            if(usedArr1[randomNum] == 0)
		            {
		                usedArr1[randomNum] = 1;
		                System.out.println(outputArr1[randomNum]);
		                i++;
		            }
		        }
		        break;
		    case(2) :
		        String[] outputArr2 = {"Draft", "Sealed Deck", "Hoarder", "Insanity", "Chimera", "Praise Snecko", "Shiny", "Specialized", "Vintage", "Controlled Chaos", "Inception"};
                int[] usedArr2 = {0,0,0,0,0,0,0,0,0,0,0};
		        for(i = 0; i < mods;)
		        {
		            randomNum = rand.nextInt(11);
		            if(usedArr2[randomNum] == 0)
		            {
		                usedArr2[randomNum] = 1;
		                System.out.println(outputArr2[randomNum]);
		                i++;
		            }
		        }
                break;
            case(3) :
                String[] outputArr3 = {"Deadly Events", "Binary", "One Hit Wonder", "Cursed Run", "Big Game Hunter", "Lethality", "Midas", "Night Terrors", "Terminal", "Certain Future", "Starter Deck"};
                int[] usedArr3 = {0,0,0,0,0,0,0,0,0,0,0};
		        for(i = 0; i < mods;)
		        {
		            randomNum = rand.nextInt(11);
		            if(usedArr3[randomNum] == 0)
		            {
		                usedArr3[randomNum] = 1;
		                System.out.println(outputArr3[randomNum]);
		                i++;
		            }
		        }
                break;
            case(4) :
                String[] outputArr4 = {"All Star", "Diverse", "Red Cards", "Green Cards", "Blue Cards", "Purple Cards", "Colorless Cards", "Heirloom", "Time Dilation", "Flight", "My True Form", "Draft", "Sealed Deck", "Hoarder", "Insanity", "Chimera", "Praise Snecko", "Shiny", "Specialized", "Vintage", "Controlled Chaos", "Inception", "Deadly Events", "Binary", "One Hit Wonder", "Cursed Run", "Big Game Hunter", "Lethality", "Midas", "Terminal", "Certain Future", "Starter Deck"}; 
		        int[] usedArr4 = {0,0,0,0,0 ,0,0,0,0,0 ,0,0,0,0,0 ,0,0,0,0,0 ,0,0,0,0,0 ,0,0,0,0,0 ,0,0,0};
		        for(i = 0; i < mods;)
		        {
		            randomNum = rand.nextInt(32);
		            if(usedArr4[randomNum] == 0)
		            {
		                usedArr4[randomNum] = 1;
		                System.out.println(outputArr4[randomNum]);
		                i++;
		            }
		        }
		        break;    
		}
		
		
		
	}
}


