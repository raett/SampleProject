package lesson3;

public class TextRoles {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        String result = "";
        for(int i = 0; i < roles.length; i++) {
            result += roles[i] + ":\n";
            for(int j = 0; j < textLines.length; j++) {
                if(textLines[j].startsWith(roles[i])) {
                    String strHelp = textLines[j].substring(textLines[j].indexOf(":") + 2);
                    result += j + 1 + ") "+ strHelp + "\n";
                }
            }
            if (i != roles.length - 1) {
                result += "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
