package org.example;

public class CurrencyInfo {
    public final double price;
    public final double volumeIn24h;
    public final double volumeChange24h;
    public final double percentChange1h;
    public final double percentChange24h;
    public final double percentChange7d;
    public final double percentChange30d;
    public final double percentChange60d;
    public final double percentChange90d;
    public final double marketCap;

    public CurrencyInfo(double price, double volumeIn24h, double volumeChange24h, double percentChange1h, double percentChange24h, double percentChange7d, double percentChange30d, double percentChange60d, double percentChange90d, double marketCap) {
        this.price = price;
        this.volumeIn24h = volumeIn24h;
        this.volumeChange24h = volumeChange24h;
        this.percentChange1h = percentChange1h;
        this.percentChange24h = percentChange24h;
        this.percentChange7d = percentChange7d;
        this.percentChange30d = percentChange30d;
        this.percentChange60d = percentChange60d;
        this.percentChange90d = percentChange90d;
        this.marketCap = marketCap;
    }

    public double getPrice() {
        return price;
    }

    public double getVolumeIn24h() {
        return volumeIn24h;
    }

    public double getVolumeChange24h() {
        return volumeChange24h;
    }

    public double getPercentChange1h() {
        return percentChange1h;
    }

    public double getPercentChange24h() {
        return percentChange24h;
    }

    public double getPercentChange7d() {
        return percentChange7d;
    }

    public double getPercentChange30d() {
        return percentChange30d;
    }

    public double getPercentChange60d() {
        return percentChange60d;
    }

    public double getPercentChange90d() {
        return percentChange90d;
    }

    public double getMarketCap() {
        return marketCap;
    }
}
