
public abstract class Shape {
	protected String name;
	public Shape(String name2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
	}
	
	abstract public float calculateArea();
	abstract public float calculatePerimeter();

	@Override
	public String toString() {
		return "Shape [name=" + name + ", calculateArea()=" + calculateArea() + ", calculatePerimeter()="
				+ calculatePerimeter() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
