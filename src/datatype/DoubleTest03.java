package datatype;

public class DoubleTest03 {

	public static void main(String[] args) {
		
		double sum=0;
		
		for(int i=0;i<1000; i++) {
			sum = sum+0.1;
			
		}

			System.out.printf("0.10을 10번 더하면? %.6f", sum);
			
	}

}
