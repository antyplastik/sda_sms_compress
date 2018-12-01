import java.math.BigDecimal;
import java.math.BigInteger;

public interface Compressor {

    String getInputText();

    String compress(String inputString);

    String decompress(String input);

    BigDecimal calculateCost(int sms);

}
