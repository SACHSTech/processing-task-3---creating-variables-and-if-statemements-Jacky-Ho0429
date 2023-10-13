import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
  // Initiates Random From 
	Random myRandom = new Random();
  int intRandomX = myRandom.nextInt((350 - 50) + 1) + 50;
  int intRandomY = myRandom.nextInt((200 - 50) + 1) + 50;
  int intDay = myRandom.nextInt(10);
  
  // Intiaites Time
  String currentTime;

  public void settings() {
	// Size of Canvas
    size (400, 400);
  }

  public void setup() {
    // Sets background color
    if (intRandomX <= 100 && intDay < 5) {
      // Morning
      background (255, 153, 19);
    }
    else if (intRandomX <= 225 && intDay < 5) {
      // Afternoon
      background (0, 191, 255);
    }
    else if (intRandomX <= 400 || intDay >= 5) {
      // Night
      background (72, 61, 139);
      currentTime = nf(hour(), 2) + ":" + nf(minute(), 2) + ":" + nf(second(), 2);
    } 
  }


  public void draw() {	  
	  // Draws the Sun Or Moon
    stroke (0);

    if (!(intDay <= 5)) {
      //Moon
      fill (246, 241, 213);      
    }
    else {
      //Sun
      fill (252, 229, 112);
    }
  
    ellipse(intRandomX, intRandomY, width -350, height - 350);

    // Draws The Foreground

    //Silhouette
    if (!(intDay <= 5)) {
      // Ground
      fill (0, 0, 0);
      rect(0, height - height / 5, width, height - height / 5);
      
      // Rectangle for the tree trunk
      rect(width / 2 - 90, height - height / 5, 20, height / 5 - 125);

      // Triangle for the tree leaves
      triangle(width / 2 - 120, height - height / 5 - 40,  width / 2 - 40, height - height / 5 - 40, width / 2 - 80, height - height / 5 - 100);
      triangle(width / 2 - 120, height - height / 5 - 80, width / 2 - 40, height - height / 5 - 80, width / 2 - 80, height - height / 5 - 140);
      
      // Stickman
      // Head
      ellipse(width / 2, height / 2 + 70, width /20, height / 20); 
   
      // Body
      line(width / 2, height / 2 + 80, width / 2, height / 2 + 100);

      // Arms
      line(width / 2, height / 2 + 80, width / 2 - 10, height / 2 + 90);
      line(width / 2, height / 2 + 80, width / 2 + 10, height / 2 + 90);

      // Legs
      line(width / 2, height / 2 + 100, width / 2 - 15, height / 2 + 120);
      line(width / 2, height / 2 + 100, width / 2 + 15, height / 2 + 120);
      
      //House
      rect((float)(width / 16) + 225, (float)(height / 1.38) - 70, (float)(width / 3.34), (float)(height/4));
  
      // Roof
      triangle(225, (float)(height / 1.38) - 70, (float)(width / 2.35) + 225, (float)(height / 1.38) - 70, (float)(width / 4.71) + 225, (float)(height / 1.86) - 70);
    
      // Window
      rect((float)(width / 8) + 225, (float)(height / 1.23) - 70, (float)(width / 13.33), (float)(width / 13.33));
      line((float)(width / 6.15) + 225, (float)(height / 1.23) - 70, (float)(width / 6.15) + 225, (float)(height / 1.13) - 70);
      line((float)(width / 8) + 225, (float)(height / 1.18) - 70, (float)(width / 5) + 225, (float)(height / 1.18) - 70);
      
      // Door
      rect((float)(width / 4.12) + 225, (float)(height / 1.18) - 70, (float)(width / 16), (float)(height / 8));
      stroke(255, 140, 105);

      // Time
      fill(0);
      textSize(16);
      text(currentTime, 10, 20);
    }
    else {
      // Ground
      fill (124, 252, 0);
      rect(0, height - height / 5, width, height - height / 5);

      // Rectangle for the tree trunk
      fill(139, 69, 19); // Brown color for the trunk
      rect(width / 2 - 90, height - height / 5, 20, height / 5 - 125);

      // Triangle for the tree leaves
      fill(34, 139, 34);
      triangle(width / 2 - 120, height - height / 5 - 40,  width / 2 - 40, height - height / 5 - 40, width / 2 - 80, height - height / 5 - 100);
      triangle(width / 2 - 120, height - height / 5 - 80, width / 2 - 40, height - height / 5 - 80, width / 2 - 80, height - height / 5 - 140);

      // Stickman
      // Head
      fill(255);
      ellipse(width / 2, height / 2 + 70, width /20, height / 20); 
   
      // Body
      line(width / 2, height / 2 + 80, width / 2, height / 2 + 100);

      // Arms
      line(width / 2, height / 2 + 80, width / 2 - 10, height / 2 + 90);
      line(width / 2, height / 2 + 80, width / 2 + 10, height / 2 + 90);

      // Legs
      line(width / 2, height / 2 + 100, width / 2 - 15, height / 2 + 120);
      line(width / 2, height / 2 + 100, width / 2 + 15, height / 2 + 120);
      
      //House
      stroke(0);
      fill(240, 225, 190);
      rect((float)(width / 16) + 225, (float)(height / 1.38) - 70, (float)(width / 3.34), (float)(height/4));
  
      // Roof
      fill(210, 100, 75);
      triangle(225, (float)(height / 1.38) - 70, (float)(width / 2.35) + 225, (float)(height / 1.38) - 70, (float)(width / 4.71) + 225, (float)(height / 1.86) - 70);
    
      // Window
      stroke(255);
      fill(140, 220, 240);
      rect((float)(width / 8) + 225, (float)(height / 1.23) - 70, (float)(width / 13.33), (float)(width / 13.33));
      line((float)(width / 6.15) + 225, (float)(height / 1.23) - 70, (float)(width / 6.15) + 225, (float)(height / 1.13) - 70);
      line((float)(width / 8) + 225, (float)(height / 1.18) - 70, (float)(width / 5) + 225, (float)(height / 1.18) - 70);
      
      // Door
      stroke(0);
      fill(170, 105, 50);
      rect((float)(width / 4.12) + 225, (float)(height / 1.18) - 70, (float)(width / 16), (float)(height / 8));
      stroke(255, 140, 105);
      fill(255, 140, 105);
      ellipse((float)(width / 3.48) + 225, (float)(height / 1.10) - 70, (float)(width / 133.33), (float)(width / 133.33));
      
      // Time
      fill(0);
      textSize(16);
      text(currentTime, 10, 20);
    }
  }

  private int getCurrentHour() {
    return hour();
  }
}