/**
 * includes package to organize classes and interfaces
 */
package cse360assignment02;

/**
 * THe main function we will be using to perform simple math equations 
 * 
 * @author Ryan Bui
 *
 */
public class AddingMachine 
{
	  /**
	   * declare variables
	   * 
	   * @total holds the overall value after all operations are performed
	   * @history holds the memory of operations performed in a string
	   */
	
	  private int total;
	  private String history;
	  
	  	  /**
	  	   * function to call main and initialize the variables
	  	   * 
	  	   */
	  
		  public AddingMachine () 
		  {
		    total = 0;  // not needed - included for clarity
		    history = "0";
		  }
		  
		  /**
		   * returns total after adding, subtracting, and/or clearing
		   * 
		   * @return total
		   */
		  
		  public int getTotal () 
		  {
		    return total;
		  }
		  
		  /**
		   * takes the parameter int value and adds it to the variable total and also adds the operation and value to string history for displaying later
		   *
		   * @total represents the overall value after addition is performed
		   * @history represents the string that keeps the memory of the operations performed
		   */
		  
		  public void add (int value) 
		  {
			  total += value;
			  history += " + " + value;
		  }
		  
		  /**
		   * takes the parameter int value and subtracts from the variable total and also adds the operation and value to history for displaying later
		   *
		   * @total represents the overall value after subtraction is performed
		   * @history represents the string that keeps the memory of the operations performed
		   */
		  
		  public void subtract (int value) 
		  {
			  total -= value;
			  history += " - " + value;
		  }
		  
		  /**
		   * displays the operations made in the past
		   * 
		   * @return history
		   */
		  
		  public String toString () 
		  {
		    return history;
		  }
		  /**
		   * clears the memory
		   * 
		   * @total initializes the value back to 0 to "clear" the value
		   * @history initializes the value back to "0" to "clear" the memory
		   */
		  
		  public void clear() 
		  {
			  total = 0;
			  history = "0";
		  }
}