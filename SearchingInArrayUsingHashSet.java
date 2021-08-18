import java.util.*;

class SearchingInArrayUsingHashSet {
	int[] arr = new int[] {0,0};
	int count = 0;

	public boolean checkIfExist() {
		HashSet<Integer> h = new HashSet<Integer>();

		if(arr.length == 0) {
			return false;
		}

		for(int i = 0; i < arr.length; i++) {
			h.add(arr[i]);
		}

		int twice = 0;

		for(int i = 0; i < arr.length; i++) {
			if( arr[i] == 0) {
				count++;
			}
			else{

				twice = (2 * arr[i]);


				if(h.contains(twice)) {

					return true;

				}


				if(((arr[i] % 2) == 0)) {

					int half  = arr[i] / 2;

	
					if(h.contains(half)) {

						return true;

					}

				}


			}
		}

		if(count > 1) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		SearchingInArrayUsingHashSet obj1 = new SearchingInArrayUsingHashSet();
		boolean exists = obj1.checkIfExist();
		System.out.println("Does there exist 2 indices where one is the double of another? " + exists);
	}
}