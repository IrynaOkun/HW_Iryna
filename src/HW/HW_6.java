package HW;

public class HW_6 {

       //Метод форматирования double - 2 варианта, первый без потери точности, второй с потерей точности

        public static double formatDouble(double number, int d) {
            int num = (int) Math.round(number * Math.pow(10, d));
            number = num / Math.pow(10, d);
            return number;
        }

//    public static double formatDouble1(double number,  int d) {
//        int num = (int)(number * Math.pow(10, d));
//        number = num / Math.pow(10, d);
//
//        return number;
//    }

        //    10. Написать метод, который принимает на вход параметры start, end, step,
        //    и печатает последовательность десятичных чисел, начиная с числа start, с шагом step.
        //    Точка выхода из цикла - число end.

        //Решение без форматирования
        public static void seq10(double start,  double end,  double step, int d) {
            //increasing start < end,  step > 0
            //decreasing start > end, step < 0
            if (start < end && step > 0) {
                for (start = start; start < end; start += step) {
                    System.out.println(start);
                }
            } else if (start > end && step < 0) {
                for (start = start; start > end; start += step) {
                    System.out.println(start);
                }
            } else {
                System.out.println("Invalid data");
            }
        }

//Решение с форматированием с потерей точности
//    public static void seq10F(double start,  double end,  double step, int d) {
//        //increasing start < end,  step > 0
//        //decreasing start > end, step < 0
//        if (start < end && step > 0) {
//            for (start = start; start < end; start += step) {
//                System.out.println(formatDouble1(start, d));
//            }
//        } else if (start > end && step < 0) {
//            for (start = start; start > end; start += step) {
//                System.out.println(formatDouble1(start, d));
//            }
//        } else {
//            System.out.println("Invalid data");
//        }
//    }

        //Решение с форматированием без потери точности
        public static void seq10FF(double start,  double end,  double step, int d) {
            //increasing start < end,  step > 0
            //decreasing start > end, step < 0
            if (start < end && step > 0) {
                for (start = start; start < end; start += step) {
                    System.out.println(formatDouble(start, d));
                }
            } else if (start > end && step < 0) {
                for (start = start; start > end; start += step) {
                    System.out.println(formatDouble(start, d));
                }
            } else {
                System.out.println("Invalid data");
            }
        }

        //17. Сгенерируйте и распечатайте последовательность по формуле:
        //    n + 1 = n + 2

        public static void seq17(int n) {
            int l = n + 5;
            for ( ; n < l; n++) {
                System.out.println("[" + (n + 1) + "]" + " = " +  (n + 2));
            }
        }

        //18. Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
        // начиная с числа n,
        // по формуле для n + 1 члена последовательности:
        // n + 1 = 2n

        public static void seq18(int n, int l) {
            if (n < l) {
                System.out.println("[" + (n) + "]" + " = " +  n);

                for (; n < l; n++) {
                    System.out.println("[" + (n + 1) + "]" + " = " +  (2 * n));
                }
            } else {
                System.out.println("Invalid data");
            }
        }

        public static void main(String[] args) {

//        //happy path - без форматирования
//        seq10(10.5, 20.75, 1.29);
//
//        System.out.println("________________________________");

            //happy path
//        seq10(15.9, 0, -1.45);
//
//        System.out.println("________________________________");
//
//        //negative
//        seq10(15.9, 0, 0);
//
//        System.out.println("________________________________");
//
//        //negative
//        seq10(15.9, 0, 1);
//
//        System.out.println("________________________________");
//
//        //negative
//        seq10(-15.9, 0, -1);
//
//        System.out.println("________________________________");
//
//        //negative
//        seq10(0, 0, 1);
//
//        System.out.println("________________________________");
//
//        //negative
//        seq10(0, 0, -1);

            seq10(10.5, 20.75, 1.29, 2);
            System.out.println("________________________________");

            seq10(15.9, 0, -1.45, 2);

            System.out.println("________________________________");

//        seq10F(10.5, 20.75, 1.29, 2);
//        System.out.println("________________________________");
//        System.out.println("________________________________");
//
//        seq10F(15.9, 0, -1.45, 2);

            System.out.println("________________________________");

            seq10FF(10.5, 20.75, 1.29, 2);
            System.out.println("________________________________");

            seq10FF(15.9, 0, -1.45, 2);

            System.out.println("________________________________");
            System.out.println("________________________________");
            System.out.println("________________________________");
            seq17(1);
            System.out.println("________________________________");
            seq17(2);

            System.out.println("________________________________");
            seq18(1, 10);
        }
    }


