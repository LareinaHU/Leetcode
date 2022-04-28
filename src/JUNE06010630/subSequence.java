package JUNE06010630;

public class subSequence {
    public boolean isSubsequence(String s, String t) {
        int length1 = s.length();
        int length2 = t.length();
        if (length1 > length1) return false;
        int p1 = 0;
        int p2 = 0;
        while (p1 < length1 && p2 < length2) {
            if (t.charAt(p1) ==  s.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        if (p1 == length1 - 1) return true;
        else return false;

    }
}
