//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("            +--------------------------------+");
        for(int i=1; i<=10; i++){
            for(int j=i; j<=10; j++){
                System.out.print(" ");
            }
            System.out.print(" /");
            for(int j=i; j<=10; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
               System.out.print("__/");
            }
            for(int j=1; j<i; j++){
                System.out.print("/");
            }
            System.out.println();
        }
        System.out.println(" +-------------------------------+//////////");
        for(int i=1; i<=5; i++){
            System.out.print(" |     Building Java Program    |");
                if(i == 1){
                    System.out.print("//////////");
                }
                if(i == 2){
                    System.out.print("////////");
                }
                if(i == 3){
                    System.out.print("//////");
                }
                if (i==4){
                    System.out.print("////");
                }
                if(i==5){
                    System.out.print("//");
                }


            System.out.println();
        }
        System.out.println(" +------------------------------+");

      }
    }
