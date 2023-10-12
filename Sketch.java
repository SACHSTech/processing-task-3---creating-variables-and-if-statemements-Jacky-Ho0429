import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
  // Initiates Random From 
	Random myRandom = new Random();
  int intRandomX = myRandom.nextInt((350 - 50) + 1) + 50;
  int intRandomY = myRandom.nextInt((350 - 50) + 1) + 50;
  int intDay = myRandom.nextInt(2);

  public void settings() {
	// Size of Canvas
    size (400, 400);
  }

  public void setup() {
    // Sets background color
    if (intRandomX <= 125) {
      background (255, 153, 19);
    }
    else if (intRandomX > 125) {
      background (171, 235, 255);
    }
    else if (intRandomX > 200) {
      background (100, 71, 0);
    }
  }


  public void draw() {	  
	  // Draws the Sun Or Moon
    stroke (0);
    if (intDay >= 2) {
      fill (246, 241, 213);      
    }
    else {
      fill (252, 229, 112);
    }
    ellipse(intRandomX, intRandomY, width -350, height - 350);
  }
}