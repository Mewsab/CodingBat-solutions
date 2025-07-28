public class intMax {
    public int intMax(int a, int b, int c) {
        int max;

        if (a<b){
            max = b;
        }
        else{
            max = a;
        }

        if (c > max){
            max = c;
        }
        return max;

    }

}
