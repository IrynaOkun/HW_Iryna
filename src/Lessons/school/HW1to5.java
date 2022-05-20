package Lessons.school;

public class HW1to5 {

    //Написать метод, который принимает на вход 2 параметра -
    // цену и количество товара (может быть вес товара, или количество в штуках).
    // Алгоритм возвращает сумму покупки в виде десятичного числа.

    public static double countTotalPrice(double price, double amount) {
        double totalPrice = 0;
        totalPrice = price * amount;

        return totalPrice;
    }

    public static String countTotalPrice1(double price, double amount) {
        double totalPrice = 0;
        totalPrice = price * amount;
        String totalPriceWithRubles = totalPrice + " рублей";

        return totalPriceWithRubles;
    }

    public static boolean countTotalPrice2(double price, double amount) {
        double totalPrice = 0;
        totalPrice = price * amount;
        boolean flag = false;

        if (totalPrice > 5) {
            flag = true;
        }

        return flag;
    }

    public static boolean countTotalPrice3(double price, double amount) {

        return (price * amount) > 5;
    }

    //9 Написать метод, который принимает на вход необходимые параметры, и печатает чек.
    //Например:
    //
    //Яблоки
    //Цена за 1 кг           50 руб 13 коп
    //Количество товара             3 кг 400 гр
    //_______________________________________
    //Сумма к оплате      170 руб 44 коп
    //
    //или
    //
    //Хлеб
    //Цена за 1 шт    30 руб 50 коп
    //Количество товара    5 шт
    //_______________________________________
    //Сумма к оплате      152 руб 50 коп


    public static String convertPriceToString(double price) { //152.5
        if (price >= 0) {
            String returnString = "";
            int priceRubles = (int)price; //152
            double priceCoins = price - priceRubles; //0.5
            int priceCoinsInt = (int)(priceCoins * 100); //50

            if (priceCoinsInt < 10) {
                returnString = priceRubles + " руб " + "0" + priceCoinsInt + " коп";
            } else {
                returnString = priceRubles + " руб " + priceCoinsInt + " коп";
            }

            return returnString;
        }

        return "Введите правильное значение";
    }

    public static String line() {

        return "____________________________________________";
    }

    public static void printLine() {

        System.out.println("____________________________________________");
    }
//
//    public static ___   () {
//
//
//        return
//    }

    public static void printCheck(String item, String measure, double price,  double amount) {
        System.out.println(item);
        System.out.println("Цена за 1 " + measure + "\t\t\t\t" + convertPriceToString(price));

        System.out.println(line());
        printLine();
    }

    public static void main(String[] args) {

        System.out.println(countTotalPrice(0.35, 10) + " рублей");
        System.out.println(countTotalPrice1(6, 2));

        System.out.println("___________________________");
        countTotalPrice(0.35, 10);

        System.out.println("___________________________");
        System.out.println(countTotalPrice2(0.35, 10));
        System.out.println(countTotalPrice2(6, 2));

        System.out.println("___________________________");
        System.out.println(countTotalPrice3(0.35, 10));
        System.out.println(countTotalPrice3(6, 2));

        System.out.println("___________________________");
        System.out.println("___________________________");

        System.out.println(convertPriceToString(152.505));

        System.out.println("___________________________");
        System.out.println("___________________________");
        System.out.println("___________________________");
        System.out.println("___________________________");

        printCheck("Яблоки", "кг", 50.13, 3.400);
    }
}


