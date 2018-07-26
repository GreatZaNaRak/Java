public class MaxUtil {
  public static void main(String[] args) {
    System.out.println(max(1,2));
  }
  public static int max(int a, int b) {
    return Math.max(a,b);
  }
  public static int max(int a, int b, int c) {
    int out = -1000;
    int[] data = { a, b, c };
    for (int i = 0; i < data.length; i++) {
      if (data[i] > out) out = data[i];
    }
    return out;
  }
  public static int max(int a, int b, int c, int d) {
    int out = -1000;
    int[] data = { a, b, c, d };
    for (int i = 0; i < data.length; i++) {
      if (data[i] > out) out = data[i];
    }
    return out;
  }
  public static double max(double a, double b) {
    return Math.max(a, b);
  }
  public static double max(double a, double b, double c) {
    double out = -100000.0;
    double[] data = { a, b, c };
    for (int i = 0; i < data.length; i++) {
      if (data[i] > out) out = data[i];
    }
    return out;
  }
  public static double max(double a, double b, double c, double d) {
    double out = -100000.0;
    double[] data = { a, b, c, d };
    for (int i = 0; i < data.length; i++) {
      if (data[i] > out) out = data[i];
    }
    return out;
  }

}
