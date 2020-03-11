
public class bt3 {
	public static void main(String[] args) {
		int a = 2;
		int[] arr = {2,3,4,0,-1,-4,2,4,7,199,200,-9,-333,23,-10,21};
		int q = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>a) {
				q++;
			}
		}
		System.out.println("Tổng số phần tử trong mảng > a : "+ q);
		int tong = 9*q+a;
		System.out.println("Tổng: "+ tong);
	}
}
