package oops_btech;
//example of Custom Exception
class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class exceptionhandling_custom3
{
   void productCheck(int weight) throws InvalidProductException{
	if(weight<100){
		throw new InvalidProductException("Product Invalid");
	}
   }
   
    public static void main(String args[])
    {
    	exceptionhandling_custom3 obj = new exceptionhandling_custom3();
        try
        {
            obj.productCheck(160);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
       	 System.out.println("Program End");
       }    
}