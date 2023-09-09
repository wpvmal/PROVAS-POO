public class Q3 {
    public static void main(String[] args) {
        String normal = "William";
        String invertida = inverter(normal);

        System.out.println(invertida);
    }

    public static String inverter (String str){
        char[] strChars = str.toCharArray();
        char[] strInvertido = str.toCharArray();
        
        int j = strChars.length - 1;
        for (int i = 0; i < strChars.length; i++){
            strInvertido[i] = strChars[j];
            j--;
        }
        return new String(strInvertido);
    }
}
