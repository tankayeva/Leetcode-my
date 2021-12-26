package HashTable;


import java.util.*;

public class _811 {

    static class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {


            Map<String, Integer> counts = new HashMap();
            for (String domain : cpdomains) {
                String[] cpinfo = domain.split("\\s+");
                System.out.println("cpinfo: " + Arrays.asList(cpinfo));
                String[] frags = cpinfo[1].split("\\.");
                System.out.println("frags: " + Arrays.asList(frags));
                int count = Integer.valueOf(cpinfo[0]);
                System.out.println(Integer.valueOf(cpinfo[0]));
                String cur = "";
                for (int i = frags.length - 1; i >= 0; --i) {
                    cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                    System.out.println("frags[i]: " + frags[i]);
                    System.out.println("i: " + i);
                    System.out.println("cur: " + cur);
                    counts.put(cur, counts.getOrDefault(cur, 0) + count);
                    System.out.println("counts: " + counts);
                }
            }

            List<String> ans = new ArrayList();
            for (String dom : counts.keySet())
                ans.add("" + counts.get(dom) + " " + dom);
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();


        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        System.out.println(s.subdomainVisits(cpdomains));
    }
}
