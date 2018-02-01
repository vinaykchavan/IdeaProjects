package UserInterface;

/**
 * Created by Amay on 1/21/2018.
 */
import java.io.*;
import java.util.*;
import BusinessLogic.*;

public class calUi {
    private String exp = new String();
    private int result;
    public String getExp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression:");
        exp = sc.nextLine();
        return exp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        calLogic cl = new calLogic();
        calUi cu = new calUi();

        while(true){
            cu.result = cl.cal(cu.getExp());
            System.out.println("Result: " + cu.result +"\nContinue (Y/N)? ");
            String choice = sc.nextLine();
            if(choice.equals("N") || choice.equals("n"))
                break;
        }
    }
}