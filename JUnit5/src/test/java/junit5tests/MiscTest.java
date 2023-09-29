package junit5tests;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class MiscTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void timeout() throws InterruptedException {
        System.out.println("This is the test with the Timeout");
         //Thread.sleep(6000);
    }

    @Test
    @Timeout(90)
    @DisplayName("This is the nice method")
    @Tag("theTag")
    void annotatedMethod()
    {
        System.out.println("this is the annotated method");
    }

    @MyAnnotation
    void annotatedMethod2() throws InterruptedException {
        System.out.println("this is the custom annotated method2");
        Thread.sleep(10000);
    }

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class NestedTest {
        @BeforeAll
        void beforeAll(){
            System.out.println("Before All in nested test");
        }

        @Test
        void nestedTestMethod(){
            System.out.println("This is the nested test method");
        }
    }




}
