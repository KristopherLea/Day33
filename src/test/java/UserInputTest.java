import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserInputTest {

    Scanner scanner;

    @Test
    public void test(){
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.printf("This is your input: %s", input);

    }
}
