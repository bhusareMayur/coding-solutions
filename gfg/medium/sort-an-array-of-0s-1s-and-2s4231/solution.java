class Solution {
    public void sort012(int[] arr) {
        // code here
        int z = 0;
        int o = 0;
        int t = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] == 0) z++;
            else if(arr[i] == 1) o++;
            else t++;
        }
        
       int i = 0;
       while(z > 0){
           arr[i] = 0;
           i++;
           z--;
       }
       while(o > 0){
           arr[i] = 1;
           i++;
           o--;
       }
       while(t > 0){
           arr[i] = 2;
           i++;
           t--;
       }
    }
}