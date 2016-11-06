import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class ChainTest {

    @DataProvider({
            "XXXXXXXXXXXX, 300",
            "9-9-9-9-9-9-9-9-9-9-, 90",
            "5/5/5/5/5/5/5/5/5/5/5, 150"
    })
    @Test
    public void compute_total_score_for_input_raw_scores(String rawScores, int expectedSum) {

        // Given
        BowlingGame bowlingGame = new BowlingGame();

        // When
        int sum = bowlingGame.computeSumWithRawData(rawScores);

        // Then
        assertThat(sum).isEqualTo(expectedSum);
    }
}
