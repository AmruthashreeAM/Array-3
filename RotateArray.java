package Array3;

public class RotateArray {
	//TC : o(n) + o(k) + o(nk) = o(nk)
	//sc: o(1)
	class Solution {
	    public void rotate(int[] nums, int k) {
	        if(nums.length == 0 || nums == null) return;
	        int n = nums.length;
	        if(k>=n) k = k%n;
	        reverse(nums, 0, n-1);
	        reverse(nums, 0, k-1);
	        reverse(nums, k, n-1);
	    }
	    
	    
	    private void reverse(int[] nums, int l, int r){
	        while(l<r){
	            swap(nums, l, r);
	            l++;
	            r--;
	        }
	    }
	    
	    private void swap(int[] nums, int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	}
}
