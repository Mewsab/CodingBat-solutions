public class blueTicket {
    public int blueTicket(int a, int b, int c) {
        int abSum = a+b;
        int bcSum = b+c;
        int acSum = a+c;

        if (abSum == 10 || bcSum == 10 || acSum == 10){
            return 10;
        }
        else if (abSum >= 10+bcSum || abSum>= 10+acSum){
            return 5;
        }
        else
            return 0;
    }
}
