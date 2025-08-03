public class blackJack {
    public int blackjack(int a, int b) {
        if (a > 21) {
            a = 0;
        }
        if (b > 21) {
            b = 0;
        }
        int result = Math.max(a, b);
        return result;
    }
}
