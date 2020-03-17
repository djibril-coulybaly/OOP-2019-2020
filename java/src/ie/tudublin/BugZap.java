package ie.tudublin;
import processing.core.PApplet;

public class BugZap extends PApplet {
    public void settings() {
        size(500, 500);
    }
    
    public void setup() {
		playerX = width / 2; //Sets the x-coordinate to half the width of the screen
		playerY = height - 50; //Sets the y-coordinate to 50 pixels above the height
		
		bugX = width / 2;
		bugY = 50;
		smooth();
    }
	
	//Declaring and Initializing Variables
	float playerX; 
	float playerY;
	float playerWidth = 40; //Width of the player
	float halfPlayerWidth = playerWidth / 2; //Half the width of the player

	float bugX;
	float bugY;
	float bugWidth = 30;
	float halfBugWidth = bugWidth / 2;

	//Function to draw on the screen. Loops continuously until the sketch window is closed
    public void draw() {
		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY, bugWidth);
    }

	void drawBug(float x, float y, float w){
		stroke(255);

		float bugHeight = w/2;
		line(x - halfBugWidth, y + bugHeight, x + halfBugWidth, y + bugHeight);
		line(x - halfBugWidth, y + bugHeight, x, y - bugHeight);
		line(x, y - bugHeight, x + halfBugWidth, y + bugHeight);
	}


    void drawPlayer(float x, float y, float w){
		background(0); //Set the background colour to black
		
        //Draw the player
		float playerHeight = w / 2; 
		stroke(255); //Sets the outline of the line to white
		
		line(x - halfPlayerWidth, y + playerHeight, x + halfPlayerWidth, y + playerHeight); //Drawing the base of the player i.e. _____
		line(x - halfPlayerWidth, y + playerHeight, x - halfPlayerWidth, y + playerHeight * 0.5f); //Drawing the left vertical line of the player i.e |
		line(x + halfPlayerWidth, y + playerHeight, x + halfPlayerWidth, y + playerHeight * 0.5f); //Drawing the right vertical line of the player i.e |
		
		
		line(x - halfPlayerWidth, y + playerHeight * 0.5f, x - (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f); //Drawing the left diagonal line of the player i.e. /
		line(x + halfPlayerWidth, y + playerHeight * 0.5f, x + (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f); //Drawing the right diagonal line of the player i.e. \
		
		line(x - (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f, x + (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f); //Drawing the top of the player i.e. --------
		
		line(x, y, x, y + playerHeight * 0.3f); //Drawing the gun of the player 
    }

    public void keyPressed()
	{
		// When the user presses the left key on the keyboard and while the centre of the 
		// player is greater than half the width of the player 
		// (i.e. Doesnt reach the far left edge of the screen), 
		// the player will move to the left by decrementing playerX
		if (keyCode == LEFT && playerX > halfPlayerWidth)
		{
			playerX--;
			System.out.println("Left arrow pressed");
		}
		// When the user presses the right key on the keyboard
		// and while the centre of the player is less than the width of the screen minus
		// half the width of the player (i.e. Doesnt reach the far right edge of the screen), 
		// the player will move to the left by decrementing playerX
		if (keyCode == RIGHT && playerX < width - halfPlayerWidth)
		{
			playerX++;
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			line(playerX, playerY, playerX, playerY - height); //Drawing the gun of the player 
			System.out.println("SPACE key pressed");
		}
	}	
}