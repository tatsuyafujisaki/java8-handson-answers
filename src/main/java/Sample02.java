public class Sample02 {
    public static void main(String[] args) {
        new Sample02().print(1, 1, (a, b) -> a + b);
    }

    private void print(int a, int b, MyFunction f) {
        System.out.println(f.calc(a, b));
    }

    @FunctionalInterface
    public interface MyFunction {
        int calc(int a, int b);
    }
}