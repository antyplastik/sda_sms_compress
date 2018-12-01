public class Paginator { // ma zwracac pofragmentowana wiadomosc

private int smsLength = 0;

    public int paginate(String text){
        smsLength = text.length();
        return smsLength;
    }

    public int getSmsLength() {
        return smsLength;
    }
}
