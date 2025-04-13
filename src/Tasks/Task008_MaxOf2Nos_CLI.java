package Tasks;

public class Task008_MaxOf2Nos_CLI {

    public static void main(String[] args) {

        System.out.println("Enter two numbers : ");
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        int max = n1 > n2 ? n1 : n2;
        System.out.println("The Maximum of two numbers is : "+ max);


    }
}
