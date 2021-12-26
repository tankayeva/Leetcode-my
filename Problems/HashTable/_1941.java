package HashTable;

import java.util.HashMap;
import java.util.Map;

public class _1941 {

    class Solution {
        public boolean areOccurrencesEqual(String s) {

            Map<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);

            }


            int val = map.get(s.charAt(0));

            for (char c : map.keySet()) {
                if (map.get(c) != val)
                    return false;
            }

        /*
        for(int i=0;i<s.length();i++){
            if(c!=map.get(s.charAt(i))){
                return false;
            }
        } */
            return true;


        }
    }
}
