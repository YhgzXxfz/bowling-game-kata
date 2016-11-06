import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformationTest {

    @Test
    public void convert_X_to_a_strike() {

        // Given
        String rawScores = "XXXXXXXXXXXX";
        BowlingGame bowlingGame = new BowlingGame();

        // When
        List<Integer> scores = bowlingGame.convertRawScoreToList(rawScores);

        // Then
        assertThat(scores).containsExactly(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
    }

    @Test
    public void convert_number_in_string_format_to_integer_numbers() {

        // Given
        String ranScores = "81726354714231527162";
        BowlingGame bowlingGame = new BowlingGame();

        // When
        List<Integer> scores = bowlingGame.convertRawScoreToList(ranScores);

        // Then
        assertThat(scores).containsExactly(8,1, 7,2, 6,3, 5,4, 7,1, 4,2, 3,1, 5,2, 7,1, 6,2);
    }

    @Test
    public void convert_hyphen_to_zero() {

        // Given
        String ranScores = "1-9-4-2-3-4-5-7-8-4-";
        BowlingGame bowlingGame = new BowlingGame();

        // When
        List<Integer> scores = bowlingGame.convertRawScoreToList(ranScores);

        // Then
        assertThat(scores).containsExactly(1,0, 9,0, 4,0, 2,0, 3,0, 4,0, 5,0, 7,0, 8,0, 4,0);
    }

    @Test
    public void convert_slash_to_number_needed_to_form_a_spare() {

        // Given
        String ranScores = "1/9/4/2/3/4/5-7-8-4/5";
        BowlingGame bowlingGame = new BowlingGame();

        // When
        List<Integer> scores = bowlingGame.convertRawScoreToList(ranScores);

        // Then
        assertThat(scores).containsExactly(1,9, 9,1, 4,6, 2,8, 3,7, 4,6, 5,0, 7,0, 8,0, 4,6, 5);
    }
}
