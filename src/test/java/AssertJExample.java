import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * String and lis examples of AssertJ
 *
 * @author Vinod John
 * @Date 04.02.2023
 */
public class AssertJExample {

    @Test
    public void stringTest1() {
        String str = "I am a good Java Developer";

        Assertions.assertThat(str)
                .contains("Java")
                .isNotEmpty()
                .containsWhitespaces();
    }
}
