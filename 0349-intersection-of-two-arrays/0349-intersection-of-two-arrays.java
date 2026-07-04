class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> temp=new HashSet<>();
       HashSet<Integer> temp2=new HashSet<>();
       for(int num:nums1){
        temp.add(num);
       } 
       for(int i=0;i<nums2.length;i++){
           if(temp.contains(nums2[i])){
               temp2.add(nums2[i]);
           }
       }
       int ans[]=new int[temp2.size()];
       int index=0;

       for(int num:temp2){
        ans[index++]=num;
       }
       return ans;

    }
}