package homework10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        final String NUMBER_OF_DOCUMENT = "5551-aaa-2222-bbb-1s2b";

        System.out.print("Operation1: ");
        operation1(NUMBER_OF_DOCUMENT);
        System.out.print("Operation2: ");
        operation2(NUMBER_OF_DOCUMENT);
        System.out.print("Operation3: ");
        operation3(NUMBER_OF_DOCUMENT);
        System.out.print("Operation4: ");
        operation4(NUMBER_OF_DOCUMENT);
        System.out.print("Operation5: ");
        operation5(NUMBER_OF_DOCUMENT);
        System.out.print("Operation6: ");
        operation6(NUMBER_OF_DOCUMENT);
        System.out.print("Operation7: ");
        operation7(NUMBER_OF_DOCUMENT);

    }

    public static void operation1(String doc) {  //Вывести в одну строку первые 2 блока по 4 цифры
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(doc);
        while (matcher.find()) {
            System.out.print(matcher.group());
        }
        System.out.println(); //для удобного отображения при запуске
    }

    public static void operation2(String doc) {  //Вывести в одну строку первые 2 блока по 4 цифры
        System.out.println(doc.replaceAll("\\p{L}{3}", "***"));

    }

    public static void operation3(String doc) {  //Вывести только буквы в нижнем регистре в формате yyy/yyy/y/y
        String string1 = doc.substring(5);
        StringBuilder sb2 = new StringBuilder("");
        char[] charArray = string1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {  //тут жесть тк очень большие регулярки пока еще сложно для меня
            Character o = charArray[i];
            if (Character.isDigit(charArray[i]) && i == charArray.length - 2) {
                charArray[i] = '/';
                sb2.append(charArray[i]);
            }
            if (Character.isDigit(o)) {
                continue;
            } else {
                sb2.append(o);
            }
        }
        String tmp = sb2.toString();
        String result = tmp.replaceAll("-+", "/");
        System.out.println(result.toLowerCase());
    }

    public static void operation4(String doc) {  //Вывести только буквы в верхнем регистре в формате "Letters:yyy/yyy/y/y"
        String string1 = doc.substring(5);
        StringBuilder sb2 = new StringBuilder("");
        char[] charArray = string1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            Character o = charArray[i];
            if (Character.isDigit(charArray[i]) && i == charArray.length - 2) {
                charArray[i] = '/';
                sb2.append(charArray[i]);
            }
            if (Character.isDigit(o)) {
                continue;
            } else {
                sb2.append(o);
            }
        }
        String tmp = sb2.toString();
        String tmp1 = tmp.replaceAll("-+", "/");
        StringBuilder result = new StringBuilder(("Letters:" + tmp1.toUpperCase()));
        System.out.println(result);
    }

    public static void operation5(String doc) {  //проверить содержит ли документ последовательность abc и вывести сообщение ABC и abc считать равными
        System.out.println(doc.toLowerCase().contains("abc") ? "Документ содержит последовательность abc" : "Документ не содержит последовательность abc");
    }

    public static void operation6(String doc) {  //проверить начинается ли номер документа с последовательности 555
        System.out.println(doc.startsWith("555") ? "Документ начинается с последовательности 555" : "Документ начинается с " + doc.substring(0, 3));
    }

    public static void operation7(String doc) {  //проверить заканчивается ли номер документа на последовательности 1a2b
        System.out.println(doc.endsWith("1a2b") ? "Документ заканчивается на 1a2b" : "Документ заканчивается на " + doc.substring(doc.length() - 4));
    }


}
