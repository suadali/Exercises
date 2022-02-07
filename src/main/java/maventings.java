import com.github.javafaker.Faker;

public class maventings {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.animal().name());
    }
}
