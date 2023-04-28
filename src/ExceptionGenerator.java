public class ExceptionGenerator {
    public class NullPointerException {
        public static int generateNullPointerException() {
            String text = null;
            int length = text.length();
            return length;
        }

    }
}