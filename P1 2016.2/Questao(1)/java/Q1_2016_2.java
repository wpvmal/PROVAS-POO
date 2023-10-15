import services.Utils;

public class Q1_2016_2 {
    public static void main(String[] args) {
        boolean[] arrayBoolean = new boolean[] {
                false,
                true,
                true,
                false,
                false,
                false,
                true,
                true,
                false
        };

        int[] arrayInt = Utils.booleanToInt(arrayBoolean);

        for (int i : arrayInt) {
            System.out.println(i);
        }
    }
}
