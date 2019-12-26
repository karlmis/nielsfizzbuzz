package be.durvenproeven.nielskarl;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void add_EmptyOrNull() {
        assertThat(StringCalculator.add("")).isEqualTo(0);
        assertThat(StringCalculator.add(null)).isEqualTo(0);
    }

    @Test
    void add_Single() {
        assertThat(StringCalculator.add("2")).isEqualTo(2);
        assertThat(StringCalculator.add("3")).isEqualTo(3);
    }

    @Test
    void add_Multiple() {
        assertThat(StringCalculator.add("2,3")).isEqualTo(2 + 3);
        assertThat(StringCalculator.add("2,3,4")).isEqualTo(2 + 3 + 4);
    }

    @Test
    void add_NewLine() {
        assertThat(StringCalculator.add("1\n2,3")).isEqualTo(1 + 2 + 3);
    }

    @Test
    void add_OtherDelimiter() {
        assertThat(StringCalculator.add("//;\n1;2;3")).isEqualTo(1 + 2 + 3);
        assertThat(StringCalculator.add("//!\n1!2!3")).isEqualTo(1 + 2 + 3);
    }
}