import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DzSh17 {
    public static void main(String[] args) {

        String s = "my-p@sswOrd";
        String pattern = "^[\\w-@]{6,18}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        System.out.print(matcher.find());
    }
}
