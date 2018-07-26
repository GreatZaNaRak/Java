import java.util.Scanner;
import java.io.*;

public class BMIAvg {
  
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new File("data.txt"));
    double avgMaleBMI = 0, avgFemaleBMI = 0;
    int mCount = 0;
    int fCount = 0;
    
    while (in.hasNextLine()) {
      String[] a = in.nextLine().split(", ");
      if (a[0].substring(0, 3).equalsIgnoreCase("นาย")) {
        mCount += 1;
        double h = Double.parseDouble(a[1]) / 100.0;
        double w = Double.parseDouble(a[2]);
        double bmi = w / (h * h);
        avgMaleBMI += bmi;
      }
      else {
        fCount += 1;
        double h = Double.parseDouble(a[1]) / 100.0;
        double w = Double.parseDouble(a[2]);
        double bmi = w / (h * h);
        avgFemaleBMI += bmi;

      }
    }
    avgMaleBMI /= mCount;
    avgFemaleBMI /= fCount;

    in.close();
    System.out.println("Avg. male BMI = " + avgMaleBMI);
    System.out.println("Avg. female BMI = " + avgFemaleBMI);
  }

}
