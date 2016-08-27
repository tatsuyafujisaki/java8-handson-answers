import java.util.Arrays;
import java.util.List;

public class Sample07 {
    public static void main(String[] args) {
        List<Integer> games = Arrays.asList(118, 65, 152, 201, 126);
        int totalScore = games
                .stream()
                .filter(n -> 101 <= n && n < 200)
                .reduce((a, b) -> a + b)
                .get();

        System.out.println(totalScore);
    }
}