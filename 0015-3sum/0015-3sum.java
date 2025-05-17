class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // Sort the array 
        Arrays.sort(nums);

        for(int i = 0; i<nums.length-2; i++){
            // skip duplicate element for i : 
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            
            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // Skip Suplicate elements for j.
                    while(j<k && nums[j] == nums[j+1]){
                        j++;
                    }
                    // Skip Suplicate elements for k.

                    while(j<k && nums[k] == nums[k-1]){
                        k--;
                    }
                    // Move the pointers.
                    j++;
                    k--;
                }
                else if (sum < 0){
                    j++; 
                }else{
                    k--;
                }
            }
        }
        return ans;
    }
}