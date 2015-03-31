package junk2;

import java.util.Scanner;

public class face {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
			int computerNum;
			int playerNum;
			
			
		computerNum = 0 + (int)(Math.random()*10);
		
		System.out.print("Enter your guess between 0 and 10: ");
		playerNum= input.nextInt();
		
		if((playerNum >=0)&&(playerNum <= 10))
		   {
				boolean guessedTooLow = (computerNum>playerNum);
				boolean guessedTooHigh = (computerNum<playerNum);
				boolean guessedCorrect = (computerNum==playerNum);
				
		
				if (guessedCorrect==true){
						System.out.printf("%s%d%s%d%s","The computer guessed ",computerNum," You guessed ",playerNum,", you guessed correct!\n");}
				
				else if (guessedTooLow== true){
					System.out.printf("%s%d%s%d%s","The computer guessed ",computerNum," You guessed ",playerNum,", you guessed too low!\n");}
				
				else if (guessedTooHigh ==true){
					System.out.printf("%s%d%s%d%s","The computer guessed ",computerNum," You guessed ",playerNum,", you guessed too high!\n");}
	
			
				
		   }
		    
			else
				System.out.print("You have entered an invalid number");
		}
}
