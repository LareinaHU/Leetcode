public class leetcode551 {
    public boolean checkRecord(String s) {
        int l = s.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
        }
        return count < 2 && s.indexOf("LLL") < 0;
    }
}


