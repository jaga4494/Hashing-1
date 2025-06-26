import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); ++i) {
            Character c = pattern.charAt(i);
            String w = words[i];

            if (!charMap.containsKey(c)) {
                if (strMap.containsKey(w)) {
                    return false;
                }
                strMap.put(w, c);
                charMap.put(c, w);
            } else {
                if (!charMap.get(c).equals(w)) {
                    return false;
                }
            }
        }
        return true;
    }
}