class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        find(nums, 0, temp);
        return ans;
    }
    public void find(int[] nums, int n, List<Integer> temp) {
        ans.add(new ArrayList<>(temp));
        for (int i = n; i < nums.length; i++) {
            if (i > n && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            find(nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }

    }
