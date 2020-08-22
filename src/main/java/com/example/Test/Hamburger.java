package com.example.Test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hamburger {
    private String menu;
    private int price;
    private int tex;

    Hamburger(String menu, int price){
        this.menu = menu;
        this.price = price;
        this.tex = price/10;
    }
}
