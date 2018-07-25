import jlab.graphics.DWindow;
import java.util.Scanner;

public class Ball {
  public double x, y, r, dx, dy;
  public Ball() {
    this(random(100,250), random(100,250), 10);
  }
  public Ball(double x, double y, double r) {
    this(x, y, r, random(-5, 5), random(-5, 5));
  }
  public Ball(double x, double y, double r, double dx, double dy) {
    this.x = x; this.y = y; this.r = r; this.dx = dx; this.dy = dy;
  }
  public void move(DWindow win) {
    x += dx; y += dy;
    if (x + r > win.getWidth() || x - r < 0) dx = -dx;
    if (y + r > win.getHeight() || y - r < 0) dy = -dy;
  }
  public void draw(DWindow win) {
    win.fillEllipse(x, y, r, r);
  }
  public static double random(double a, double b) {
    return a + (b - a) * Math.random();
  }
  public String toString() {
    return "x = " + x + " y = " + y + " r = " + r + " dx = " + dx + " dy = " + dy;
  }
}
