package services;

import java.util.List;

import entities.Biscoito;

public class Utils {

    public static boolean existe(List<Object> x, Biscoito y) {

        return x.contains(y);
    }
}
