package be.durvenproeven.nielskarl;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FizzBuzzCalculator {
    private final int nr;

    public FizzBuzzCalculator(int nr) {
        this.nr = nr;
    }

    public List<String> getNumbers() {
        return IntStream.rangeClosed(1, nr)
                .mapToObj(this::toFizzBuzzString)
                .collect(toList());
    }

    private String toFizzBuzzString(int i) {
       if (i % 15 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return "" + i;
    }
}
