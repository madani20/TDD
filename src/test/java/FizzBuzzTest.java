import fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testPrintNumber_doitRetournerFizzSiNombreMultipleDe3(){
        //Given

        //When
        String retour = fizzBuzz.printNumber();

        //Then
        Assert.assertTrue(retour.contains("Fizz"));
    }

    @Test
    public void testPrintNumber_doitRetournerBuzzSiNombreMultipleDe5(){
        //Given

        //When
        String retour = fizzBuzz.printNumber();

        //Then
        Assert.assertTrue(retour.contains("Buzz"));
    }
    @Test
    public void testPrintNumber_doitRetournerFizzBuzzSiNombreMultipleDe5EtMultiple3(){
        //Given

        //When
        String retour = fizzBuzz.printNumber();

        //Then
        Assert.assertTrue(retour.contains("FizzBuzz"));
    }
    @Test
    public void testPrintNumber_doitRetournerFizzSiNombreMultipleDe3OuContient3(){
        //Given

        //When
        String retour = fizzBuzz.printNumber();

        //Then
        Assert.assertTrue(retour.contains("Fizz"));

    }


}
