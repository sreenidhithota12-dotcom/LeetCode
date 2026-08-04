class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        int s=nums.size();
        int mini=INT_MAX,maxi=INT_MIN;
        vector<int> sol;
        for(int x:nums){
            mini=min(mini,x);
            maxi=max(maxi,x);
        }
        for(int j=mini+1;j<maxi;j++){
            if (find(nums.begin(), nums.end(), j) == nums.end()) {
                sol.push_back(j);
            }
        }
        if(sol.empty()) return{};
        return sol;
    }
};