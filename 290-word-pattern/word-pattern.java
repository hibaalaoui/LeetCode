class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i=0; i<arr.length; i++){
            String s1 = arr[i];
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!s1.equals(map.get(c))) {
                    return false;
                }
            } else if (map.containsValue(s1)) {
                return false;
            } else {
                map.put(c, s1);
            }
        }
        return true;
    }
}