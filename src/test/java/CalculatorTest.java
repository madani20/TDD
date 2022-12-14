import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd_ajouter1StringVideDoitRetourner0() {
        //GIVEN
        //WHEN
        int val = calculator.add("");
        //THEN
        Assert.assertEquals(0, val);
    }

    @Test
    public void testAdd_ajouter1StringAvec1ValeurDoitRetournerCetteValeur() {
        //GIVEN
        //WHEN
        int val = calculator.add("32");
        //THEN
        Assert.assertEquals(32, val);
    }

    @Test
    public void testAdd_ajouter1StringAvec2ValeursDoitRetournerLeurSomme() {
        //GIVEN
        //WHEN
        int val = calculator.add("1,2");
        //THEN
        Assert.assertEquals(3, val);
    }

    @Test
    public void testAdd_ajouter1StringAvec2ValeursSuperieurADixDoitRetournerLeursSomme() {
        //GIVEN
        //WHEN
        int val = calculator.add("15,23");
        //THEN
        Assert.assertEquals(38, val);
    }

    @Test
    public void testAdd_ajouter1StringAvecNValeursDoitRetournerLeursSomme() {
        //GIVEN
        //WHEN
        int val = calculator.add("15,23,44,7,1,10,25");
        //THEN
        Assert.assertEquals(125, val);
    }

    @Test
    public void testAdd_ajouter1StringAvecNValeursSurPlusieursLignesDoitRetournerLeursSomme() {
        //GIVEN
        //WHEN
        int val = calculator.add("2\n,15\n,52");
        //THEN
        Assert.assertEquals(69, val);
    }

    @Test(expected = RuntimeException.class)
    public void testAdd_ajouter1StringAvec1ValeurEt1LigneVideDoitRetournerUneException() {
        //GIVEN
        //WHEN
        int val = calculator.add("1,\n");
        //THEN
        Assert.assertEquals(1, val);
    }
}
