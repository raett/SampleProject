package lesson3.textAnalise;

public class TextLenthAnalyse implements Analys{
    private int maxTextlenght;

    public TextLenthAnalyse(int maxTextlenght) {
        this.maxTextlenght = maxTextlenght;
    }

    public boolean analyse(String str) {
        if(str.length() > maxTextlenght) {
            return false;
        } else {
            return true;
        }

    }
}