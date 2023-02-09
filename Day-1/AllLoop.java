public class AllLoop
{
    public static void main(String[] args)
    {
        int x = 2;
        //for loop
        for (int i = 0; i < 10; i++) 
        {
            System.out.print(x + " ");
            x *= 2;
        }   

        //while loop for Factorial Calculation
        int factorial = 1, number = 5, tempNum = 0;
        tempNum = number;
        while (tempNum != 0)
         {
            factorial = factorial * tempNum;
            --tempNum;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);

        //do-while loop
        int i=1;    
        do
        {    
            System.out.println(i);    
            i++;    
        }while(i<=10);  
    }
}