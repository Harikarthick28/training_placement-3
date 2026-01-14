class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] count = new int[n+1];

        for(int num:nums){
            count[num]++;
        }
        int dup=-1;
        int miss=-1;
        for(int i=0;i<=nums.length;i++){
            if(count[i]==2) dup=i;
            if(count[i]==0) miss=i;
        }
        return new int[]{dup,miss};
        
    }
}
