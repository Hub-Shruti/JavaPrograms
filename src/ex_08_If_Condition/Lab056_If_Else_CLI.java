package ex_08_If_Condition;

public class Lab056_If_Else_CLI {

    public static void main(String[] args) {

        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        //  TAKE USER INPUT THROUGH CLI OPTION (CONFIGURATION) //

        int age = Integer.parseInt(args[0]);

        if (age > 18)
        {
            System.out.println("You are allowed to vote !");
        }
        else
        {
            System.out.println("You are not allowed to vote !");
        }
    }
}
