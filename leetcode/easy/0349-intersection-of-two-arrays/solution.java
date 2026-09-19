class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i<n1-1;i++){
            if(nums1[i] != nums1[i+1]){
                if(BS(nums2,0,n2-1,nums1[i])){
                    //add
                    ans.add(nums1[i]);
                }
            }
        }
        // add last element
        if(BS(nums2,0,n2-1,nums1[n1 - 1])){
            ans.add(nums1[n1-1]);
        }
      
      int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
    public boolean BS(int[] nums2 ,int i,int j, int temp){

        while(i <= j){
        int mid = (i + j) / 2;
        if(temp == nums2[mid]) return true;

        else if(nums2[mid] > temp){
            j = mid-1;
        }
        else{
            i = mid+1;
        }
        }
        return false;
    }
}