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

    @Test
    public void should_add_next_shot_score_to_a_spare_not_at_the_end() {

        // Given
        int[] scores = {9,1, 5,5, 7,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame bowlingGame = new BowlingGame();

        // When
        int sum = bowlingGame.calculateSum(scores);

        // Then
        assertThat(sum).isEqualTo(39);
    }

    @Test
    public void should_add_next_shot_score_to_a_spare_at_the_end() {

        // Given
        int[] scores = {9,1, 5,5, 7,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 8,2, 5};
        BowlingGame bowlingGame = new BowlingGame();

        // When
        int sum = bowlingGame.calculateSum(scores);

        // Then
        assertThat(sum).isEqualTo(54);
    }

    @Test
    public void should_add_next_two_shot_scores_to_a_strike_not_at_the_end() {

        // Given
        int[] scores = {10, 5,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        BowlingGame bowlingGame = new BowlingGame();

        // When
        int sum = bowlingGame.calculateSum(scores);

        // Then
        assertThat(sum).isEqualTo(26);
    }

    @Test
    public void should_add_next_two_shot_scores_to_a_strike_at_the_end() {

        // Given
        int[] scores = {9,1, 5,5, 7,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10, 1,2};
        BowlingGame bowlingGame = new BowlingGame();

        // When
        int sum = bowlingGame.calculateSum(scores);

        // Then
        assertThat(sum).isEqualTo(52);
    }

}
