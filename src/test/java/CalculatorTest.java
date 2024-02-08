import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void 계산기는_두_수를_더할_수_있다() {
        // given
        int a = 1;
        int b = 2;
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.add(a, b);

        // then
        assertThat(actual).isEqualTo(3);
    }

    private static class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    }
}
