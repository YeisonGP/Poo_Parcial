
public class Rectangle extends Shape {

    protected double width=1.0;
    protected double length=1.0;

	
	public Rectangle() {
		this.color = "grean";
		this.filled= true;
		this.width=3.1;
		this.length=4.5;
		this.area=13.95;
		this.perimeter=55.8;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}


	public Rectangle(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
	}
	
    Rectangle(double width, double length, String color,boolean filled) {
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		area = width*length;
		return area;
	}

	@Override
	public double getPerimeter() {
		perimeter= (width*2)+(length*2);
		return 0;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}
	
	

}
