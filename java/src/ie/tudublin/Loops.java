package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		// background(0);		
		// stroke(255);
		// line(10, 10, 100, 10);
		// line(10, 20, 100, 20);
		// line(10, 30, 100, 30);
		// line(10, 40, 100, 40);

		// for(int y = 10 ; y <= 40 ; y += 10)
		// {
		// 	line(200, y, 300, y);
		// }

		// int yy = 10;
		// while(yy <= 40)
		// {
		// 	line(300, yy, 400, yy);
		// 	yy += 10;
		// }
		
		//picture1();
		//picture2();
		picture3();
	}

	public void picture1() {
		background(244,244,244);
		int x1 = 0;
		int y1 = 0;
		int w = width;
		int h = height;
		int xcentre = (width/2);
		int ycentre = (height/2); 
		

		for (y1 = 0; y1 <= h; y1 += 20) {
			stroke(0,0,0);
			line(x1, y1, xcentre, ycentre);
		}
		
		for (x1 = 0; x1 <= w; x1 += 20) {
			stroke(0,0,0);
			line(x1, y1, xcentre, ycentre);
		}

		for (; y1 > h-h; y1 -= 20) {
			stroke(0,0,0);
			line(x1, y1, xcentre, ycentre);
		}

		for (; x1 > w-w; x1 -= 20) {
			stroke(0,0,0);
			line(x1, y1, xcentre, ycentre);
		}
	}

	public void picture2() {
		int w = width;
		int h = height;
		int x = 25;
		int y = 50;

		background(244,244,244);

		for (; x < w; x += 50){
			fill(255,255,255);
			ellipse(x, y, 50, 50);
		}
		

	}

	public void picture3() {
		int w = width;
		int h = height;

		background(244,244,244);

		for (; x < w; x += 50){
			fill(255,255,255);
			ellipse(x, y, 50, 50);
		}
		

	}
}
