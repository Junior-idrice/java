import javax.naming.Name;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   processName(scanner);
    //System.out.println(" you name in reverse order is " + name );

    }

    public static void processName(Scanner scanner){
        System.out.println("Enter your name here ");

        String name = scanner.nextLine();
        String[] first = name.split(" ");
        System.out.print(first[1] +" "+ first[0]);
    }
}

