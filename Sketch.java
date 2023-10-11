import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
  // Initiates Random From 
	Random myRandom = new Random();
  int intRandomX = myRandom.nextInt((350 - 50) + 1) + 50;
  int intRandomY = myRandom.nextInt((350 - 50) + 1) + 50;

  public void settings() {
	// Size of Canvas
    size (400, 400);
  }

  public void setup() {
    // Sets background color
    background (171, 235, 255);
  }

  public void draw() {	  
	  // Draws an eyeball
    stroke (0);
    fill (250, 250, 240);

    if (intRandomX != 50 && intRandomY != 50) {
      
      ellipse (intRandomX, intRandomY, width - 300, height - 300);

      if (intRandomX >= (width / 2) && intRandomY >= (height / 2)) {
      // Red
      fill(255, 105, 105);
      } 
      else if (intRandomX <= (width / 2) && intRandomY >= (height / 2)) {
      // Purple
      fill (205, 135, 255);
      }
      else if (intRandomX >= (width / 2) && intRandomY <= (height/2)) {
      // Green
      fill (160, 255, 170);
      }
      else {
      // Yellow
      fill (255, 247, 133);
      }

      ellipse (intRandomX, intRandomY, width - 350, height - 350);
    
      if (intRandomX <= (width / 2) || intRandomY <= (height / 2)) {
      //Regular pupil
      fill (0, 0, 0);
      } 
      else {
      // Bloodshot pupil
      fill (255, 0, 0);
      }

      // Draws the pupil
      ellipse (intRandomX, intRandomY, width - 375, height - 375);
    }
    else {
      // Draws the Illuminati if Random Numbers are both 50 (Unlikely)
      fill (37, 190, 38);
      triangle (intRandomX, intRandomY + 100, intRandomX + 50, intRandomY, intRandomX + 100, intRandomY + 100);
      
      fill (255, 255, 255);
      ellipse (intRandomX + 50, intRandomY + 60, intRandomX + 10, intRandomY - 15);
      
      fill (0, 0, 0);
      ellipse (intRandomX + 50, intRandomY + 60, intRandomX - 40, intRandomY - 15);
    }
  }
}