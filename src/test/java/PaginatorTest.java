import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PaginatorTest {

    Paginator paginator;
    String inputString = "Alteration literature to or an sympathize mr imprudence. Of is ferrars subject as enjoyed or tedious cottage. " +
            "Procuring as in resembled by in agreeable. Next long no gave mr eyes. Admiration advantages no he celebrated so pianoforte unreserved. " +
            "Not its herself forming charmed amiable. Him why feebly expect future now. ";

    @Test
    @Parameters(method = "paginatorConfigurations")
    public void testPaginatorTest(int smsLength, String input, int expected) {
        paginator = new Paginator(smsLength);

        Assert.assertEquals(expected, paginator.paginate(input));

    }

    public Object[] paginatorConfigurations() {
        return new Object[]{
                new Object[]{160, inputString, 2},
                new Object[]{120, inputString, 3},
                new Object[]{169, inputString, 2},
                new Object[]{160, "", 1},
                new Object[]{1, inputString, 320},
                new Object[]{0, inputString, 0}
        };
    }
}
