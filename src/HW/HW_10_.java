package HW;

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

//    3. Написать алгоритм RemoveAllZeros.
//    С помощью методов из видео1,  написать алгоритм,
//    который принимает на вход строку, состоящую из цифр.
//    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//    Метод возвращает обработанную строку, в которой нет нулей.
//    Test Data:
//            “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//            “ 0000000111“ → “111”


    public static String removeAllZeros(String str) {
        if (!str.isEmpty()) {
            str.trim();

            return str.replace(" ", "").replace("0", "");
        } else {

            return "Строка пустая";
        }


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

        System.out.println("TASK 3");
        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));
        System.out.println("_______________________________");


    }


}
