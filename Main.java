//TODO: <name>
//TODO: <date>
//Practice 2012 - 03: Ant Entrapment
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
   public static void main(String[] args) throws Exception{
      //Scanner scan = new Scanner(new java.io.File("X:\\Git\\Git\\GitPortable\\Data\\home\\201203\\in-out\\judging.in"));
      Scanner scan = new Scanner(System.in);
      //DecimalFormat form = new DecimalFormat("0.000");
      
      int n = scan.nextInt();
      for(int i = 0; i < n; i++)
      {
         int nAnt = scan.nextInt();
         double xMax = -1000;
         double xMin = 1000;
         double yMax = -1000;
         double yMin = 1000;
         for(int j = 0; j < nAnt; j++)
         {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            if(x > xMax)
               xMax = x;
            if(x < xMin)
               xMin = x;
            if(y > yMax)
               yMax = y;
            if(y < yMin)
               yMin = y;
         }
         double xLen = xMax - xMin;
         double yLen = yMax - yMin;
         String area = ""+(xLen * yLen);
         String per = ""+(xLen * 2 + yLen * 2);
         System.out.println("Case "+(i+1)+": Area "+area+", Perimeter "+per);
      }
      System.exit(0);
   }
}
