import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSumV1(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }
    public int[] twoSumV2(int[] nums, int target) {

        Map<Integer, Integer> map=new HashMap();
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],j);
            //前提是没有多个解，但是数组里可能有重复的数字，有两种情况：
            // 一种是重复数字是解，那么重复数字只可能出现两次，且这两个重复的数字为解。否则就会出现多个解
            // 因此在后面判断的时候，先找到第一个数字，而map中会保留后加入map的另一个数字
            //第二种是重复数字不是解，那么即使重复覆盖也没有影响
        }
        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(map.containsKey(value)&&map.get(value)!=i){//防止i,j重复
                return new int[]{i,map.get(value)};
            }
        }
        throw new IllegalArgumentException("No solution");
    }

}
