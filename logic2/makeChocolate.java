public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBigBars = goal / 5;

        if (maxBigBars > big) {
            maxBigBars = big;
        }
        int remaining = goal - (maxBigBars * 5);

        if (remaining <= small) {
            return remaining;
        } else {
            return -1;
        }
    }
}
