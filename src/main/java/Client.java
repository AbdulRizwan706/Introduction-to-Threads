
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am the main class");
		
		Adder add = new Adder();
		ScalerThread t1 = new ScalerThread(add);
		t1.start();
		
		Subtractor sub = new Subtractor();
		ScalerThread t2 = new ScalerThread(sub);
		t2.start();
	}

}
