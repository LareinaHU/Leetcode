package Math;

public class CountPrimes204 {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n*n];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (notPrime[i] == false) count++;
            for (int j = 2; i * j <= n; j++){
                notPrime[i*j]= true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPrimes204 cc = new CountPrimes204();
        int result = cc.countPrimes(11);
        for(int i = 1; i <= 11; i++){
            System.out.print(i+",");
        }
        System.out.println(result);
    }
}
