import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		int[] numbers0 = {5, 8, 2, 3, 9, 4, 1, 6, 7, 10};
		
		Arrays.sort(numbers0);
		System.out.println("The element of array are");
		
		for(int x : numbers0){
			System.out.printf("%d%n", x);
		}
		
		System.out.println("Binary search");
		int index = Arrays.binarySearch(numbers0, 3);
		System.out.printf("The index number of 3 is %d%n", index);
		
		int[] a = {13, 65, 41};
		int[] b = {20, 37, 19};
		
		boolean isEqual = Arrays.equals(a, b);
		System.out.printf("The result is %b%n", isEqual);
		
		int age = 2026 - 2006;
		
		System.out.printf("I am %d years old %n", age);
		
		int[] arr1 = {23, 54, 23, 61, 32};
		int[] copyArr = Arrays.copyOf(arr1, 3);
		
		System.out.printf("We copied");
		for(int y : copyArr){
			System.out.printf("%d%n", y);
		
		System.out.println(Arrays.toString(arr1));
		}
		
		
		int[][] number02 = {
			{11, 21, 25},
				{23, 41, 32}
		};
		System.out.println(Arrays.deepToString(number02));
	}
}