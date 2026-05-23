class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean present = false;
        HashSet<Integer> hash = new HashSet();
        for(int i=0;i<nums.length;i++)
        {
           if(hash.contains(nums[i])){
            
            present = true;
           }
           else 
           hash.add(nums[i]);
        }
        if(present)
            return true;
        else
            return false;
    }
}