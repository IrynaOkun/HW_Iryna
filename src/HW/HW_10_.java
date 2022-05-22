package HW;

import com.sun.source.tree.BreakTree;

import java.util.Locale;

import static utils.validateString.*;


public class HW_10_ {

//    1. Написать метод, который принимает на вход строку.
//    Если строка не пустая (проверить методом из видео),
//    то примените метод по удалению пробелов в начале строки и в конце строки.
//    Догадаться, каким методом из видео можно проверить, были ли пробелы.
//    Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//    Если пробелов не было, вернуть сообщение “Пробелов не было”.
//    Если строка пустая, вернуть сообщение “Строка пустая”.
//
//    Test Data:
//            “    QA4Everyone   “ → “Лишние пробелы удалены”
//            “QA4Everyone“ → “Пробелов не было”
//            “” → “Строка пустая”

    public static String checkline(String str) {
        if (str != null
            && !str.isEmpty()
            && str.trim().length() > 0)
        {
            if (str.trim().equals(str)) {

                return "Лишние пробелы удалены";
            } else {

               return  "пробелов не было";
            }


        }

        return "строка пустая";
    }

//    2. Написать алгоритм RemoveAlla.
//    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//    Если строка валидная, то метод удаляет все буквы a из строки,
//    если таковые имеются. Метод возвращает обработанную строку.
//    Test Data:
//            “    QA4Everyone   “ →  “QA4Everyone“
//            “panda   “ → “pnd”

    public static String removeAllData(String str) {
        if (!str.isEmpty()) {
            str.trim();

            return str.trim().replace("a", "");
        } else {

            return "Строка пустая";
        }

    }

    //variant 2

    public static String removeAl(String str) {

        //if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                //str.replaceALL("[a]", "");
                str = str.trim();
                str = str.replace("a", " ");

                return str;
            }

                return " ";
        }



//    3. Написать алгоритм RemoveAllZeros.
//    С помощью методов из видео1,  написать алгоритм,
//    который принимает на вход строку, состоящую из цифр.
//    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//    Метод возвращает обработанную строку, в которой нет нулей.
//    Test Data:
//            “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//            “ 0000000111“ → “111”


    public static String removeAllZeros(String str) {
        if (str !=null && str.length() > 0) {
            //str.trim();

//            String str2 = str.
//                    replace(" ", "").
//                    replace("0", "");

            String str2 = str.
                    trim().
                    replace(" ", "").
                    replace("0", "");

            return str2;
        } else {

            return "Строка пустая";
        }


    }

//    4. Написать алгоритм RemoveAllSpaces.
//    С помощью методов из видео1,  написать алгоритм,
//    который принимает на вход строку.
//    Если строка валидная, то метод удаляет все пробелы из строки,
//    если таковые имеются. Метод возвращает обработанную строку.
//    Test Data:
//            “    QA   4  Everyone   “ →  “QA4Everyone“
//            “p a     n d a   “ → “panda”

    public static String removeAllSpaces(String str) {
        if (!str.isEmpty()) {
            str = str.trim();


            String str2 = str.replace(" ", "");
            return str2;

            } else {
            return "Строка пустая";
        }

    }

//    5. Напишите метод, который принимает на вход строку и считает,
//    сколько букв а или А содержится в строке.
//    Test Data:
//            “Abracadabra” → 5
//            “Homenum Revelio” → 0

    public static int task5(String str) {
        if (!str.isEmpty()) {
            str.trim();
            String str1 = str.toLowerCase().replace("a", "");
            return str.length() - str1.length();
        } else {

            return 0;
        }
    }

    public static int task5Variant(String a) {

        return a.length()
                -
                a
                        .toLowerCase()
                        .replace("a", "")
                        .length();
    }

