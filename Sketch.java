import java.time.LocalTime;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
  
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 179, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  // Declare variables
    float flowerX = random(0, width);
    float flowerY = random(0, height);
    float petalSize = random(50, 250);
    float petalDistance = petalSize / 2;

  // Draw top-left petal
    fill(255, 3, 3);
    ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);

  // Draw top-right petal
    fill(255, 3, 3);
    ellipse(flowerX + petalDistance, flowerY + petalDistance, petalSize, petalSize);

  // Draw bottom-left petal
    fill(255, 3, 3);
    ellipse(flowerX - petalDistance, flowerY + petalDistance, petalSize, petalSize);

  // Draw bottom-right petal
    fill(255, 3, 3);
    ellipse(flowerX + petalSize, flowerY + petalDistance, petalSize, petalSize);

      // Draw flower center
    fill(10, 10, 10);
    ellipse(flowerX, flowerY, petalSize, petalSize);

  // If statement

    if(flowerX > 200){
        background(66, 135,245);
    }
   
    // Display current time

      System.out.println(java.time.LocalTime.now());

    }
  }


