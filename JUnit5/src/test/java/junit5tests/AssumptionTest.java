package junit5tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionTest {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    void intValues(int theParam){

        assumeTrue(theParam > 4);
        System.out.println("theParam =" + theParam);

    }

    @ParameterizedTest
    @CsvSource(value = {"steve,rogers","bucky,barnes","captain,marvel"})

    void csvSource_StringString(String param1, String param2)
    {
        assumeFalse(param1.equals("steve"),"The assumption failed fot the follwing param2" + param2);
        System.out.println("param1 = " + param1 + " param2 = " + param2);
    }

}
