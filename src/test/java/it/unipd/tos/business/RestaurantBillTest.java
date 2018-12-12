////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////

package it.unipd.tos.business;

import static org.junit.Assert.*;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.itemType;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RestaurantBillTest {
  
  @Test
  public void testGetOrderPrice_ListSizeBiggerThan20_RestaurantBillException() {
      Bill b = new Bill();
      List<MenuItem> l = new ArrayList<MenuItem>(21);
      for(int i=0;i<21;i++) {
        l.add(new MenuItem(itemType.Pizze, "Margherita", 6.50));  
      }
      try {
        b.getOrderPrice(l);
      } catch (RestaurantBillException e) {
        assertEquals(e.getMessage(), "Errore: ordinazione troppo grande");
      }
  }  

  @Test
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

    Bill b = new Bill();
    double p = b.getOrderPrice(l);
    assertEquals(Integer.toString(((int) Math.round(p))), Integer.toString(((int) Math.round(121.6))));
    

}

}
