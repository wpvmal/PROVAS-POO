package services;

import java.util.ArrayList;
import java.util.List;

import entities.Biscoito;
import entities.Negresco;
import entities.Skiny;

public class Utils2 {
    
    public static List<Object> getLista(){
        List<Object> objetos = new ArrayList<>(){{
            add(new Biscoito("1"));
            add(new Skiny("2"));
            add(new Negresco("3"));
        }};

        ((Biscoito)objetos.get(0)).setPreco(10);
        ((Biscoito)objetos.get(1)).setPreco(30);
        ((Biscoito)objetos.get(2)).setPreco(20);
        return objetos;
    }
}
