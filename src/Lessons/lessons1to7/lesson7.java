package Lessons.lessons1to7;

public class lesson7 {


        public static void main(String[] args) {

            //объект типа String со значением "Рыжик"
            String catName = "Рыжик";

            //ячейка памяти типа String-массив
            String[] catsNames;

            //объект типа String-массив,  состоящий из 8 ячеек
            catsNames = new String[8];
            catsNames[4] = "Рыжик";
            catsNames[1] = "Черныш";
            catsNames[6] = "Рыжик";

            //объект типа int-массив,  состоящий из 8 ячеек
            int[] catsAges = new int[8];

            System.out.println(catName);
            System.out.println(catsNames);
            System.out.println(catsNames);
            System.out.println(catsAges);

            System.out.println(catsNames[0]);
            System.out.println(catsNames[7]);
            System.out.println(catsAges[2]);

            System.out.println(catsNames[4]);

            System.out.println("___________________________");
            for (int i = 0; i <= 7; i++) {
                System.out.println(catsNames[i]);
            }

            System.out.println("___________________________");
            for (int i = 0; i < 8; i ++) {
                if (catsNames[i] == "Рыжик") {
                    System.out.println(catsNames[i]);
                }
            }

            System.out.println("___________________________");
            for (int i = 0; i < 8; i++) {
                if (catsNames[i] == "Рыжик") {
                    System.out.println(i);
                }
            }

            System.out.println("___________________________");
            for (int i = 0; i < 8; i++) {
                if (catsNames[i] == "Черныш") {
                    System.out.println(i);
                }
            }

            System.out.println("___________________________");
            System.out.println(catsNames.length);
            System.out.println(catsAges.length);
        }
    }


