 
import java.util.Scanner;
import java.io.*;
public class MovieDriver 

{
       static String question1;
       static String question2;
       static int question3;
       static String question4 ;
       
       
       static char repeat;
       
	public static void main(String[] args) 
	
{
	do 
	{
		Movie movieSet = new Movie();
		
		System.out.println("Enter the name of the movie");
		Scanner answer1  = new Scanner(System.in);
		question1 = answer1.nextLine();
		
		movieSet.setTitle(question1);
		
		System.out.println("Enter the movie’s rating");
		Scanner answer2  = new Scanner(System.in);
		question2 = answer1.nextLine();
		
		movieSet.setRating(question2);
		
		System.out.println("Enter the number of tickets sold at this movie theater");
		Scanner answer3  = new Scanner(System.in);
		question3 = answer1.nextInt();
		
		movieSet.setSoldTickets(question3);
		
		System.out.println(movieSet.toString());
		
		System.out.println("Do you want to enter another?");
		System.out.println(" y or n ");
		
		Scanner answer4  = new Scanner(System.in);
		question4 = answer4.nextLine();   
		 
		
	   }while (question4.equals("Y") || question4.equals("y"));
	    System.out.println("Goodbye");
 }

}