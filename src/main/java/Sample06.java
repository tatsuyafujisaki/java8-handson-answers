import java.util.Arrays;
import java.util.stream.Collectors;

public class Sample06 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(
                new Person("山田", "太郎", 21, Gender.MALE),
                new Person("佐藤", "花子", 25, Gender.FEMALE),
                new Person("青山", "次郎", 45, Gender.MALE),
                new Person("港", "アン", 85, Gender.FEMALE),
                new Person("鈴木", "三郎", 25, Gender.MALE),
                new Person("伊藤", "四郎", 67, Gender.MALE),
                new Person("工藤", "五郎", 55, Gender.MALE))
                .stream()
                .sorted((person1, person2) -> Integer.compare(person1.getAge(), (person2.getAge())))
                .map(person -> person.getLastName() + " " + person.getFirstName())
                .collect(Collectors.joining(",")));
    }
}