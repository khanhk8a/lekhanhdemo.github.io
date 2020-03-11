
public class bt5 {
	 public static long tinhGiaithua(int n) {
	        long gt = 1;
	        if (n == 0 || n == 1) {
	            return gt;
	        } else {
	            for (int i = 2; i <= n; i++) {
	            	gt *= i;
	            }
	            return gt;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []A = {1,2,3,4,5};
		double []B = {1,2,3,4,5};
		double S = 0,SC = 0,SL = 0; 
		for(int i=0;i<A.length;i++) {
			if(i%2==0) {
				SC += (A[i]+B[i])/tinhGiaithua(2*(i+1));
			} else {
				SL -= (A[i]+B[i])/tinhGiaithua(2*(i+1));
		
			}
			
		}
		
		S = SC + SL;
		System.out.println("Tổng:" + S);
	}

}
