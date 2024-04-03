import java.util.Arrays;

public class GoodArray {
    public boolean isGood(int[] nums) {
        if(nums.length==1) return false;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==nums.length-1 && nums[i]!=nums[i-1]){
                return false;
            }else if(i<nums.length-1 && nums[i]!=i+1){
                return false;
            }
        }
        return true;
    }
}
