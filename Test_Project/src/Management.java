import java.util.ArrayList;
import java.util.Objects;

public class Management implements Function {
	private ArrayList<Shape> list;
	
	public Management() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Shape>();
	}
	
	public boolean add(Shape s) {
		if(!Objects.isNull(s)) {
			
			list.add(s);
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		return "";
	}
	
}
