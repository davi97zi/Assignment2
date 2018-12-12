////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////

package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public interface RestaurantBill {
  double getOrderPrice(List<MenuItem> l) throws RestaurantBillException;
}