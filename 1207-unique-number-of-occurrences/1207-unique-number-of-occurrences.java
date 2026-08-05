class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0 ; i < arr.length ; i++ ){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        for(int i : mp.values()){
         
          if(set.contains(i))
           return false;

            set.add(i);
        }
        return true;
    }
}