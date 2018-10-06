//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

//Goals of this program are to know how to use loop, nested

//For input values
import java.util.Scanner; 
public class Prime
{
   public static void main(String[] args)
   {
   //Setup input
   Scanner input = new Scanner(System.in);
   
   //Variables to store
   String response= "response";
   int num=0;
   int i=0;
   int n;
   
   //Loop
   do
   {
      int count=0;//Reset count to 0 when the users want to do again
      String prime = ""; //when user want to do again, this one helps the new result won't include the old results 
      System.out.print("Enter a number greater than 2: ");     
      n = input.nextInt();

      while (n <3)//if input value is not bigger than 2, it will ask users to input again
        {
         System.out.print("Enter a number greater than 2: ");     
         n = input.nextInt();
         }
         
      for (i = 1; i <= n; i++)  	   
         { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
            {
	          if(i%num==0)//considers prime numbers
	             {
		             counter = counter + 1;
                   
	               }
	          }
	      if (counter ==2)
            {
             prime = prime + i + " ";
             count +=1;
             if(count%10==0)//breaks the line of result every 10 values
               prime +="\n";
             }
          }
          
         //Output
         System.out.println("The prime numbers from 2 to " + n + " are \n");
         System.out.println(prime);
        
         //Ask the users to do again
         System.out.println("\nDo you want to enter another number?");
         System.out.print("Enter yes or no: ");
                        
         String extra = input.nextLine();
         response = input.nextLine();
         System.out.println("");
      }while (response.equalsIgnoreCase("yes"));//if the users type yes. it will return to line 21
      }
      }