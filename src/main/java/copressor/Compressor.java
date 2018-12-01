package copressor;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface Compressor {

    String compress(String inputString);

    String decompress(String input);

}
