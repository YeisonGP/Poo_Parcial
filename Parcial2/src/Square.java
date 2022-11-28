
public class Square extends Rectangle{

	private double side;


	public Square() {
        this.color = "blue";
        this.side= 6;
        this.filled = true;
        this.length = side;
        this.width = side;
	}
	

	public Square(double side) {
		this.side = side;
        this.length = side;
        this.width = side;
	}


	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}


	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
	}

	@Override
	public void setLength(double length) {
		super.setLength(length);
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}
	
	
	
	
}