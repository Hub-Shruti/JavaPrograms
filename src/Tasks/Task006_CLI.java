package Tasks;

public class Task006_CLI {

    public static void main(String[] args) {

        // CLI Options
        //
        //Take a user input - Name, Age and Salary and print them in the end.
        //

         System.out.println("Enter your Name, Age and Salary :");
         String name = args[0];
         int age = Integer.parseInt(args[1]);
         double salary = Double.parseDouble(args[2]);

         System.out.println("\n--- User Information ---");
         System.out.println("Name : "+ name);
         System.out.println("Age : "+ age);
         System.out.println("Salary : "+ salary);

    }
}
