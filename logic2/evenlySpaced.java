public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        int medium = a + b + c - small - large;

        int diff1 = medium - small;
        int diff2 = large - medium;

        if (diff1 == diff2) {
            return true;
        } else {
            return false;
        }
    }
}
