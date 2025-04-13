package ex_09_Switch;

public class Lab062_Switch_Valid_Invalid {

    public static void main(String[] args) {

        int a = 10;
        switch (a)                // Valid but no output displayed
        {

        }

        long a11 = 30l;
        switch ((int) a11)         // Valid as Typecasting is allowed in Switch but no output displayed
        {

        }

//        boolean b = true;
//        switch (b)                // Invalid since boolean and float value is not allowed in Switch
//        {
//        }


        int b = 98;
        switch (b) {
            case 98:
                System.out.println("98");
//          case 98:                                // Replication is not allowed in Switch
//              System.out.println("98");
        }

    }
}
