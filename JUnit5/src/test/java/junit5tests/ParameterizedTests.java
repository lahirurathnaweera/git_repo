package junit5tests;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterizedTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})


    void intValues(int theParam){

        System.out.println("theParam =" + theParam);

    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {"firstString", "secondString"})
    void stringValues(String theParams)
    {
        System.out.println("theParam " + theParams);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve,rogers","bucky,barnes","captain,marvel"})

    void csvSource_StringString(String param1, String param2)
    {
        System.out.println("param1 = " + param1 + " param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve,32,true","captain,21,false","bucky,5,true"})
    void csvSource_StringIntBoolean(String param1, int param2, boolean param3)
    {
        System.out.println("param1 = " + param1 + " param2 = " + param2 + "param3 = " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"captain america,'steve,rogers'","winter soldier," + "'bucky,barnes'"})
    void csvSource_StringWithComma(String param1, String param2)
    {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve?rogers","bucky?barnes"}, delimiter = '?')
    void csvSource_StringwithDiffDelimiter(String param1, String param2)
    {
        System.out.println("param1 = " + param1 + " param2 = " + param2);
    }

    @ParameterizedTest
    @CsvFileSource(files = {"src/test/resources/params/shoppinglist.csv","src/test/resources/params/shoppinglist2.csv"}, numLinesToSkip = 1)
    void csvFileSource_StringDoubleIntStringString(String name, double price, int qty,String uom, String provider)
    {
        System.out.println("name = " + name + ", price = " + price + ", qty =" + qty + ", uom =" + uom +", provider =" + provider);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/params/shoppinglist3.csv", numLinesToSkip = 1,delimiterString = "___")
    void csvFileSource_StringDoubleIntStringStringSpecifiedDelimeter(String name, double price, int qty,String uom, String provider)
    {
        System.out.println("name = " + name + ", price = " + price + ", qty =" + qty + ", uom =" + uom +", provider =" + provider);
    }

    @ParameterizedTest
    @MethodSource(value = "sourceString")
    void methodSource_String(String param1)
    {
        System.out.println("param1 = " + param1);
    }


    @ParameterizedTest
    @MethodSource(value = "sourceStringAsSteam")
    void methodSource_StringStream(String param1)
    {
        System.out.println("param1 = " + param1);
    }

    List<String> sourceString(){
        //proccessing done here
        return Arrays.asList("tomato","cabbage","carrot");
    }

    Stream<String> sourceStringAsSteam(){
        return Stream.of("beetroot","apple","pear");
    }

}