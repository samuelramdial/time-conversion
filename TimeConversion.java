/**
@author Ramdial, Samuel "Sam" - ITSC 1212 - 005 - von Briesen
@version 3.0
@since 09/25/2021

Project 2 - Modules 1 - 4 - Whimsical Times
Complete the five methods so that when Time Conversion runs there's enough logic to convert the inputted seconds to non-conventional time units. 

*/

public class TimeConversion 
{
    /**
     * Constructor
     */
    TimeConversion()
    {
        
    }
    
    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    public static void showDecaseconds(int numSeconds)
    {
        numSeconds = (numSeconds /10); // Divides second by 10
        System.out.println("A decasecond is 10 seconds. Your number of seconds convered is: " + numSeconds + " decaseconds\n"); 
    }


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    public static void showJiffies(int numSeconds)
    {
        numSeconds = ((numSeconds*1000)/10); // Converts seconds to miliseconds, then divides by 10 milliseconds
        System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds. Your number of seconds converted is: " + numSeconds + " jiffies\n");
    }

    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here
    public static void showNewYorkMinutes(double numSeconds)
    {
        numSeconds = (numSeconds/0.05); //Divides the number of seconds by 1/20th which is 0.05 seconds. 
        System.out.println("A new york minute is the period of time between the traffic lights turning green and the cab behind you begins honking. It is 1/20th of 1 second.Your number of seconds converted to new york minutes is: " + numSeconds + " new york minutes\n");
    }
    
    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here
    public static void showNanoCenturies(double numSeconds)
    {
        numSeconds = (numSeconds / 3.156); 
        System.out.println("A nanocentury is a computing measurement coined from the expression- \"never to let the user wait more than a few nanocenturies for a  response.\" It is 3.156 seconds. Your number of seconds converted is: " + numSeconds + " nanocenturies\n");
    } 

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here
    public static void showScaramuccis(double numSeconds)
    {
        numSeconds = numSeconds/ 950400; // Divides seconds by 950400 which is 11 days converted to seconds. 
        System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days. Your number of seconds converted is: " + numSeconds + " scaramuccis\n");
    } 
    
    
}//end class