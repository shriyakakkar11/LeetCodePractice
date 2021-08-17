import java.util.Arrays;

class DeleteValue2 {
	int[] nums = new int[] {2,2,2,1,2,2,2,2};
	int val = 2;
	int k = nums.length;
	int count = 0;
	int numSame = 0;
	
	public int removeElement() {
        	for(int i = 0; i < nums.length; i++) {
			if(nums[i] == val) {
				count++;
			}
		}

		numSame = count;
        
        	int kReturned = nums.length - count;
        
        	Arrays.sort(nums, 0, k);
		int j = nums.length - 1;
        
		deletion:
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] == val){
					if(nums[j] != val) {
						nums[i] = nums[j];
						if(j > 0)
							j--;
						else
							break deletion;
					}
					else {
						i--;
						if(j > 0)
							j--;
						else
							break deletion;
					}
				}
			}
        	return kReturned;
	}

	void display() {
		System.out.println("Array is: ");
		for(int i = 0; i < nums.length - numSame; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		DeleteValue2 obj1 = new DeleteValue2();
		int returnedK = obj1.removeElement();
		System.out.println("After Deletion: returnedK = " + returnedK);
		obj1.display();
	}
}