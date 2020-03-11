
public class bt1 {
	static String N1 ="PT VSN";
	static String N2 ="PT VN";
	static String N3 ="PT CO 1 Nghiem Duy Nhat ";
	static double x = 0;
	
	public static void PTBN(double a, double b) {
		
		if(a==0) {
			if(b==0) {
				System.out.println(N1);
			} else {
				System.out.println(N2);
			}
		} else {
			x = -b/a;
			System.out.println(N3 + x);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []A = {1,3,4,2,-1,0,0,4,0,7};
		double []B = {2,-3,2,-2,6,10,80,-64,0,7};
		double []X = new double[10];
		double max = X[0];
		double tong = 0;
		int l = 0;
		for(int i=0;i<A.length;i++) {
			PTBN(A[i],B[i]);
			
			if(A[i] != 0 && B[i] != 0) {
				X[l]= x;
        		l++;
			}
			
		}
		 System.out.println("Các phần tử của mảng  là: ");
	        for (int i = 0; i < l; i++) {
	            System.out.print(X[i] + "\t");
	            tong += X[i];
	        }
	        for (int i = 0; i < l; i++) {
	        	
	        	 if (max < X[i])
	                 max = X[i];
	         
	        }
		System.out.println("Tổng các x PT 1 nghiệm là: "+tong);
		System.out.println("Giá trị x lớn nhất: "+ max);
		
	}

}
