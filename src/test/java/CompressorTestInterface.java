import copressor.Compressor;
import org.junit.Before;
import org.junit.Test;

public interface CompressorTestInterface {

    Compressor compressor = null;
    String inputString = "";

    @Before
    public void setUp();

    @Test
    public void compressionLength();

    @Test
    public void compressorResult();

    @Test
    public void decompressorResult();


}
