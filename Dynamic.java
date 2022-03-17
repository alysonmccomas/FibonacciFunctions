package CEN3024;

public class Dynamic extends Thread{
	
	static public int fibonnaci(int n) {
		int v1 = 0, v2 = 1, v3 = 0, i;
		for (i = 2; i <= n; ++i) {
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
		}
		return v3;
	}
	public void run() {
		//long runTime = System.currentTimeMillis();
		long startTime = System.nanoTime();
		int fibNum = fibonnaci(13);
		//runTime = System.currentTimeMillis() - runTime;
		startTime = System.nanoTime() - startTime;
		//System.out.println("Dynamic Thread found the answer: " + fibNum + " in " + runTime + " ms");
		System.out.println("Dynamic Thread found the answer: " + fibNum + " in " + startTime + " nanoseconds");

	}
}
