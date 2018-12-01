import copressor.Compressor;
import copressor.NaiveCompressor;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class NaiveCompressorTest {

    private Compressor naiveCompressor;
    private String inputString = "";

    @Before
    public void setUp(){
        this.inputString = "Alteration literature, to or an sympathize mr imprudence. Of is ferrars subject as, enjoyed or tedious cottage.";

        this.naiveCompressor = new NaiveCompressor(inputString);
    }

    @Test
    public void compressionLength(){
        String expected = "AlterationLiterature,toOrAnSympathizeMrImprudence.OfIsFerrarsSubjectAs,enjoyedOrTediousCottage.";
        int expectedLength = expected.length();

        Assert.assertEquals(expectedLength,naiveCompressor.compress(inputString).length());

    }

    @Test
    public void compressorResult(){
        String expected = "AlterationLiterature,toOrAnSympathizeMrImprudence.OfIsFerrarsSubjectAs,enjoyedOrTediousCottage.";

        assertEquals(expected,naiveCompressor.compress(inputString));
    }

    @Test
    public void decompressorResult(){
        String expected = inputString;

        assertEquals(expected, naiveCompressor.decompress(naiveCompressor.compress(inputString)));
    }
}
