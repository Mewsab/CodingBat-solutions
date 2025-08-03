public class plusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        int[] c = new int[4];

        if (a.length == 2 && b.length == 2){
            c[0] = a[0];
            c[1] = a[1];
            c[2] = b[0];
            c[3] = b[1];
        }
        return c;
    }
}
