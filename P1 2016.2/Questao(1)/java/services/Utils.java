package services;

public class Utils {
    public static int[] booleanToInt(boolean[] arrayBoolean) {
        int[] arrayInt = new int[arrayBoolean.length];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = arrayBoolean[i] ? 1 : 0;
        }
        return arrayInt;
    }
}
