class ValidMountain1 {
	int arr[] = new int[] {4,3,2,1};
	public boolean validMountainArray() {
		int k = arr.length;
		int check = 0;
		int returnCheck = 0;
		for(int i = 0; i < k; i++) {
			if(k < 3) {
				return false;
			}
			else {
				if((i == 0) && (arr[i+1] > arr[i])) {
					continue;
				}
				else if((i == 0) && (arr[i+1] <= arr[i])){
					return false;
				}

				if(i != 0) {
					if(i+1 < k) {
						if(check == 0) {
							if((arr[i+1] > arr[i]) && (arr[i-1] < arr[i])) {
								check = 0;
								continue;
							}

							if((arr[i+1] < arr[i]) && (arr[i-1] < arr[i])) {
								check = 1;
								continue;
							}
							else {
								return false;
							}
						}

						if(check == 1) {
							if((arr[i+1] < arr[i]) && (arr[i-1] > arr[i])) {
								continue;
							}
							else if(((arr[i+1] >= arr[i]) || (arr[i-1] <= arr[i]))) {
								returnCheck = 1;
							}
						}
					}
					if(i == k) {
						if(check == 0) {
							return false;
						}

						if(check == 1) {
							if(arr[i] < arr[i-1]) {
								return true;
							}
							else {
								return false;
							}
						}
					}
				}
			}
		}
		if(check == 1 && returnCheck == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		ValidMountain1 obj1 = new ValidMountain1();
		boolean mountain = obj1.validMountainArray();
		System.out.println("Given array is a mountain array: " + mountain);
	}
}