//    6. Напишите метод, который принимает на вход текст и проверяет,
//    содержится ли в тексте хотя бы одно слово Java.
//    Test Data:
//            “As of March 2022, Java 18 is the latest version,
//    while Java 17, 11 and 8 are the current long-term support (LTS) versions.
//    Oracle released the last zero-cost public update for the legacy version Java 8 LTS
//    in January 2019 for commercial use, although it will otherwise still support Java 8
//    with public updates for personal use indefinitely.
//    Other vendors have begun to offer zero-cost builds of OpenJDK 8
//    and 11 that are still receiving security and other upgrades.” → true
//
//            “As a decrepit father takes delight
//    To see his active child do deeds of youth,
//    So I, made lame by fortune’s dearest spite,
//    Take all my comfort of thy worth and truth.
//    For whether beauty, birth, or wealth, or wit,
//    Or any of these all, or all, or more,
//    Entitled in thy parts do crownèd sit,
//    I make my love engrafted to this store.
//    So then I am not lame, poor, nor despised,
//    Whilst that this shadow doth such substance give
//    That I in thy abundance am sufficed,
//    And by a part of all thy glory live.
//    Look what is best, that best I wish in thee.
//    This wish I have; then ten times happy me.” → false

    public static boolean iscontainsJavaWord (String str) {

        return str.trim().contains("Java");

    }

    //Variant_second

    public static boolean isContainJavaW(String str) {
        if (isStringValid(str)) {
            str = str.trim();

            return str.contains("Java");
        }

        System.out.println("ERROR");

        return false;
    }


//    7. Напишите метод, который принимает на вход строку,
//    и добавляет Кавычки в начале строки,
//    точку и кавычки в конце строки с помощью метода concat()
//    Test Data:
//            “One” → ““One.””
//            “    TWO  “ → ““TWO.””

    public static String addSimvol(String str) {
        if (str != null && str.length() > 0) {
            str = str.trim();

            return "\"" + str + "\".";
        }

            return " ";

    }

    //var 7.2

    public static String task7Two(String str) {
        if (!str.isEmpty()) {
            String str1 = "\"";

            return str1
                    .concat(str.trim())
                    .concat(".\"");
        } else {

            return "Строка пустая";
        }
    }

