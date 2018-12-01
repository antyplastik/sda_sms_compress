import copressor.Compressor;
import copressor.OptimalCompressor;
import org.junit.Before;
import org.junit.Test;

public class OptimalCompressorTest {

    private Compressor naiveCompressor;
    private Compressor optimalCompressor;
    private String inputString = "";

    @Before
    public void setUp(){
        this.inputString = "Mechanizm refleksji – pojęcie z dziedziny informatyki oznaczające proces, dzięki któremu program komputerowy może być modyfikowany w trakcie działania w sposób zależny od własnego kodu oraz od zachowania w trakcie wykonania. Paradygmat programowania ściśle związany z mechanizmem refleksji to programowanie refleksyjne.\n" +
                "\n" +
                "Refleksja pozwala w łatwy sposób zarządzać kodem tak, jakby był danymi. Używa się jej najczęściej do zmieniania standardowego zachowania już zdefiniowanych metod lub funkcji, a także do tworzenia własnych konstrukcji semantycznych modyfikujących język. Z drugiej strony kod wykorzystujący refleksję jest mniej czytelny i nie pozwala na sprawdzenie poprawności składniowej i semantycznej w trakcie kompilacji (niewygodne śledzenie błędów).\n" +
                "\n" +
                "Mechanizm ten jest częściej spotykany w językach wysokiego poziomu, zwykle opartych na maszynie wirtualnej.";

        this.optimalCompressor = new OptimalCompressor(inputString);
    }

    @Test
    public void optimalCompressorResult(){

    }

}
