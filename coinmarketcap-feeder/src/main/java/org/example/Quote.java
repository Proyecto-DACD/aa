package org.example;

public class Quote {
    private final CurrencyInfo usd;
    private final CurrencyInfo eur;
    private final CurrencyInfo gbp;
    private final CurrencyInfo cny;
    private final CurrencyInfo yen;

    public Quote(CurrencyInfo usd, CurrencyInfo eur, CurrencyInfo gbp, CurrencyInfo cny, CurrencyInfo yen) {
        this.usd = usd;
        this.eur = eur;
        this.gbp = gbp;
        this.cny = cny;
        this.yen = yen;
    }

    public CurrencyInfo getUsd() {
        return usd;
    }

    public CurrencyInfo getEur() {
        return eur;
    }

    public CurrencyInfo getGbp() {
        return gbp;
    }

    public CurrencyInfo getCny() {
        return cny;
    }

    public CurrencyInfo getYen() {
        return yen;
    }
}
