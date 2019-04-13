import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
  
// Yoisi Kristy Low Gonzalez

// Program that helps document my French classes
public class Integration {

  public static void main(String[] args) {

    System.out.println("~Welcome to your French Brain~");

    /*
     * //use boolean, int, double and string /*Documentation: byte: 8-bit signed two's complement
     * integer. Minimum value -128 and maximum 127. Short: 16 bit signed two's complement integer.
     * Minimum value -32768 and maximum 32767. Int: 32-bit signed two's complement integer. Minimum
     * value -231 and a maximum value of 231-1. Use for an unsigned integer. Long: 64-bit two's
     * complement integer. Minimum -263 and a maximum 263-1. Float: 32-bit IEEE 753 floating point.
     * Double: 64 bit IEEE 754 floating point. Boolean: true and false. Represents one bit info. String:
     * Strings are a sequence of characters. Strings are objects.
     */
    final double NUMDECIMAL = 18.53; // Constant decimal
    final int numPractice = 7; // Constant number
    String[] counterArray = {"zero", "un", "deux", "trois", "quatre", "cinq",
        "six", "sept", "huit", "neuf", "dix", "onze", "doze", "treize", "quatorze"};
    String nextCount;
    String numSeven = "sept";
    String getNumber;
    String answer;
    String answUp;
    String greeting = "salut";
    int numLetters;

    /*
    Car myCar = new Car("Y");
    Car myOtherCar = new Car("Tesla", "S");
    System.out.println(myCar.getInfo());
    */
    
    Student stud1 = new Student("Kristy", 24, "Sophmore", "Venezuela");
    System.out.println(stud1.getInfo());
   
    // Menu
    int keepL;
    boolean keepLearning = true;

    // Operations
    int limit = 20;
    int num1 = 1;
    int rand;

    // Famille
    String nameF;
    String[] famMasculin =
        {"Pere", "Frere", "Oncle", "Neveu", "Cousin", "Fils"};
    String[] famFemale =
        {"mere", "soeur", "tante", "niece", "cousine", "fille"};
    
    //Min et plus
    int[] minPlus = {100, 30, 54, 2, 45, 7}; // one-dimensional array
    int value = 4; 

    while (keepLearning) {
      displayMenu();
      Scanner scan = new Scanner(System.in);
      int option = scan.nextInt();

      switch (option) {// switch statement
        case 1:
          System.out.println("You have picked" + option + "Numbers");
          System.out.println("Let\'s start with numbers!");// Escape sequence single quote
          displayCounter(counterArray);// Counter method and a String array as the argument
          System.out.println("You try! Complete the sequence");
          scan.nextLine();
          int j = 0;

          // do while
          do {
            System.out.println(counterArray[j]);
            nextCount = scan.nextLine();
            if (!(nextCount.toLowerCase().equals(counterArray[j += 1]))) {// +=
              System.out.println("Faux. C\'est " + counterArray[j]);
              break; // ends the loop immediately and the program continues with the next statements
            } else {
              System.out.println("Vrai!");
            }
            j++;// ++ increment by 1
          } while (j <= 10);

          // Escape sentence c cedille
          System.out
              .println("Comment dit-on " + numPractice + " en Fran\u00E7ais?");

          // scan.nextLine();
          getNumber = scan.nextLine();
          // compareTo method, compares to strings to see if they are equal. If they are equal 
          //returns the value 0
          if (numSeven.compareTo(getNumber) == 0) {// if else construct
            System.out.println("Tr\u00E8s bien!");
          } else {
            System.out.println("Non, c\'est sept.");
          }

          System.out.println(NUMDECIMAL + "en Fran\u00E7ais c\'est dix- huit et "
                  + "cinquante-trois. Vrai ou Faux?");
          answer = scan.nextLine();
          answUp = answer.toUpperCase();// toUpperCase() method converts all the letters of a
          // string to Upper Case

          if (answUp.contentEquals("VRAI")) {
            System.out.println("Super!");
          } else {
            System.out.println("Non, c\'est Vrai.");
          }

          System.out
              .println("Combien de lettres le mot " + greeting + " a-t-il?");
          String nLet = scan.nextLine();
          numLetters = Integer.parseInt(nLet); // Converts a string to an int
          if (greeting.length() == numLetters) { // String length() method to know the number of
                                                 // letters on the greeting string
            System.out.println("Pas mal!");
          } else {
            System.out.println(
                "Non, la bonne reponse est " + greeting.length() + ".");
          }
          break;// Terminates immediately the switch statement
        case 2:
          System.out.println("You have picked: " + option + " Operations");
          System.out.println("Enter a number(1-100) to start the operation");
          num1 = scan.nextInt();

          // Relational operator >= and Conditional op &&
          while (num1 >= 0 && num1 <= 100) { // while loop
            rand = getRan(limit);
            System.out.println("Your number is: " + num1);
            System.out.println("Your random number is: " + rand);
            operationAdd(num1, rand);
            operationSub(num1, rand);
            operationMult(num1, rand);
            operationDiv(num1, rand);
            operationRes(num1, rand);
            operationSqrt(num1);
            System.out.println("Enter a different number: ");
            num1 = scan.nextInt();
          }
          System.out.println("Sorry, that\'s not an option");
          break;

        case 3:
          System.out.println("You have picked: " + option + "Famille");
          scan.nextLine();
          // for loop
          for (int i = 5; i >= 0; i--) {
            System.out.println(famMasculin[i]);
            System.out.println("Enter the female equivalence ");
            nameF = scan.nextLine();
            if (nameF.toLowerCase().equals(famFemale[i])) {
              System.out.println("Vrai!");
              continue; // skips the next statement(quote) and decrements i
            } else {
              System.out.println("Faux. The answer is: " + famFemale[i]);
            }
            System.out.println("la pratique fait le maître");
          }
          break;
        case 4:
          System.out
              .println("You have picked: " + option + "Introductory dialogue");
          System.out.println("Coming soon! For PSI3");
          break;
        case 5:
          System.out.println("You have picked: " + option + "Adjectives");
          getNotes(); // Method call, no arguments.
          break;
        case 6:
          System.out.println("Min et plus");
          int arrayMin = findMin(minPlus);
          System.out.println("The smallest number of the array is: " + arrayMin);
          int index = findIndex(minPlus, arrayMin);
          System.out.println("The index of the min value in the array is: " + index);
          int arraySum = findSum(minPlus);
          System.out.println("The sum of the array is: " + arraySum);
          break;
        case 7:          
          City[] vacance1 = new City[3];
          Chamonix cham = new Chamonix();
          Nice nic = new Nice();
          Paris par = new Paris();
               
          vacance1[0] = cham;
          vacance1[1] = nic;
          vacance1[2] = par;
          
          for(City i: vacance1) {// loop the entire array
            i.doActivities();  
          }
          break;
        case 8:
          ArrayList<String> mois = new ArrayList<String>();
          //add months
          mois.add("janvier");
          mois.add("fevrier");
          mois.add("mars");
          mois.add("avril");
          mois.add("mai");
          mois.add("juin");
          mois.add("juillet");
          mois.add("aout");
          mois.add("septembre");
          mois.add("octobre");
          mois.add("novembre");
          mois.add("decembre");
          
          //enhanced for loop
          for(String i: mois) {
        	  System.out.println(i);
          }
          
          //get a value from the array
          System.out.println("What is the first month of the year in french?");
          System.out.println(mois.get(0));
          break;
        case 9:
          System.out.println("Countries and their respective article in French");
         
        //Two dimensional array
          String pays[][] = { {"la", "France", "Belgique", "Norvege", "Pologne", "Suisse"}, 
            {"l", "Allemagne", "Anglaterre", "Autriche", "Espagne", "Italie"},
            {"le", "Venezuela", "Royaume-Uni", "Portugal", "Chile", "Mexique"},
            {"les", "Etats Unis", "Pays-Bas", "iles Galapagos", "iles Malouines", "Maldives"}
          };
          for (int row = 0; row < 4; row++) {
            for(int column = 0; column < 6; column++) {
            	System.out.println(pays[row][column] + " ");            	
            }
            System.out.println();
          }
          
          System.out.println("Where is the position of The United States in the array?");
          for (int row = 0; row < 4; row++) {
            for(int column = 0; column < 6; column++) {
              if(pays[row][column] == "Etats Unis") {
                System.out.println("Its position is row: " + row + " and column: " + column);
                System.out.println("Its article is: " + pays[row][0]);
              }                
            }
          }
          break;
        default:
          System.out.println("Not a possible option");
          break;       
      }
      System.out.println("Do you want to continue learning?");
      System.out.println("Yes:1 OR No:0");
      System.out.println("Enter your answer: ");

      keepL = scan.nextInt();
      keepLearning = keepL == 0 ? false : true;// ternary construct
    }
  }

