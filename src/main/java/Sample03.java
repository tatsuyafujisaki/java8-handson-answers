import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Sample03 {
    public static void main(String[] args) {
        Supplier<String> s = () -> "foo";
        System.out.println(s.get());

        Consumer<Integer> c = System.out::println;
        c.accept(25);

        BiFunction<Integer, Integer, Integer> bf = (a, b) -> a + b;
        System.out.println(bf.apply(1, 2));
    }
}