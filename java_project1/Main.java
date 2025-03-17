import java.util.Scanner;
public class Main {
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Similar to Console.WriteLine
        System.out.println("Enter Username");

        String username = scanner.nextLine();

        System.out.println("Username is: " + username);

        int year = scanner.nextInt();

        int age = 2025-year;

        System.out.println("You are " + age + " years old.");




    }
}