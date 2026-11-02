class Solution {
    public void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }
    public void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= high) {
            temp[k++] = nums[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }

    public int minMoves2(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        int n = nums.length;
        int mid1 = (n - 1) / 2;
        int mid2 = n / 2;
        int ele = (nums[mid1]+nums[mid2])/2;
        int ans=0;
        for(int x: nums) ans+=Math.abs(x-ele);
        return ans;
    }
}