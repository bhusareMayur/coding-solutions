class Solution {
    public int firstRepeated(int[] arr) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i = 0 ; i < n;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        
        for(int i = 0 ;i < arr.length;i++){
            if(freq.get(arr[i]) > 1) return i+1;
        }
        return -1;
    }
}
