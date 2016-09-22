package test;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testThread t1 = new testThread("First Test");
		testThread t2 = new testThread("Second Test");
		t1.start();
		t2.start();
		
		
		}

}
