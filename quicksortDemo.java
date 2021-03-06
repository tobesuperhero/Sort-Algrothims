import java.util.*;
public class quicksortDemo{
	public static void main(String[] args){
		int[] a =new int[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Your input and before sort is:" + Arrays.toString(a));
		quicksort(a,0,a.length-1);
		System.out.println("After sort, the result is:" + Arrays.toString(a));
	}
	public static void quicksort(int[] a, int low, int high){
		int i=low,j=high;
		int key=a[low];
		int temp;//用于交换
		while(i<j){
			//从后往前排
			while(i<j&&a[j]>=key){
				j--;
			}
			if(a[j]<key){
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			while(i<j&&a[i]<=key){
				i++;
			}
			if(a[i]>key){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		if(i>low)
			quicksort(a,low,i-1);
		if(j<high)
			quicksort(a,j+1,high);
	}
}