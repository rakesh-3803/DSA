package sjb.TimeComplexity;

public class Lsearch {
	public int linearSearch(int[]arr,int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return i;
			}
			
		}
		return -1;
	}


}
