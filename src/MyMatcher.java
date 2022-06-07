import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMatcher {
    public static void main(String[] args) {
        String text = "У Сени и Сани в сенях сом с усами";
        String text2 = "У Сени и Сани в сенях сом с усами";
        String text3 = "У Сени и Сани в сенях сом с усами";
//        Pattern pattern = Pattern.compile("\\b.+\\b");
        Pattern pattern = Pattern.compile("\\b[Сс][\\dа-яА-Я_]*\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
