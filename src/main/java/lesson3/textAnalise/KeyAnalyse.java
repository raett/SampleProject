package lesson3.textAnalise;

public class KeyAnalyse {
    protected String[] words;
    public boolean analyse(String strA){
        for(int i = 0; i < words.length; i++){
            if (strA.contains(words[i])){
                return false;
            }
        }
        return true;
    }
}
