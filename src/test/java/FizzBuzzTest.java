import fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    private String retour;
    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
        retour = fizzBuzz.printNumber();
    }
    @Test
    public void testPrintNumber_doitRetournerFizzSiNombreMultipleDe3(){
        //Given
        //When
        //Then
        Assert.assertTrue(retour.contains("Fizz"));
    }
    @Test
    public void testPrintNumber_doitRetournerBuzzSiNombreMultipleDe5(){
        //Given
        //When
        //Then
        Assert.assertTrue(retour.contains("Buzz"));
    }
    @Test
    public void testPrintNumber_doitRetournerFizzBuzzSiNombreMultipleDe5EtMultiple3(){
        //Given
        //When
        Assert.assertTrue(retour.contains("FizzBuzz"));
    }
    @Test
    public void testPrintNumber_doitRetournerFizzSiNombreMultipleDe3OuContient3(){
        //Given
        //When
        //Then
        Assert.assertTrue(retour.contains("Fizz"));
    }
    @Test
    public void testPrintNumber_doirRetourner1(){
        Assert.assertTrue(retour.contains("1"));
        Assert.assertEquals("1", retour.pr);
    }


}
