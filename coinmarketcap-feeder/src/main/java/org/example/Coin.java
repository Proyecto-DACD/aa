package org.example;

public class Coin {

   private final String name;
   private final String symbol;
   private final int maxSupply;
   private final int circulatingSupply;
   private final int totalSupply;
   private final boolean isActive;
   private final boolean isFiduciary;
   private final int ranking;
   private final Quote quote;

   public Coin(String name, String symbol, int maxSupply, int circulatingSupply, int totalSupply, boolean isActive, boolean isFiduciary, int ranking, Quote quote) {
      this.name = name;
      this.symbol = symbol;
      this.maxSupply = maxSupply;
      this.circulatingSupply = circulatingSupply;
      this.totalSupply = totalSupply;
      this.isActive = isActive;
      this.isFiduciary = isFiduciary;
      this.ranking = ranking;
      this.quote = quote;
   }

   public String getName() {
      return name;
   }

   public String getSymbol() {
      return symbol;
   }

   public int getMaxSupply() {
      return maxSupply;
   }

   public int getCirculatingSupply() {
      return circulatingSupply;
   }

   public int getTotalSupply() {
      return totalSupply;
   }

   public boolean isActive() {
      return isActive;
   }

   public boolean isFiduciary() {
      return isFiduciary;
   }

   public int getRanking() {
      return ranking;
   }

   public Quote getQuote() {
      return quote;
   }
}
