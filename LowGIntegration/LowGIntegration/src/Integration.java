import java.util.Scanner;

// Yoisi Kristy Low Gonzalez

//Program that helps document my French classes 
public class Integration {

	pubic static void main(String[] args){
		System.out.println("~Welcome to your French Brain~");
		System.out.println("What do you want to practice today?");
		System.out.println("Press 1 for numbers"); //Future menu
		
		//use boolean, int, double and string
		/*Documentation:
		 byte: 8-bit signed two's complement integer. Minimum value -128 and maximum 127.
		 Short: 16 bit signed two's complement integer. Minimum value -32768 and maximum 32767.
		 Int: 32-bit signed two's complement integer. Minimum value -231 and a maximum value of 231-1. Use for an unsigned integer.
		 Long: 64-bit two's complement integer. Minimum -263 and a maximum 263-1.
		 Float: 32-bit IEEE 753 floating point. 
  		 Double: 64 bit IEEE 754 floating point.  
  		 Boolean: true and false. Represents one bit info.
  		 String: Strings are a sequence of characters. Strings are objects.
		 */
		final double NUMDECIMAL = 18.53; //Constant decimal
		final int NUMPRACTICE = 7; //Constant number 
		String v= "VRAI";
		int numPractice = 5;
		String numSeven = "sept";
		String getNumber;
		String answer;
		String answUp;
		String greeting = "salut";
		int numLetters;
		double operation;
		
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		System.out.println("You have picked: " + option);		
		if (option==1) {
			System.out.println("Let\'s start with numbers!"); //Escape sequence single quote
			
			//Write the numbers in french
			System.out.println("Comment dit-on " + NUMPRACTICE + " en Fran\u00E7ais?"); //Escape sentence c cedille
			scan.nextLine(); 
			getNumber = scan.nextLine();
			//compareTo method, compares to strings to see if they are equal. If they are equal returnns the value 0
			if(numSeven.compareTo(getNumber) == 0){
				System.out.println("Tr\u00E8s bien!");
			}
			else {
				System.out.println("Non, c\'est sept.");
			}
			
			//True or False.
			System.out.println(NUMDECIMAL + "en Fran\u00E7ais c\'est dix- huit et cinquante-trois. Vrai ou Faux?");
			//scan.nextLine(); 
			answer = scan.nextLine();
			answUp = answer.toUpperCase(); //toUpperCase() method converts al the letters of a string to Upper Case 
			System.out.println("Hello");
			/*if(answUp.equals(v)) {
				System.out.println("Super!");
			}
			else {
				System.out.println("Non, c\'est Vrai.");
			}*/
			
			//Number of letters in a word
			System.out.println("Combien de lettres le mot " + greeting +" a-t-il?"); 	
			String nLet = scan.nextLine();
			numLetters= Integer.parseInt(nLet); //Converts a string to an int
			if(greeting.length()==numLetters) { // String length() method to know the number of letters on the greeting string 
				System.out.println("Pas mal!");
			}
			else {
				System.out.println("Non, la bonne reponse est " + greeting.length() + ".");
			}
			
			//Operations
			System.out.println("Quel est le r�sultat de sept divis� par cinq"); //Division 7/5
			String op1 = scan.nextLine();
			= Integer.parseInt(op1);
			if()
			
			scan.close();
			
		}

	}
}


