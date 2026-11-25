/*
Write java application to accept int(emp id) , double(salary) , emp's first name , is permanent :
  boolean from Scanner & display the same using printf
 */
import java.util.Scanner;

public class TestScanner{
    public static void main(String[] args){
        //  create scanner object, wrapping stdin
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empid, salary, name, permanent status ");
        
        System.out.printf("Emp Id %d Salary %.2f Name %s Is permanent %b %n",
            sc.nextInt(), sc.nextDouble(), sc.next(), sc.nextBoolean()
        );
        // close scanner 
        sc.close();
  
    }
}