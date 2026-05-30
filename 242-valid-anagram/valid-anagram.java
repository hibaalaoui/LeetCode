class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (char r : s.toCharArray()) {
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (map.getOrDefault(c, 0)==0) return false;
            else map.put(c, map.get(c) - 1);
        }
        return true;
    }
}