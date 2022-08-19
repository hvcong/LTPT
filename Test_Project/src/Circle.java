
public class Circle extends Shape {
	private float radius;

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return (float) (radius * radius * 3.14);
	}

	@Override
	public float calculatePerimeter() {
		// TODO Auto-generated method stub
		return (float) (radius*2*3.14);
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle(float radius, String name) {
		super(name);
		this.radius = radius;
	}

	

}
