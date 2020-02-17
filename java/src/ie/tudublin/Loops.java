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

	public void loops1()
	{
		stroke(255);
		int numLines = (int) (30 * (mouseX / (float) width)) ;
		float gap = width / (float) numLines;
		for(int i = 0 ; i <= numLines ; i ++)
		{
			float x = i * gap;
			line(x, 0, width - x, height);
			line(0, x, width, height -x);
		}
	}

	float offset = 0;

	public void loops2()
	{
		int numCircles  = (int) (20 * (mouseX / (float) width)) ;
		
		float w = width / (float) numCircles;
		float radius = w / 2.0f;
		colorMode(HSB);
		float cGap = 255 / (float) (numCircles * numCircles);
		noStroke();

		for(int j = 0 ; j < numCircles ; j ++)
		{		
			for(int i = 0 ; i < numCircles ; i ++)
			{
				float x = radius + (i * w);
				float y = radius + (j * w);
				float c = (cGap * i * j + offset) % 255; 
				fill(c, 255, 255);
				ellipse(x, y, w, w);
			}
		}
		offset += mouseY / 250.0f;
	}

	public void loops3()
	{
		float gap = width * 0.1f;
		float halfGap = gap / 2.0f;
		colorMode(RGB);
		stroke(0, 255, 0);
		textAlign(CENTER, CENTER);
		for(int i = -5 ; i <=5 ; i ++)
		{
			float x = map(i, -5, 5, gap, width -gap);				
			line(x, gap, x, height - gap);
			line(gap, x, width - gap, x);
			fill(255);
			text(i, x, halfGap);
			text(i, halfGap, x);
			
		}
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
<<<<<<< HEAD
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
		

=======
		background(0);		
		colorMode(HSB);
		//loops1();

		loops2();

		//loops3();
>>>>>>> eb73adade4ee29c79cd5220fe94af6f2d6fec7c9
	}
}
