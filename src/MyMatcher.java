import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMatcher {
    public static void main(String[] args) {
        String text = "� ���� � ���� � ����� ��� � �����";
        String text2 = "� ���� � ���� � ����� ��� � �����";
        String text3 = "� ���� � ���� � ����� ��� � �����";
//        Pattern pattern = Pattern.compile("\\b.+\\b");
        Pattern pattern = Pattern.compile("\\b[��][\\d�-��-�_]*\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
