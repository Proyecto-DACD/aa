package org.example;

public class Coin {
    private int hola;
    private String name;
    private int i;
    private String symbol;
    private int is_active;
    private int is_fiat;

    public Coin(int id, String name, int i, String symbol, int is_active, int is_fiat) {
        this.id = id;
        this.name = name;
        this.i = i;
        this.symbol = symbol;
        this.is_active = is_active;
        this.is_fiat = is_fiat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getI() {
        return i;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getIs_active() {
        return is_active;
    }

    public int getIs_fiat() {
        return is_fiat;
    }
}
