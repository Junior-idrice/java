import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class  Main {
    public static void main(String[] args) {
        int mCount = 10;
        int spaceCount = 27;
        int underscoreCount = 3;
        System.out.println("           +-----------------------------------+");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < mCount; j++) {
                System.out.print(" ");
            }
            System.out.print("/");

            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < underscoreCount; j++) {
                System.out.print("__");
                if (j < underscoreCount - 1) {
                    System.out.print("/");

                }
            }
            System.out.println("/");

            mCount--;
            spaceCount -= 3;
            underscoreCount++;


        }

        System.out.println(" +-----------------------------------+");
        for(int i=0; i<5; i++){
            System.out.println(" |       Building Java Program       |");
        }
        System.out.println(" +-----------------------------------+");
    }
}
//public class DrawFigure {
  //  public static void main(String[] args) {
    //    for (int i = 4; i > 0; i--) {
      //      for (int j = 0; j < i; j++) {
        //        System.out.print("m");
          //  }
           // System.out.println();
        //}
  //  }
//}