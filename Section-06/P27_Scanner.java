import java.util.Scanner;

public class P27_Scanner {
    
      public static void main(String[] args) {
          int currentYear = 2025;
          System.out.println(getInputFromConsole(currentYear));
          System.out.println(getInputFromScanner(currentYear));
     }
     
     public static String getInputFromConsole(int currentYear) {
          String name = System.console().readLine("Hi, What's your Name? ");
          System.out.println("Hi " + name + ", Thanks for taking the course!");

          String dateOfBirth = System.console().readLine("What year were you born? ");
          int age = currentYear - Integer.parseInt(dateOfBirth);
          return "So you are " + age + " years old";
     }
     public static String getInputFromScanner(int currentYear) {
          Scanner scanner = new Scanner(System.in);

     // String name = System.console().readLine("Hi, What's your Name? ");
          System.out.println("Hi, What's your Name? ");
          String name = scanner.nextLine();
          System.out.println("Hi " + name + ", Thanks for taking the course!");

     // String dateOfBirth = System.console().readLine("What year were you born? ");
          System.out.println("What year were you born? ");
          String dateOfBirth = scanner.nextLine();
          scanner.close();    // closing the Scanner class

          int age = currentYear - Integer.parseInt(dateOfBirth);
          return "So you are " + age + " years old";
     }
}
