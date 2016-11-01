import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculationTest {

    @Test
    public void should_compute_the_accumulated_sum_when_there_is_no_strike_nor_spare() {

        // Given
        int[] scores = {9,0, 9,0, 9,0, 9,0, 9,0, 1,0, 1,0, 1,0, 1,0, 1,0};
        BowlingGame bowlingGame = new BowlingGame();

        // When
        int sum = bowlingGame.calculateSum(scores);

        // Then
        assertThat(sum).isEqualTo(50);
    }

}
