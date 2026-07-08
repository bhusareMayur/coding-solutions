class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // with space O(1)
        int m = nums1.length;
        int n = nums2.length;
        int mn = m+n;

        int prev = nums1[0];
        int curr = nums1[0];
        int i = 0 ; 
        int j = 0;
        int k = 0;
        while(k <= (mn / 2) && i < m && j < n){
            prev = curr;
            if(nums1[i] < nums2[j]){
                curr = nums1[i];
                i++;
            }else{
                curr = nums2[j];
                j++;
            }
            k++;
        }
        System.out.println("curr : "+curr);
        System.out.println("Prev : "+prev);
    if(mn % 2 == 0){
        return (double)( prev + curr ) / 2.0;
    }

    return (double)curr;

    }
}