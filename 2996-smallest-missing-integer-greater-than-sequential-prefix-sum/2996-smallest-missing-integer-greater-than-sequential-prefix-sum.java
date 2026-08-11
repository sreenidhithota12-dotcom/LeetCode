class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum=nums[0];
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        for(int i=1;i<n;i++){
            if(nums[i] != nums[i-1]+1){
                break;
            }
            sum+=nums[i];
        }
        while (set.contains(sum)) {
            sum++;
        }
        return sum;
        
    }
}