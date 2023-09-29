package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledEnabledTest {

    @Test
    @Disabled(value = "Disabled for demo of @Disabled")
    void firstTest(){
        System.out.println("This is the first test method");
    }

    @Test
    void secondTest(){
        System.out.println("this is the second test method");
    }

    @Test
    void thirdTest(){
        System.out.println("this is the third test method");
    }

    @Test
    void forthTest(){
        System.out.println("this is the forth test method");
    }

    @Test
    void fifthTest(){
        System.out.println("this is the fifth test method");
    }

}
