package be.durvenproeven.nielskarl;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.*;

class FizzBuzzCalculatorTest {

    @Test
    void getNumbers_First2() {
        assertThat(new FizzBuzzCalculator(2).getNumbers())
                .containsExactly("1", "2");
    }

    @Test
    void getNumbers_Fizz() {
        assertThat(new FizzBuzzCalculator(3).getNumbers())
                .containsExactly("1", "2", "Fizz");

        assertThat(new FizzBuzzCalculator(9).getNumbers())
                .contains("Fizz", atIndex(3 - 1))
                .contains("Fizz", atIndex(6 - 1))
                .contains("Fizz", atIndex(9 - 1));
    }

    @Test
    void getNumbers_Buzz() {
        assertThat(new FizzBuzzCalculator(5).getNumbers())
                .containsExactly("1", "2","Fizz","4", "Buzz");

        assertThat(new FizzBuzzCalculator(10).getNumbers())
                .contains("Buzz", atIndex(5 - 1))
                .contains("Buzz", atIndex(10 - 1));
    }

    @Test
    void getNumbers_FizzBuzz() {
        assertThat(new FizzBuzzCalculator(30).getNumbers())
                .contains("FizzBuzz", atIndex(15 - 1))
                .contains("FizzBuzz", atIndex(30 - 1));
    }
}