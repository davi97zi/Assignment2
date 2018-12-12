////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.ArrayList;
import java.util.List;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.itemType;

public class Bill implements RestaurantBill {

  public double getOrderPrice(List<MenuItem> l) throws RestaurantBillException { 
    
    double price=0;
    for(MenuItem i : l) { //calcolo somma
      price+=i.getPrezzo();
    }
   
    if(numberOfItem(l, itemType.Pizze) > 10) {
      price-=minPriceItem(l, itemType.Pizze);
    }
    
    return price;
  }
  
  public double minPriceItem(List<MenuItem> l, itemType it) {
    double minPrice = Double.MAX_VALUE;
    for(MenuItem i : l) {
      if(i.getItemType()==it && i.getPrezzo() < minPrice) {
        minPrice = i.getPrezzo();
      }
    }
    return minPrice;
  }
  
  public int numberOfItem(List<MenuItem> l, itemType it) {
    int n = 0;
    for(MenuItem i : l) {
      if(i.getItemType()==it) {
        n++;
      }
    }
    return n;
  }

}