//    8. Напишите метод, кторый принимает на вход
//    название города и исправляет написание:
//    Test Data:
//            “ташкент” → “Ташкент”
//            “ЧикаГО” → “Чикаго”

    public static String capitalizeFirstLetter(String entering) {
        if (entering != null) { //исключаем null
            entering = entering.trim(); //убираем все пробелы до и после
            if (entering.length() !=3) {
                entering = entering
                        .substring(0, 1)
                        .toUpperCase()
                        +
                        entering
                                .substring(1)
                                .toLowerCase();
            }
        }

        return entering;
    }

    //case 8.2

    public static String task8case2(String case2) {
        if (!case2.isEmpty()) {
            String str = case2
                    .trim()
                    .substring(0, 1)
                    .toUpperCase();

            return str
                    .concat(case2.substring(1, case2.length()));
                   // .toLowerCase();
        } else {

            return "Строка пустая";
        }
    }

    //case8.3

    public static String task8three(String a) {
        if (!a.isEmpty()) {
            String str = a
                    .trim()
                    .substring(0,1)
                    .toUpperCase();

            return str
                    .concat(a.substring(1)
                    .trim()
                    .toLowerCase());
        } else {

            return "Строка пустая";
        }
    }

    //case4

    public static String capitalizeFirstLetterTwo(String incoming) {
        if (incoming != null) {
            incoming = incoming.trim();
            if (incoming.length() != 0) {
                return incoming
                        .substring(0, 1)
                        .toUpperCase()
                        .concat(incoming.substring(1).toLowerCase());

            }
        }

        return incoming;
    }






    public static void main(String[] args) {

        System.out.println("TASK 1");
        System.out.println(checkline("  QAforeveryone  "));
        System.out.println(checkline("QAforeveryone"));
        System.out.println(checkline(""));
        System.out.println(checkline("  "));
        System.out.println(checkline(null));
        System.out.println("_______________________________");

        System.out.println("TASK 2");
        System.out.println(removeAllData("  QAforeveryone  "));
        System.out.println(removeAllData("panda"));
        System.out.println("_______________________________");

        System.out.println("TASK 2_Variant2");
        String str2 = "  QAforeveryone  ";
        String str2_1 = "panda";

        System.out.println(removeAl(str2));
        System.out.println(removeAl(str2_1));
        //System.out.println(removeAl(nulltring));
        //System.out.println(removeAl(emptyString));
        System.out.println("_______________________________");


        System.out.println("TASK 3");
        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));
        System.out.println(removeAllZeros(null));
        System.out.println("_______________________________");


        System.out.println("Task 4");
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));
        System.out.println("_______________________________");


        System.out.println("Task 5");
        System.out.println(task5("Abracadabra"));
        System.out.println(task5("Homenum Revelio"));
        System.out.println("_______________________________");

        System.out.println("Task 5 Variant 2");
        System.out.println(task5("Abracadabra"));
        System.out.println(task5("Homenum Revelio"));
        System.out.println("_______________________________");


        System.out.println("Task 6");
        System.out.println(iscontainsJavaWord("As of March 2022, Java 18 is the latest version,\n" +
                "//    while Java 17, 11 and 8 are the current long-term support (LTS) versions.\n" +
                "//    Oracle released the last zero-cost public update for the legacy version Java 8 LTS\n" +
                "//    in January 2019 for commercial use, although it will otherwise still support Java 8\n" +
                "//    with public updates for personal use indefinitely.\n" +
                "//    Other vendors have begun to offer zero-cost builds of OpenJDK 8\n" +
                "//    and 11 that are still receiving security and other upgrades."));
        System.out.println(iscontainsJavaWord("As a decrepit father takes delight\n" +
                "//    To see his active child do deeds of youth,\n" +
                "//    So I, made lame by fortune’s dearest spite,\n" +
                "//    Take all my comfort of thy worth and truth.\n" +
                "//    For whether beauty, birth, or wealth, or wit,\n" +
                "//    Or any of these all, or all, or more,\n" +
                "//    Entitled in thy parts do crownèd sit,\n" +
                "//    I make my love engrafted to this store.\n" +
                "//    So then I am not lame, poor, nor despised,\n" +
                "//    Whilst that this shadow doth such substance give\n" +
                "//    That I in thy abundance am sufficed,\n" +
                "//    And by a part of all thy glory live.\n" +
                "//    Look what is best, that best I wish in thee.\n" +
                "//    This wish I have; then ten times happy me."));
        System.out.println("_______________________________");

        System.out.println("Task 6.2");
        System.out.println(iscontainsJavaWord("As of March 2022, Java 18 is the latest version,\n" +
                "//    while Java 17, 11 and 8 are the current long-term support (LTS) versions.\n" +
                "//    Oracle released the last zero-cost public update for the legacy version Java 8 LTS\n" +
                "//    in January 2019 for commercial use, although it will otherwise still support Java 8\n" +
                "//    with public updates for personal use indefinitely.\n" +
                "//    Other vendors have begun to offer zero-cost builds of OpenJDK 8\n" +
                "//    and 11 that are still receiving security and other upgrades."));
        System.out.println(iscontainsJavaWord("As a decrepit father takes delight\n" +
                "//    To see his active child do deeds of youth,\n" +
                "//    So I, made lame by fortune’s dearest spite,\n" +
                "//    Take all my comfort of thy worth and truth.\n" +
                "//    For whether beauty, birth, or wealth, or wit,\n" +
                "//    Or any of these all, or all, or more,\n" +
                "//    Entitled in thy parts do crownèd sit,\n" +
                "//    I make my love engrafted to this store.\n" +
                "//    So then I am not lame, poor, nor despised,\n" +
                "//    Whilst that this shadow doth such substance give\n" +
                "//    That I in thy abundance am sufficed,\n" +
                "//    And by a part of all thy glory live.\n" +
                "//    Look what is best, that best I wish in thee.\n" +
                "//    This wish I have; then ten times happy me."));
        System.out.println("_______________________________");

        System.out.println("Task 7");
        System.out.println(addSimvol("One"));
        System.out.println(addSimvol("    TWO  "));
        System.out.println("_______________________________");

        System.out.println("Task 7.2");
        System.out.println(task7Two("One"));
        System.out.println(task7Two("    TWO  "));
        System.out.println("_______________________________");


        System.out.println("Task 8");
        System.out.println(capitalizeFirstLetter("ташкент"));
        System.out.println(capitalizeFirstLetter("ЧикаГО"));
        System.out.println("_______________________________");

        System.out.println("Task 8.2");
        System.out.println(task8case2("ташкент"));
        System.out.println(task8case2("ЧикаГО"));
        System.out.println("_______________________________");

        System.out.println("Task 8.3");
        System.out.println(task8three("ташкент"));
        System.out.println(task8three("ЧикаГО"));
        System.out.println("_______________________________");

        System.out.println("Task 8.4");
        System.out.println(capitalizeFirstLetterTwo("ташкент"));
        System.out.println(capitalizeFirstLetterTwo("ЧикаГО"));
        System.out.println("_______________________________");



    }


}
