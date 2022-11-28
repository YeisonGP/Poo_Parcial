
public class Main {

	public static void main(String[] args) {
		System.out.println("Probst Guillermo Yeison - Parcial 2");
		
		//objetos consigna
        Shape s1 = new Circle(4.5, "red",false);
        Shape s2 = new Circle();
            s2.setFilled(false);
            s2.setColor("orange");
        Shape s3 = new Rectangle(1.0, 3.0, "black", false);
        Shape s4 = new Square(6);

        //constructor
        Shape s5 = new Rectangle();
        Shape s6 = new Rectangle(4, 8);
        Shape s7 = new Rectangle(6, 12, "blue", true);
        Shape s8 = new Square();
        Shape s9 = new Square(9.7);
        Shape s10 = new Square("red", true, 3);
        Shape s11 = new Circle();
        Shape s12 = new Circle(2.5);
        Shape s13 = new Circle(22.3, "cyan", true);
        
        //setter
        Circle s14 = new Circle();
        s14.setColor("gray");
        s14.setFilled(false);
        s14.setRadius(3.8);
        
       Rectangle s15 = new Rectangle();
        s15.setColor("white");
        s15.setLength(10);
        s15.setWidth(5);
        s15.setFilled(true);
        
        Square s16 = new Square();
        s16.setColor("cyan");
        s16.setLength(5);
        s16.setWidth(5);
        s16.setFilled(true);
        
        
        
        System.out.println("Figura numero 1: " + s1 );
        System.out.println("\nFigura numero 2: " + s2 );
        System.out.println("\nFigura numero 3: " + s3 );
        System.out.println("\nFigura numero 4: " + s4 );
        System.out.println("\nFigura numero 5: " + s5 );
        System.out.println("\nFigura numero 6: " + s6 );
        System.out.println("\nFigura numero 7: " + s7 );
        System.out.println("\nFigura numero 8: " + s8 );
        System.out.println("\nFigura numero 9: " + s9 );
        System.out.println("\nFigura numero 10: " + s10 );
        System.out.println("\nFigura numero 11: " + s11 );
        System.out.println("\nFigura numero 12: " + s12 );
        System.out.println("\nFigura numero 13: " + s13 );
        System.out.println("\nFigura numero 14: " + s14 );
        System.out.println("\nFigura numero 15: " + s15 );
        System.out.println("\nFigura numero 16: " + s16 );
        
        
	}

}
