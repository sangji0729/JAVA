package sungwoo.practice;

class Point {
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		
		if(xPos == p.xPos && yPos == p.yPos)
			return true;
		else
			return false;
	}
}

class Rectangle {
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight))
			return true;
		else
			return false;
	}
}
public class practice19_1 {

	public static void main(String[] args) {
	   Point p1 = new Point(6, 12);
	   Point p2 = new Point(6, 12);
	   
	   Rectangle r1 = new Rectangle(4, 12, 6, 15);
	   Rectangle r2 = new Rectangle(4, 12, 6, 15);
	   
	   if(p1.equals(p2))
		   System.out.println("p1, p2 내용 동일하다");
	   else
		   System.out.println("p1, p2 내용 다르다");
	   
       if(r1.equals(r2))
    	   System.out.println("r1, r2 내용 동일하다");
       else
    	   System.out.println("r1, r2 내용 다르다");
	}

}
