class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int i = 0 ; 
        int j = 0;
        
        while(i < n1 && j < n2){
            if(a[i] < b[j]){
                set.add(a[i]);
                i++;
            }else{
                set.add(b[j]);
                j++;
            }
            
        }
        
        while(i < n1){
          set.add(a[i]);
          i++;
        }
        while(j < n2){
          set.add(b[j]);
          j++;
        }
       
        
        
        return new ArrayList<>(set);
    }
}
