class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> list1 = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s : string_list){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            List<String> sList = new ArrayList<>();
            if(map.containsKey(key)){
                sList = map.get(key);
            }
            if(!list1.contains(key)){
                list1.add(key);
            }
            sList.add(s);
            map.put(key,sList);
        }
        for(String key : list1){
            list.add(map.get(key));
        }
        return list;
    }
}
