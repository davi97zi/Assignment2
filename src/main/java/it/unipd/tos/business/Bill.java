////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class Bill implements RestaurantBill {
  public double getOrderPrice(List<MenuItem> l) throws RestaurantBillException {
    double price=0;
    for(MenuItem i : l) {
      price+=i.getPrezzo();
    }
    return price;
  }
}