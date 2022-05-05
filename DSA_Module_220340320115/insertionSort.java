/*Assume you are given the array a1=[1,2,4,5,3] indexed 0…4. Store the value of a1[4]. 
Now test lower index values successively from 3 to 0 until you reach a value that is lower than a1[4] , 
at a1[1] in this case. Each time your test fails, copy the value at the lower index to the current 
index and print your array. When the next lower indexed value is smaller than a1[4], 
insert the stored value at the current index and print the entire array. */
import java.util.*;
class insertionSort{
	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1[] = new int[n];
		int temp, j;
		
		for (int i=0; i<n; i++)
			a1[i] = sc.nextInt();
		
		for (int i=1; i<a1.length; i++){
			temp = a1[i];
			j=i;
			while(j>0 && a1[j-1]>temp){
				a1[j] = a1[j-1];
				j--;
			}
			a1[j] = temp;
			for(int a : a1)
				System.out.print(a+" ");
			System.out.println(" ");
		}

	}
}