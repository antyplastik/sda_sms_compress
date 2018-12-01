import copressor.Compressor;
import copressor.NaiveCompressor;
import copressor.OptimalCompressor;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RunWith(JUnitParamsRunner.class)
public class CostCalculatorTest {

    //    private Compressor naiveCompressor;
//    private Compressor optimalCompressor;
    private String inputString = "";

//    sprawdzanie 0 sms, czy mozna wpisac ujemna cene za sms. Uzyc params

    @Before
    public void setUp() {
        this.inputString = "Alteration literature, to or an sympathize mr imprudence. Of is ferrars subject as, enjoyed or tedious cottage.";

//        this.naiveCompressor = new NaiveCompressor(inputString);
//        this.optimalCompressor = new OptimalCompressor(inputString);
    }

    @Test
    @Parameters(method = "calcValues")
    public void simpleCalcTest(BigDecimal unitCost, int numberOfMessages, BigDecimal expectedValue) {
        CostCalculator calc = new CostCalculator(unitCost);
        Assert.assertEquals(expectedValue, calc.calculate(numberOfMessages));
    }

    private Object[] calcValues() {
        return new Object[]{
                new Object[]{new BigDecimal(0).setScale(2,RoundingMode.HALF_UP), 100, new BigDecimal(0.00).setScale(2,RoundingMode.HALF_UP)},
                new Object[]{new BigDecimal(0.3).setScale(2,RoundingMode.HALF_UP), 10, new BigDecimal(3.00).setScale(2,RoundingMode.HALF_UP)},
                new Object[]{new BigDecimal(0.3).setScale(2,RoundingMode.HALF_UP), 0, new BigDecimal(0.00).setScale(2,RoundingMode.HALF_UP)},
                new Object[]{new BigDecimal(0.3).setScale(2,RoundingMode.HALF_UP), 11, new BigDecimal(3.30).setScale(2,RoundingMode.HALF_UP)},
                new Object[]{new BigDecimal(0.29).setScale(2,RoundingMode.HALF_UP), 10, new BigDecimal(2.9).setScale(2,RoundingMode.HALF_UP)},
                new Object[]{new BigDecimal(1.11).setScale(2,RoundingMode.HALF_UP), 10, new BigDecimal(11.1).setScale(2,RoundingMode.HALF_UP)},
                new Object[]{new BigDecimal(0.229).setScale(2,RoundingMode.HALF_UP), 11, new BigDecimal(2.53).setScale(2,RoundingMode.HALF_UP)},
        };
    }


//    @Test
//    public void naiveCompressorCost(){
//
//    }
//
//    @Test
//    public void optimalCompressorCost(){
//
//    }


}
