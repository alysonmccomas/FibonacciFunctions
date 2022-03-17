package CEN3024;

public class Recursive extends Thread{
	
	static public int fibonnaci(int n) {
		if (n == 0) {
			return 0;
		}else if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonnaci(n-1) + fibonnaci(n-2);
		}
	}

	public void run() {
		//long runTime = System.currentTimeMillis();
		long startTime = System.nanoTime();
		int fibNum = fibonnaci(13);
		//runTime = System.currentTimeMillis() - runTime;
		startTime = System.nanoTime() - startTime;
		//System.out.println("Recursive Thread found the answer: " + fibNum + " in " + runTime + " ms");
		System.out.println("Recursive Thread found the answer: " + fibNum + " in " + startTime + " nanoseconds");
	}
}