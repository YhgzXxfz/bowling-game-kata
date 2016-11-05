public class BowlingGame {

    private static final int TOTAL_SHOTS = 20;
    public static final int MAX_FRAME_SCORE = 10;

    public int calculateSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < TOTAL_SHOTS; i += 2) {
            int frameSum = scores[i] + scores[i + 1];
            if (frameSum == MAX_FRAME_SCORE) {
                frameSum += scores[i+2];
            }
            sum += frameSum;
        }
        return sum;
    }
}
