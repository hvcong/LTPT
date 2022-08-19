
public class Square extends Shape {
	private float side;
	
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return side*side ;
	}

	@Override
	public float calculatePerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public Square(float side, String name) {
		super(name);
		this.side = side;
	}

	
	
}
