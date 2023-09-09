public class Media {
    
    public static double calcula(String numeros){
        int soma = 0;
        String[] arrayNumeros = numeros.split("#");

        for (String numero : arrayNumeros) {
            soma += Integer.parseInt(numero);
        }
        return soma/arrayNumeros.length;
    }

    /* Para testar*/
    public static void main(String[] args) {
        System.out.println(calcula("10#40#2#76#2"));
    }
    
}
