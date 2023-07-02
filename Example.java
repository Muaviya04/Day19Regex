import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[91]{1}[0-9]{11}", "918156562342"));
        System.out.println(Pattern.matches("[a-z]{3}[22]{2}.[a-z]{5}.[a-z]{3}" , "abc22@gmail.com"));
        System.out.println(Pattern.matches("[a-zA-Z]{3,} [A-Za-z]{3,}","Muaviya Momin"));
    }
}
