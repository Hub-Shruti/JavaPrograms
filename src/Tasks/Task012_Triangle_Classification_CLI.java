package Tasks;

public class Task012_Triangle_Classification_CLI {

    public static void main(String[] args) {

        // Triangle Classifier:
        //
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.



        // INPUT THROUGH EDIT CONFIGURATION //

        System.out.println("Enter the three sides of the Triangle : ");
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);


        if (side1<=0 || side2<=0 || side3<=0)
        {
            System.out.println("This is not a Triangle");
            System.exit(0);
        }

        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)
        {
            System.out.println("This is not a Triangle");
            System.exit(0);
        }

        // Real Logic will come

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }

    }
}
