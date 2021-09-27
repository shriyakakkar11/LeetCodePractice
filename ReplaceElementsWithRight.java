class ReplaceElementsWithRight{
	int[] arr = new int[] {9,8,7,6,5,4,3,2,1};
	public int[] returnElements() {
		int k = arr.length;
		int max = 0;

		if(k == 0){
			return arr;
		}

		if(k == 1) {
			arr[0] = -1;
			return arr;
		}

		for(int i = 0; i < k-1; i++) {
			max = arr[i+1];
			for(int j = i+1; j < k-1; j++){
				if(arr[j+1] > max){
					max = arr[j+1];
				}
			}
			arr[i] = max;
		}
		arr[k-1] = -1;
		return arr;
	}

	public void display(int[] arr) {
		System.out.println("The array is: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		ReplaceElementsWithRight obj1 = new ReplaceElementsWithRight();
		int[] arr = obj1.returnElements();
		obj1.display(arr);
	}
}