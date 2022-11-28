
public class Circle extends Shape {

	protected double radius = 1.0;
	
    Circle(){
        this.color = "blue";
        this.radius = 4.2;
        this.filled = true;
        this.area = 50;
        this.perimeter = 20;
    }

    Circle(double radius) {
        this.setRadius(radius);
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.setRadius(radius);
    }
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	@Override
	public double getArea() {
		area = (radius*radius)*3.14;
		return area;
	}

	@Override
	public double getPerimeter() {
		perimeter = 2*Math. PI*radius;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}
	
	
		
}
