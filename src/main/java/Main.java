import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.printf("This is my input: %s", input);

        Console console = System.console();
        console.readPassword();
      //  Console console = new Console();<-- cant do this. console has a private constructor, so it illegal
    String progLanguage = console.readLine("Enter your favorite programming language");
    console.printf(progLanguage);

    }


}
