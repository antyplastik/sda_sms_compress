import java.math.BigDecimal;
import java.math.BigInteger;

public interface Compressor {

    String inputString = "";
    BigDecimal smsPrice = new BigDecimal("0,15");
    int DEFAULTSMSSIZE = 160;

    String compress(String inputString);
    String decompress(String input);
    String calculateCost();

}