  public static void displayMenu() { // header parameter: void
    System.out.println("What do you want to  practice today");
    System.out.println("============MENU=========");
    System.out.println("1. Numbers");
    System.out.println("2. Operations");
    System.out.println("3. Famille");
    System.out.println("4. Introductory Dialogue");
    System.out.println("5. Adjectives");
    System.out.println("6. Minimo et plus");// Max and sum of an array
    System.out.println("7. Vacances");
    System.out.println("8. Mois");
    System.out.println("9. Pays");
  }

  public static void displayCounter(String[] counter) {// header: the top line of a method
    // parameters: list of inputs w/ data type
    for (String i: counter) { //Enhanced for loop
      System.out.println(i);
    }
  }

  // method w/ arguments and return value
  public static int getRan(int limit) {
    Random randomNum = new Random();// Random class
    int numb = randomNum.nextInt(limit);
    return numb;
  }

  public static void operationAdd(int na1, int na2) {
    int resultadd = na1 + na2;
    System.out.println("----------Plus----------");
    System.out.println(na1 + " + " + na2 + " = " + resultadd);
    System.out.println(na1 + " plus " + na2 + " font " + resultadd);
  }

  public static void operationSub(int ns1, int ns2) {
    int resultsub = ns1 - ns2;
    System.out.println("----------Moins----------");
    System.out.println(ns1 + " - " + ns2 + " = " + resultsub);
    System.out.println(ns1 + " moins " + ns2 + " font " + resultsub);
  }

