import java.util.Scanner;

public class SxMang {
	public static Scanner scanner = new Scanner(System.in);
    
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
//        sortASC(arr);
//        System.out.println("Dãy số được sắp xếp tăng dần: ");
//        show(arr);
        // sắp xếp dãy số theo thứ tự tăng dần loại bỏ
        sortDEL(arr);
       
        
    }
     
    /**
     * sắp xếp mảng số nguyên theo thứ tự tăng dần
     * 
     * @param arr: mảng các số nguyên
     * @param n: số phần tử của mảng
     */
//    public static void sortASC(int [] arr) {
//        int temp = arr[0];
//        for (int i = 0 ; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//    }
    public static void sortDEL(int [] arr) {
      int k = 0;
      int n= arr.length;
      for (int i=0;i<n-1;i++){
    	   int j=i+1;
    	    while (j<n)
    	      if (arr[i]==arr[j]){
    	         for (k=j;k<n-1;k++) arr[k]=arr[k+1];
    	         n--;
    	      }
    	      else j=j+1;
    	   }
        System.out.println("Dãy số được sắp xếp tăng dần loại bỏ số giống nhau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
     
    /**
     * in các phần tử của mảng ra màn hình
     * 
     * @param arr: mảng các số nguyên
     * @param n: số phần tử của mảng
     */
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
