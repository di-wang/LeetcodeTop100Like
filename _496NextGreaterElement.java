import java.util.Arrays;

public class _496NextGreaterElement {
	    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
	        //think as the computer, view the problem as the data structure do, not human perception
	        int len1 = findNums.length;
	        int len2 = nums.length;
	        int[] output = new int[len1];
	        // while loop, before reach end of nums, find out if the nums[j] is large than find nums, return that number
	        for (int i=0; i<len1; i++ ){
	            output[i] = -1;
	            
	            int index =0;
	            for (index = 0; index<len2; index++){
	            	if (findNums[i] == nums[index] ) break;
	            }
	            System.out.println(findNums[i]+" index: "+index);
	            int j = index+1;
	            while (j < len2 ){
	            	
	                if(nums[j] > findNums[i]) {              
	                    output[i] = nums[j];
	                    break;
	                } 
	                j++;
	            }
	        }
	        return output;
	    }
	    public static void main(String[] args){
	    	int[] x = new int[]{4,1,2,6,8,10};
	    	int[] y = new int[]{1,3,4,6,2,9,8,10,100,12};
	    	int[] output =nextGreaterElement(x,y);
	    	System.out.println(Arrays.toString(output));
	    	
	    	
	    	
	    }
}
