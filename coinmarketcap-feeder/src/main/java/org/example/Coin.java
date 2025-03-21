package org.example;

public class Coin {
   private final String name;
   private final String symbol;
   private final int isActive;
   private final int isFiduciary;
   private final int circulatingSupply;
   private final int totalSupply;
   private final int maxSupply;

   public Coin(String name, String symbol, int isActive, int isFiduciary, int circulatingSupply, int totalSupply, int maxSupply) {
      this.name = name;
      this.symbol = symbol;
      this.isActive = isActive;
      this.isFiduciary = isFiduciary;
      this.circulatingSupply = circulatingSupply;
      this.totalSupply = totalSupply;
      this.maxSupply = maxSupply;
   }

   public String getName() {
      return name;
   }

   public String getSymbol() {
      return symbol;
   }

   public int getIsActive() {
      return isActive;
   }

   public int getIsFiduciary() {
      return isFiduciary;
   }

   public int getCirculatingSupply() {
      return circulatingSupply;
   }

   public int getTotalSupply() {
      return totalSupply;
   }

   public int getMaxSupply() {
      return maxSupply;
   }
}
