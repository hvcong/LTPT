
public class App {
	public static void main(String[] args) {
		Management mgt= new Management();
		
		Circle c1 = new Circle(5, "circle");
		Circle c2 = new Circle(4, "Circle 2");
		
		Rectangle r1 = new Rectangle(5, 2, "Rectangle 1");
		
		mgt.add(c1);
		mgt.add(c2);
		mgt.add(r1);
		
		mgt.toString();
	}
}
