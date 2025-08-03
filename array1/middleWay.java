public class middleWay {
    public int[] middleWay(int[] a, int[] b) {
        int[] c = new int[2];

        if (a.length == 3 && b.length == 3) {
            c[0] = a[1];
            c[1] = b[1];
        }
        return c;
    }
}
