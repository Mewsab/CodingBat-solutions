public class max1020 {
    public int max1020(int a, int b) {
        if (a<b){
            int temp = a;
            a=b;
            b = temp;
        }

        if (a>= 10 && a<= 20){
            return a;
        }
        else if (b>= 10 && b<= 20){
            return b;
        }
        else
            return 0;
    }

}
