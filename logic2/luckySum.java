public class luckySum {
    public int luckySum(int a, int b, int c) {
        int sum = 0;

        if (a != 13 && b!=13 && c!=13 ) {
            sum =a+b+c ;
        }
        else if (a != 13 && c != 13) {
            sum += a;
        }
        else if (a != 13 && b != 13) {
            sum=a+b;
        }
        else if (c != 13 && a != 13) {
            return sum=0;
        }
        else if (a!=13){
            sum+=a;
        }
        return sum;
    }
}
