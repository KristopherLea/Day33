import Model.Project;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionsTest {

    Project project;
    Project project2;

    @BeforeEach
    public void setUp(){
        project = new Project();
        project2 = new Project("Kris","DEV","React-app");
    }

    @Test
    public void test(){
        assumeTrue(3<2);
        System.out.println("2 is less than 3");
    }
    @Test
    public void test2(){
        System.setProperty("username","Kris");
       // assumeTrue(System.setProperty("ENV","DEV").equals(System.getProperty("ENV")));
        assumeTrue(project2.getUsername().equals(System.getProperty("username")));
      //  assumeTrue(project2.getStages().equals(System.getProperty("ENV")));
        System.out.println("This is true");
    }


}
