public class MainClass {
    public static void main(String[] args) {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("A Null Pointer Exception happened!");
            System.out.println("Exception message: " + e.toString());
            e.printStackTrace();
        }
    }

    public static void generateNullPointerException() {
        String text = null;
        int length = text.length();
    }
}
