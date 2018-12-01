import java.math.BigDecimal;
import java.math.RoundingMode;

public class CostCalculator {

    private final BigDecimal UNIT_PRICE;

    public CostCalculator(BigDecimal unitPrice) {
        UNIT_PRICE = unitPrice.setScale(2,RoundingMode.HALF_UP);
    }

    public BigDecimal calculate(int numberOfMessages) {
        BigDecimal cost = UNIT_PRICE.multiply(new BigDecimal(numberOfMessages)).setScale(2,RoundingMode.HALF_UP);

//        if(){
//            ret/urn cost.setScale(0,RoundingMode.HALF_DOWN);
//        }else{
//            return cost.setScale(2,RoundingMode.HALF_DOWN);
//        }
        return cost;
    }
}
