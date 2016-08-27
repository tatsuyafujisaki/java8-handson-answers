import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Sample04 {
    public static void main(String[] args) {
        Consumer<Integer> fizzBuzz = n -> IntStream.rangeClosed(1, n).forEach(i -> System.out.print(i % 15 == 0 ? "FizzBuzz " : i % 3 == 0 ? "Fizz " : i % 5 == 0 ? "Buzz " : i + " "));

        fizzBuzz.accept(16);
    }
}