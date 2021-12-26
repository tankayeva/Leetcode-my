package string;

import java.util.ArrayList;

class _2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        ArrayList<String> list = new ArrayList<>();

        for (String s : sentences) {
            for (String ss : s.split(" ")) {
                list.add(ss);
            }
            if (max < list.size()) {
                max = list.size();

            }
            list.clear();

        }
        return max;
    }
}