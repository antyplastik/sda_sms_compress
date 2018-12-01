import java.util.ArrayList;
import java.util.List;

public class Paginator { // ma zwracac pofragmentowana wiadomosc

    private int smsLength = 0;

    public Paginator() {
    }

    public Paginator(int smsLength) {
        this.smsLength = smsLength;
    }

    public int paginate(String text) {
        int textLength = text.length();
        double tmpValue = 0;

        if (textLength > 0 && smsLength > 0) {
            tmpValue = textLength / smsLength;
            if (textLength % smsLength != 0)
                return (int) tmpValue + 1;
            else
                return (int) tmpValue;
        } else if (smsLength == 0)
            return 0;
        else
            return 1;
    }

    public List<String> divideTheText(String text) {
        List<String> listOfSMS = new ArrayList<>();


        return listOfSMS;
    }

    public void setSmsLength(int smsLength) {
        this.smsLength = smsLength;
    }
}
