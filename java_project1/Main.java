import java.util.Scanner;
public class Main {
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        /* 
        //Similar to Console.WriteLine
        System.out.println("Enter Username");

        String username = scanner.nextLine();

        System.out.println("Username is: " + username);

        System.out.println("Please enter the year you were born.");

        int year = scanner.nextInt();

        int age = 2025-year;

        System.out.println("You are " + age + " years old.");
        */
        Scanner myNum = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = myNum.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = myNum.nextInt();
        System.out.println("Please enter the third number: ");
        int num3 = myNum.nextInt();

        int largest = 0;

        
        if (num1>=num2 && num1>num3){
            largest=num1;
        }
        if (num2>=num1 && num2>num3){
            largest=num1;
        }
        if (num3>=num1 && num3>num2){
            largest=num3;
        }
        
        System.out.println("The largest number will be: " + largest);




    }
}