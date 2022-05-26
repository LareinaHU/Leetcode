public class path {
    public static int numOfPathsToDest(int n) {
        // your code goes here
        if(n <= 1) return n;

        int res = 0;
        for(int i = 0;i <= n -1; i++){
            for(int j = 0;j <= i;j++){
                if(i>=j && i == n -1 && j == n - 1){
                    res ++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
