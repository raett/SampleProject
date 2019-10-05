package lesson3.textAnalise;

public class TextLenthAnalyse {
    private int maxTextlenght = 255;
    public boolean analyseText(String str){
        if(str.length()>maxTextlenght){
            return false;
        } else {
            return true;
        }

    }
}