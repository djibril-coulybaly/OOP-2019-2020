package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	public void draw()
	{
		background(255,0,0);//rgb value for background colour

		noStroke();//no outline of shapes
		fill(255,255,0);// filling the colour of all shapes after this call
		ellipse(250, 300, 400, 397);//cx,cy, w, h circle 
		
		noStroke();//no outline of shapes
		fill(0, 255, 255);
		triangle(50, 450, 250, 30, 450, 450);//x,y x,y x,y co-ordinates for each vertices 
	
		noStroke();
		fill(200, 200, 200);
		ellipse(250, 250, 200, 100);

		noStroke();
		fill(0, 0, 0);
		ellipse(250, 250, 70, 70);

	}

	/*
	public void draw() {
		background(0, 0, 255); //wipes the screen
		stroke(255, 0, 0); //changes the outline colour for each shape
		fill(255, 255, 0); //fills the shape
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices (x1,y1) (x2, y2) (x3, y3)	
	}	
	*/

	int x = 0; // 4 bytes
	
	/*public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
	}*/
}
