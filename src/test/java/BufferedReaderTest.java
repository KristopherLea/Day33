import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderTest {
    BufferedReader bufferedReader;


    @BeforeEach
    public void setUp() throws FileNotFoundException {
        bufferedReader = new BufferedReader(new FileReader("src/main/resources/hello.txt"));
        bufferedReader.lines();
    }

    @Test
    public void test(){
        bufferedReader.lines()
                .forEach(System.out::println);
    }
}
