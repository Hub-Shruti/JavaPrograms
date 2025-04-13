package ex_09_Switch;

import java.util.Scanner;

public class Lab061_Switch_Browser {

    public static void main(String[] args) {

        // I will ask the user to give me the input about the browser which he wants to
        // use to start the automation in that browser.

//        String browser  = args[0];
//        System.out.println(browser);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch (browser) {
            case "chrome":         //   Switch case is case-sensitive (chrome and Chrome are different in Switch case) //
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
