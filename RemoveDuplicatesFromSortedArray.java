class RemoveDuplicatesFromSortedArray {
	int[] nums = new int[] {1,2};
	int k = nums.length;
	int a, index = 0;

	public int removeDuplicates() {
		for(int i = 0; i < k; i++) {
			a = i + 1;
			if ((a) < k) {
				if(nums[i] != nums[a]) {
					nums[index] = nums[i];
					index++;
				}
				else {
					int j = 0;
					while(nums[i] == nums[i+j]) {
						j++;
						if((i + j) >= k)
							break;
					}
					j-- ;
					nums[index] = nums[i + j];
					index++;
					i = i + j;
				}
			}

			if(k == 1) {
				nums[index] = nums[i];
				index++;
			}

			if(((i + 1) >= k) && ((i - 1) >= 0)) {
				if(nums[i] != nums[i-1]) {
					nums[index] = nums[i];
					index++;
				}
			}
		}
		k = index;
		return k;
	}

	public void display() {
		System.out.println("The array is: ");
		for(int i = 0; i < k; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray obj1 = new RemoveDuplicatesFromSortedArray();
		System.out.println("Before removal of duplicates: ");
		obj1.display();
		int returnedK = obj1.removeDuplicates();
		System.out.println("After removal of duplicates, unique values remained = " + returnedK);
		obj1.display();
	}
}