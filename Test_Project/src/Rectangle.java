
public class Rectangle extends Shape {
	private float longs;
	private float width;

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return longs*width;
	}

	@Override
	public float calculatePerimeter() {
		// TODO Auto-generated method stub
		return (longs + width) *2;
	}

	public float getLongs() {
		return longs;
	}

	public void setLongs(float longs) {
		this.longs = longs;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public Rectangle(float longs, float width, String name) {
		super(name);
		this.longs = longs;
		this.width = width;
	}

	
}
