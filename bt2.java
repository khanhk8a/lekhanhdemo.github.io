import java.util.Arrays;
import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.PUSH;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random rd = new Random();
//		int[] arr = new int[30];
//        for (int i = 0; i < arr.length; i++) {
//        	arr[i] = rd.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
		int l,d,s;
		int[] arr = {1,-2,3,-4,5,6,-7,8,9,-10};
        int count = 0;
        int count1 = 0;
        int LE[] = new int[30];
        int DUONG[] = new int[30];
        l=d=s=0;
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i] % 2 != 0) {
        		LE[l]= arr[i];
        		l++;
        		count++;
        	}
        }
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]>=0){
        		DUONG[d]= arr[i];
        		d++;
        		count1++;
        	} else {
        		s += arr[i];
        	}
        }
        
        System.out.println("Các phần tử của mảng lẻ là: ");
        for (int i = 0; i < l; i++) {
            System.out.print(LE[i] + "\t");
        }
       
        System.out.println("tổng số lẻ là: " + count);
        
        System.out.println("Các phần tử của mảng số dương là: ");
        for (int i = 0; i < d; i++) {
            System.out.print(DUONG[i] + "\t");
        }
        System.out.println("tổng số dương: " + count1);
        System.out.println("tổng số âm: " + s);
	}

	

}
