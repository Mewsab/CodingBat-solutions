public class close10 {
    public int close10(int a, int b) {

        int aD = Math.abs(a-10);
        int bD = Math.abs(b-10);

        if (aD<bD){
            return a;
        }
        else if (aD>bD){
            return b;
        }
        else
            return 0;
    }

}
