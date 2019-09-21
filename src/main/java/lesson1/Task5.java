package lesson1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(inversPro("qwe"));
    }
    public static String invers(String str){
        String resalt = "";
        for(int  i = 0; i < str.length(); i++) {
            resalt+=str.charAt(str.length() - 1 - i);
        }
        return resalt;
    }
    public static String inversPro(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
