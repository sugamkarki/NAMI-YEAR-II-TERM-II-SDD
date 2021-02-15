package exceptions;

public class One {

    public static void main(String[] args) {
        String initialString="Sugam";
        int convertedInt;
        try {
            convertedInt=Integer.parseInt(initialString);
            System.out.println("the conversion went smoothly");
        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println("there was an exception "+e);
        }
    }
}