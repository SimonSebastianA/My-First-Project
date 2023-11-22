package org.qatesternbn;

import java.time.LocalDateTime;

public class Food {
    String name;
    double price;
    double quantity;
   boolean inStock;
   LocalDateTime expiryDate;
   String type;
   double calories;
   double weight;
   String typeOfMeat;

   public Food(String name) {

       this.name = name;

   }

}
