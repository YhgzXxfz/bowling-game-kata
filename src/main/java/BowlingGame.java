import java.util.Arrays;

public class BowlingGame {
    public int calculateSum(int[] scores) {
        return Arrays.stream(scores).reduce(0, (left, right) -> left+right);
    }
}
