package string;

class Solution1694 {
    public String reformatNumber(String number) {
        number = number.replaceAll("\\s|-", "");

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < number.length() - 4) {
            sb.append(number.substring(i, i + 3)).append("-");
            i += 3;
        }

        if (number.length() - i == 4) {
            sb.append(number.substring(i, i + 2)).append("-");
            i += 2;
        }
        sb.append(number.substring(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1694 s = new Solution1694();

        System.out.println(s.reformatNumber("1-23-45 6"));
    }
}

/* Appr 2
   StringBuilder sb = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) sb.append(c);
        }
        int i = 0;
        while(i < sb.length()-4) {
            sb.insert(i+3, '-');
            i+=4;
        }

        if (sb.length() - i == 4) {
            sb.insert(i+2, '-');
        }
        return sb.toString();
        */