  public static void operationMult(int nm1, int nm2) {
    int resultmult = nm1 * nm2;
    System.out.println("----------Multiplication----------");
    System.out.println(nm1 + " x " + nm2 + " = " + resultmult);
    System.out.println(nm1 + " multiplie par " + nm2 + " est " + resultmult);
  }

  public static void operationDiv(int nd1, int nd2) {
    double resultdiv = ((double) nd1) / nd2; // make it a double2
    System.out.println("----------Division----------");
    System.out.println(nd1 + " / " + nd2 + " = " + resultdiv);
    System.out.println(nd1 + " divise par " + nd2 + " est " + resultdiv);
  }

  public static void operationRes(int nr1, int nr2) {
    int resultres = nr1 % nr2;
    System.out.println("----------Residue----------");
    System.out.println("The residue from the division of " + nr1
        + " divided by " + nr2 + " = " + resultres);
    System.out.println(
        "Le residue du " + nr1 + " divise par " + nr2 + " est " + resultres);
  }

  public static void operationSqrt(int nsq1) {
    double resultsqrt = Math.sqrt(nsq1);
    System.out.println("----Racine Carree----------");
    System.out.println(" The square root of " + nsq1 + " = " + resultsqrt);
    System.out.println("La racine carree de " + nsq1 + " est " + resultsqrt);
  }

  /*
   * Operator precedence: All binary operators except for the assignment operators are evaluated from
   * left to right; assignment operators are evaluated right to left. Postfix unary, multiplicative,
   * additive, shift, relational, equality, bitwise AND, bitwise exclusive OR, bitwise inclusive OR,
   * logical AND, logical OR, ternary, and assignment.
   */

  /*
   * When using == to compare objects, what it does is compare the allocation in memory of the two
   * objects. For that reason when we want to compare the content of an object we use the methods
   * compareTo() or equals()
   */
  
  /*
   * Static 
   */
  
  /*
    Inheritance: is a mechanism in which one object acquires all the properties and behaviors of a 
    parent object.
    Benefits:
    - It Allows the code to be reused as many times as needed. 
	- The base class once defined and once it is compiled, it need not be reworked.
	- Saves time and effort as the main code need not be written again.
   */

  public static void getNotes() {// method void parameters and void return
    System.out.println("Endings");
    System.out.printf("%-10s%s\n", "Masculin", "Feminin");
    System.out.printf("%-10s%s\n", "eux", "euse");
    System.out.printf("%-10s%s\n", "eur", "euse");
    System.out.printf("%-10s%s\n", "if", "ive");
    System.out.printf("%-10s%s\n", "e", "e");
  } 
  
  public static int findMin(int[] numArray) {
    int smallest = numArray[0];
	  for(int i = 1; i < numArray.length; i++) {
		if (numArray[i] < smallest) {
			smallest = numArray[i];
		}
	  }
	  return smallest;
    }

  public static int findSum(int[] numArray) {
	  int sum = 0;
	  for(int i = 1; i < numArray.length; i++) {
		sum = sum + numArray[i];
	  }
	  return sum;
  }

  public static int findIndex(int[] numArray, int number) {
    int index = 0;
    for (int i = 0; i < numArray.length; i++) {
      if(number == numArray[i]) {
        index = i;
      }
    }
    return index;
  }
}


  
