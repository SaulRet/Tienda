package com.tienda.service;

import com.tienda.domain.Item;
import java.util.ArrayList;
import java.util.List;

public interface ItemService {

    //En lugar de tabla de BD se usa un Arraylist para registro temporal
    public List<Item> listaItems = new ArrayList<>();

    public List<Item> getItems();

    public void save(Item item);

    public void delete(Item item);

    public Item getItem(Item item);

    public void actualiza(Item item);

    public void facturar();

}
