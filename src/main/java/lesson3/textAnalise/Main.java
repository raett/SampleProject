package lesson3.textAnalise;

public class Main {
    public static void main(String[] args) {
        Analys[] masAnalyse = new Analys[3];
        masAnalyse[0] = new TextLenthAnalyse(255);
        masAnalyse[1] = new TextMat();
        masAnalyse[2] = new TextSpam(new String[]{"hsd", "test"});
        String str = "klsne hsd te dog asdfghjklkjhgc xcfvgbhnmnbv ";
        for (int i = 0; i < 3; i++){
            System.out.println(masAnalyse[i].analyse(str));
        }
    }
}
