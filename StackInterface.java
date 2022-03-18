/**
   An interface for the ADT stack.
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public interface StackInterface<T>
{
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry);
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop();
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek();
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty();
  
   /** Removes all entries from this stack. */
   public void clear();
    
    //we set the cases for a statement that will be inputed into the stack and operator stack
   static int operation(char operator)
    {
        switch (operator)
        //by seperating the operations into the standard format of PEMDAS, it also will be seperated like in the stack
        // If 2 is before 1 then the priority falls upon 2 unless a parenthesis is involved
        // The missing search is the Parenthesis but that algorithm will follow this one 
        {
               case '+':
               case '-':
               return 1;
      
              case '*':
              case '/':
              return 2;
      
              case '^':
              return 3;
        }
        //the return of -1 nullfies the operation value and highilghts that there is nothing else to add to the stack or just add nothing.
        return -1;
    }
   static String convertInfixToPostfixAlgorithm(String equation)
    {
    
         // initializing empty stack in order to output the operators correctly
        Stack<Character> stack = new Stack<>();
        
        // Sets a string to be created in order to put our brand new expression inside it
        String result = new String("");
         
       
} // end StackInterface 1
