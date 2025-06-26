
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sMap = new HashMap();
        Set<Character> tSet = new HashSet();

        for (int i = 0; i < s.length(); ++i) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar || !tSet.contains(tChar)) {
                    return false;
                }
            } else {
                if (tSet.contains(tChar)) {
                    return false;
                }
                sMap.put(sChar, tChar);
                tSet.add(tChar);
            }
        }
        return true;
    }
}