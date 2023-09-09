package services;

import java.util.List;

import entities.Produto;

public class Utils {
    public static boolean existe(List<Object> x, Produto y){
        return x.contains(y);
    }
}
