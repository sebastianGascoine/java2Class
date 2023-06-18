import java.io.*;
import java.util.Scanner;
import java.math.*; //for pi
import java.io.PrintWriter;


class Main {
  public static void main(String[] args) throws Exception {
    //File & Scanner variables
    File inputData = new File("input1.txt");
    Scanner input = new Scanner(inputData);
    PrintWriter wFile = new PrintWriter("output1.txt");

    int totalcircles = input.nextInt(); //gets total circles
    double avgradius = 0;
    
    int[] radiusArray = new int[totalcircles];
    int[] degArray = new int[totalcircles]; 
    double[] radArray = new double[totalcircles]; 
    double[] arcArray = new double[totalcircles]; 
    double[] polArray = new double[totalcircles]; 
    
    System.out.println("Radius(inch)  Angle(deg)  Angle(rad) ArcLength(inch)  Polar Area(sq.inch)");
    wFile.println("Radius(inch)  Angle(deg)  Angle(rad) ArcLength(inch)  Polar Area(sq.inch)");
    
    for(int i=0;i<totalcircles;i++){
      radiusArray[i] = input.nextInt(); //straight from file
      degArray[i] = input.nextInt(); //straight from file
      radArray[i] = Math.PI/(double)180 * degArray[i]; // degree * pi/180
      arcArray[i] = degArray[i] * radArray[i]; //degree * radian
      polArray[i] = (radArray[i]/2) * Math.pow(radiusArray[i], 2); //polar area
      //console printing
      System.out.print("\n");
      System.out.printf("%12d %11d %11.2f %15.2f %20.2f",
      radiusArray[i],degArray[i],radArray[i],arcArray[i],polArray[i]);
      //output file printing
      wFile.print("\n");
      wFile.printf("%12d %11d %11.2f %15.2f %20.2f",
      radiusArray[i],degArray[i],radArray[i],arcArray[i],polArray[i]);

      avgradius += radiusArray[i];
    }
    avgradius = avgradius / (double)totalcircles;
    System.out.printf("\n\nThe average of radius of all %d circles is: %.1f inches.",
    totalcircles,avgradius);
    wFile.printf("\n\nThe average of radius of all %d circles is: %.1f inches.",
    totalcircles,avgradius);
    input.close();
    wFile.close();
    
  }
}