package terminated;


public class TheThread  extends Thread{
	
	public void run() {
		printFibonaci(150);
		System.out.println(this.getName() + " status is terminated");
	}
	
	public void printFibonaci(int n) {
		int privous = 0;
		int current = 0;
		int count = 0;
		
		while(count < n) {
			count ++;
			
			if(current == 0) {
				System.out.println(this.getName() + ": " + current);
				current = 1;
				continue;
			}
			
			System.out.println(this.getName() + ": " + current );
			int tmp = privous;
			privous = current;
			current = tmp + privous;
		}
	}
	
	
	public static void main(String[] args) {
		TheThread t1 = new TheThread();
		TheThread t2 = new TheThread();
		TheThread t3 = new TheThread();
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

