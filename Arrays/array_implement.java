package arrays;
import java.util.*;

public class array_implement {
	public static void main (String[] args) {
		int index,pos,val;
		Scanner sc = new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the number of elemnets of Arrays");
		index = sc.nextInt();
		
		//creating array
		int[] arr1 = new int[index];
		//creating a new array
		int[] arr2 = new int[index+1];
		
		//saving values
		System.out.println("Enter Values");
		for (int i=0; i<index; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("enter index");
		pos = sc.nextInt();		//2
		System.out.println("enter new value");
		val = sc.nextInt();		//40
		
		//entering new value
		for (int i=0; i<index+1; i++) {		//10 20 30
			if (i<pos) {					
				arr2[i]=arr1[i];			//10 20
			}
			else if (i==pos) {				//40
				arr2[i]= val;
			}
			else {							//30
				arr2[i] = arr1[i-1];
			}
		}
		
		//reading values from new array arr2
		System.out.println("elements are:");
		for (int i=0; i<index+1; i++) {
			System.out.println(arr2[i]);
		}
	}
}
