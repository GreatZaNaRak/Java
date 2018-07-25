import jlab.graphics.DWindow;
public class ColourBall extends Ball {
  // public double x, y, r, dx, dy;
  public int color;
  public ColourBall() {
    super();
  }
  public ColourBall(double x, double y, double r) {
    this(x, y, r, DWindow.BLACK);
  }
  public ColourBall(double x, double y, double r, int color) {
     super(x, y, r);
     this.color = color;
  }
  /* public static double random(double a, double b) {
    return a + (b - a) * Math.random();
  }
  public void move(DWindow win) {
    x += dx; y += dy;
    if (x + r > win.getWidth() || x - r < 0) dx = -dx;
    if (y + r > win.getHeight() || y - r < 0) dy = -dy;
  } */
  public void draw(DWindow win) {
    super.draw(win);
    win.fillEllipse(color, x, y, r, r);
  }

}
