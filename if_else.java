package If_else;

import java.util.Scanner;

public class if_else {


    public static void main(String[] args) {
    
    // we will make a program that will take user input.

    System.out.println("Input Your Salary");    

    Scanner input = new Scanner(System.in);

    int salary = input.nextInt();

    if(salary > 10000){
        
        salary += 2000;

        System.out.println("You got a bonus of 2000 ");
        System.out.println("and now your salary is --->" + salary);
        

    }else if(salary <= 10000){
        
        salary += 1000;

        System.out.println("You got the bonus of 1000");
        System.out.println("and now your salary is ---> " + salary);

    }
    
    }


        
}
