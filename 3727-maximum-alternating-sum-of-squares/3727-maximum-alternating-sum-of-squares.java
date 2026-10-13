class Solution {
    void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }
    void merge(int[] nums, int low, int mid, int high) {
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

    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++) nums[i]=Math.abs(nums[i]);
        mergeSort(nums, 0, n-1);
        long posSum=0,negSum=0;
        for(int i=0;i<n/2;i++){
            posSum+= nums[n-i-1] * nums[n-i-1];
            negSum+= nums[i]*nums[i];
        }
        if(n%2==1) posSum+=nums[n/2] * nums[n/2];
        return posSum-negSum;
    }
}