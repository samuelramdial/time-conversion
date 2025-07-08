/**
@author Ramdial, Samuel "Sam" - ITSC 1212 - 005 - von Briesen
@version 2.0
@since 09/25/2021

Project 2 - Modules 1 - 4 - Whimsical Times 
Complete the five methods so that when Time Conversion runs there's enough logic to conver the inputted seconds to non-conventional time units. 
Utilize a scanner to allow user input for seconds, as well as a greeting. 
*/
import java.util.Scanner;

public class ConversionDriver_SlyRobin 
{

    public static void main(String[] args) 
    {

        // statements for output formatting
        String banner = ":'######::'##:::::::'##:::'##::::'########:::'#######::'########::'####:'##::: ##:"
+ "\n" +
                        "'##... ##: ##:::::::. ##:'##::::: ##.... ##:'##.... ##: ##.... ##:. ##:: ###:: ##:"
+ "\n" +
                        " ##:::..:: ##::::::::. ####:::::: ##:::: ##: ##:::: ##: ##:::: ##:: ##:: ####: ##:"
+ "\n" +
                        ". ######:: ##:::::::::. ##::::::: ########:: ##:::: ##: ########::: ##:: ## ## ##:"
+ "\n" +
                        ":..... ##: ##:::::::::: ##::::::: ##.. ##::: ##:::: ##: ##.... ##:: ##:: ##. ####:"
+ "\n" +
                        "'##::: ##: ##:::::::::: ##::::::: ##::. ##:: ##:::: ##: ##:::: ##:: ##:: ##:. ###:"
+ "\n" +
                        ". ######:: ########:::: ##::::::: ##:::. ##:. #######:: ########::'####: ##::. ##:"
+ "\n" +
                        ":......:::........:::::..::::::::..:::::..:::.......:::........:::....::..::::..::";
        System.out.println("*******************************");
        System.out.println("Start - Time Conversion Program");
        System.out.println("*******************************");

        // variable to store user input
        int numSeconds;
        String name;
        /**
         * TO DO: ask the user to enter the number of seconds to be converted 
         * and assign the value to numSeconds
         */  
        // add your code here
        Scanner scanner = new Scanner(System.in);
        String adjective = "Sly";
        String animal = "Robin's";
        String companyType = "Time Calculator!";
        String fullCompany = adjective + " " + animal + " " + companyType;                                    
        System.out.println("Welcome to the " + fullCompany);
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name + ".");
        System.out.print("Enter the number of seconds you would like to be converted: ");
        numSeconds = scanner.nextInt();
        System.out.println();

        // you do not need to add anything below this line
        // create TimeConversion object
        TimeConversion converter = new TimeConversion();

        // call method to calculate Decaseconds
        converter.showDecaseconds(numSeconds);

        // call method to calculate Jeffies
        converter.showJiffies(numSeconds);

        // call method to calculate New York minutes
        converter.showNewYorkMinutes(numSeconds);

        // call method to calculate Nano Centuries 
        converter.showNanoCenturies(numSeconds);

        // call method to calculate Scaramuccis
        converter.showScaramuccis(numSeconds);

        // statements are for output formatting
        System.out.println(banner); // May need to zoom out to see
        System.out.println("*******************************");
        System.out.println("End - Time Conversion Program");
        System.out.println("*******************************");
    }//end main method
}//end class

