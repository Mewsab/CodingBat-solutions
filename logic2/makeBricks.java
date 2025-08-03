public class makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int maxBigBricksUse = goal / 5;
        int bigBricksUsed = Math.min(big, maxBigBricksUse);
        int remaining = goal - (bigBricksUsed * 5);

        if (small >= remaining) {
            return true;
        } else {
            return false;
        }
    }
}
