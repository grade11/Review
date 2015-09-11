/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

import java.util.Scanner;

/**
 *
 * @author muirw5809
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creating a scanner for the system input
        Scanner input = new Scanner(System.in);
        
        //ask user for name
        System.out.println("What is your name");
        
        //get the name and store the variable
        String name = input.nextLine();
        
        //output name
        System.out.println("Hello " + name);
        
        //how to format numbers to certain decimal places
        //2 decimal places
        //System.out.printf("Total: $%.2f CAD", 4.455667);
        
        //generate a random number
        //b <- highest number
        //a <- lowest number
        //(int) (Math.random()* (b-a+1)  a)
        int randNum = (int) (Math.random()* 11);
        System.out.println("enter a number");
        int number = input.nextInt();
        if(randNum > 5)
        {
            System.out.println("Wow");
        }else if(randNum > 3 && randNum <=5)
        {
            System.out.println("Not Bad");
        }else
        {
            System.out.println("Booooo....");
        }
        
        int count = 0;
        while(count<10)
        {
            System.out.println(count);
            count++;
        }
        
        int[] myNums = new int[5];
        for(int i = 0; i <myNums.length; i++)
        {
            System.out.println("Please enter an int");
            myNums[i] = input.nextInt();           
        }
        sayHello("walter");
        double a = areaRect(10.5, 20);
    }
    
    static void sayHello(String name)
    {
        System.out.println("Hello " + name);
    }
    
    static double areaRect(double length, double width)
    {
        double answer = length*width;
        return answer;
                
    }
    
}
