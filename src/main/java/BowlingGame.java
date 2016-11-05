public class BowlingGame {

    private static final int TOTAL_FRAME = 10;
    private static final int MAX_FRAME_SCORE = 10;

    public int calculateSum(int[] scores) {
        int sum = 0, frame = 0, shot = 0, frameSum;
        while (frame < TOTAL_FRAME) {
            if (isStrike(scores[shot])) {
                frameSum = MAX_FRAME_SCORE + scores[shot + 1] + scores[shot + 2];
                shot++;
            } else {
                frameSum = scores[shot] + scores[shot + 1];
                if (isSpare(frameSum)) frameSum += scores[shot + 2];
                shot += 2;
            }
            sum += frameSum;
            frame++;
        }
        return sum;
    }

    private boolean isSpare(int frameSum) {
        return frameSum == MAX_FRAME_SCORE;
    }

    private boolean isStrike(int score) {
        return score == MAX_FRAME_SCORE;
    }
}
