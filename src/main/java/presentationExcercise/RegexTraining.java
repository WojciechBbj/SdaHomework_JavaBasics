package presentationExcercise;

import java.util.regex.Pattern;

public class RegexTraining {
    private static boolean isPeselCorrect (String pesel) {
        Pattern peselPattern = Pattern.compile("[0-9]{11}");
        return peselPattern.matcher(pesel).matches();
    }

    public static boolean isEmailCorrect (String eMail) {
        Pattern eMailPattern = Pattern.compile("[0-9a-z_\\.\\-]+@[0-9a-z_\\.\\-]+");
        return eMailPattern.matcher(eMail).matches();
    }

    public static void main (String[] args) {

        String pesel1 = "881755931422";
        System.out.println(pesel1 + " jest: " + isPeselCorrect(pesel1));

        String eMail = "woj1989@interia.pl";
        System.out.println(eMail + " jest: " + isEmailCorrect(eMail));
    }

}

