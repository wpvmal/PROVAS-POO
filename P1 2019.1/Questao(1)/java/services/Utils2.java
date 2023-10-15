package services;

import java.util.ArrayList;
import java.util.List;

import entities.Elefante;
import entities.Notebook;
import entities.Produto;

public class Utils2 {
    public static List<Object> getLista() {
        List<Object> objs = new ArrayList<>() {
            {
                add(new Produto("1"));
                ((Produto) get(0)).setPreco(100);

                add(new Notebook("2"));
                ((Produto) get(1)).setPreco(200);

                add(new Notebook("3"));
                ((Produto) get(2)).setPreco(300);

                add(new Produto("4"));
                ((Produto) get(3)).setPreco(400);

                add(new Elefante("Dumbo"));
            }
        };
        return objs;
    }
}
