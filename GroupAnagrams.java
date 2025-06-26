import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < count.length; ++i) {
                sb.append((char) ('a' + i)).append(count[i]);
            }

            String key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(key);

        }
        return new ArrayList<>(map.values());
    }
}