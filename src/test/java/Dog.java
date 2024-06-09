public class Dog {
    int max(int a, int b) {
        return a > b ? a : b;
    }

    // so nguyen to: chia het cho 1 va chinh no.
    //n: khong chia het cho so nao tu 2 den n-1

    boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    void bark(){
        System.out.println(" Gâu gâu... ");
        System.out.println(" Gâu gâu... ");
        System.out.println(" Gâu gâu... ");
        return;
    }
}
