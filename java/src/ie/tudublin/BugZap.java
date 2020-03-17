package ie.tudublin;
import processing.core.PApplet;

public class BugZap extends PApplet {
    public void settings() {
        size(500, 500);
        playerX = width / 2;
        playerY = height - (playerHeight * 2);
        
    }
    
    public void setup() {
        smooth(8);
    }

    float playerX;
    float playerY;
    float playerWidth = 50;
    float playerHeight = 30;

    public void draw() {
        drawPlayer(playerX, playerY, playerWidth, playerHeight);
    }

    void drawPlayer(float x, float y, float w, float h){
       
        background(0);

        //Draw the player
        float halfWidth = w * 0.5f;
        float halfHeight = h * 0.5f;

        stroke(255);
        line(x - halfWidth, y + halfHeight, x + halfWidth, y + halfHeight);
        line(x - halfWidth, y + halfHeight, x - halfWidth, y);
        line(x - halfWidth, y, x - (w * 0.25f), y - halfHeight);
        line(x - (w * 0.25f), y - halfHeight, x + (w * 0.25f),  y - halfHeight);
        line( x + (w * 0.25f),  y - halfHeight, x + halfWidth, y);
        line(x + halfWidth, y, x + halfWidth, y + halfHeight);
    
        // line(x, y, x+100, y);
        // line(x, y, x, y-25);
        // line(x+100, y, x+100, y-25);
        // line(x, y-25, x+25, y-50);
        // line(x+25, y-50, x+75, y-50);
        // line(x+75, y-50, x+100, y-25);
    }

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	
}