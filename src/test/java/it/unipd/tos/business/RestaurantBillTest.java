////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////

package it.unipd.tos.business;

import static org.junit.Assert.*;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.itemType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RestaurantBillTest {
  
  @org.junit.Test(expected = RestaurantBillException.class)
  public void testGetOrderPrice_ListSizeBiggerThan20_RestaurantBillException() throws RestaurantBillException {
     List<MenuItem> list = new ArrayList<>();
     for(int i = 0; i < 21; i++) {
       list.add(new MenuItem(MenuItem.itemType.PIZZA, "Margherita", 4.50));
     }
     Bill b = new Bill();
     b.getOrderPrice(list);
  }
  
  @org.junit.Test
  public void testGetOrderPrice() throws RestaurantBillException {
    //fail("Not yet implemented");
    List<MenuItem> l = new ArrayList<MenuItem>();
    l.add(new MenuItem(itemType.Pizze, "Margherita", 5.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Pizze, "Capricciosa", 10.2));
    l.add(new MenuItem(itemType.Primi, "Bucatini", 7.0));
    l.add(new MenuItem(itemType.Primi, "Carbonara", 8.8));
    
    if(l.size() > 20) {
      throw new RestaurantBillException("Numero di ordinazioni" + 
                     " maggiori di 20");
    }
    
    Bill b = new Bill();
    double p = b.getOrderPrice(l);
    assertEquals(Integer.toString(((int) Math.round(p))), Integer.toString(((int) Math.round(121.6))));
    

}

}
