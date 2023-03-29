import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = new int[] {51, 23, 67};
		Arrays.sort(arr);
		for(int x : arr) {
			System.out.println(x);
		}
		
		// neues array und das alte verschieben
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i ++) {
			newArr[i] = arr[i];
		}
		newArr[3] = 123;
		for(int x : newArr) {
			System.out.println(x);
		}
	}
}
