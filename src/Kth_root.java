public class Kth_root {
    public static void main(String[] args) {
        int n = 143;
        int k = 3;
        System.out.println(Kth_root(n, k));

    }

    public static int Kth_root(int n, int k) {
        int lo = 1;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }

        }
        return ans;

    }

}
