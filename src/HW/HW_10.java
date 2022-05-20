package HW;

public class HW_10 {

    public static String capitalizeWords(String sentence) {

        //пустой String = " ";
        // String str = null;

        if (sentence != null) {
            sentence = sentence.trim();
            if (sentence.length() != 0) {

                //Character.toString(sentence.charAt(0)).toUpperCase();
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);

                    }
                }

                return sentence;
            }

            return "";

        }

        return "";
    }

    public static void main(String[] args) {
//        System.out.println("   happy birthday!     ");
//        System.out.println(capitalizeWords("   happy birthday!     "));
//        System.out.println(capitalizeWords(""));
//        System.out.println(capitalizeWords(null));
//        System.out.println(capitalizeWords("     jonh jakob smith jr.    "));
        System.out.println(capitalizeWords(" "));
    }

}
