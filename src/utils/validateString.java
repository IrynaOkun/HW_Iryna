package utils;

    public class validateString {

        public static boolean isStringValid (String str) {
            if (str != null) {
                if (!str.isEmpty()) {
                    return true;
                }

                return false;
            }

            return false;
        }
    }


