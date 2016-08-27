public class Sample01 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Lambda !");

        r.run();
    }
}