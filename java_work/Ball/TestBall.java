import jlab.graphics.DWindow;
import java.util.Scanner;

public class Test2{
  public static void main(String[] args) {
    DWindow win = new DWindow(300, 300);
    ColourBall[] ball = new ColourBall[50];
    int[] color = { DWindow.BLACK, DWindow.PINK, DWindow.RED, DWindow.GREEN, DWindow.BLUE, DWindow.YELLOW };
    for (int i = 0; i < ball.length; i++) {
      ball[i] = new ColourBall(150,150,10,color[i%6]);
    }
    win.setRepaintDuringSleep(true);
    while (true) {
      win.clearBackground();
      for (int i = 0; i < ball.length; i++) {
         ball[i].move(win);
         ball[i].draw(win);
      }
      win.sleep(50);
    }
  }
}
