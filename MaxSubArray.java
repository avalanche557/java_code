
public class MaxSubArray {
	public void array(int[] arr, int k) {
		int n = arr.length;
		int j;
		for (int i = 0; i <= n-k ; i++) {
			int max = arr[i];
			for( j= 1; j < k; j++){
				if(arr[i+j] > max){
					max = arr[i+j];
				}
			}
			System.out.println(max);
		}
	}
	public static void main(String args[]) {
		MaxSubArray max = new MaxSubArray();
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k =3;
		max.array(arr, k);
	}
}
