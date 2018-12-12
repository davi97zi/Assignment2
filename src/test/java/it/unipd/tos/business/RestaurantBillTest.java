////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////

package it.unipd.tos.business;

import static org.junit.Assert.*;

import org.junit.Test;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.itemType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RestaurantBillTest {

public MenuItem generateRandomMenuItem() {
  String[] pizze  = {"Margherita", "Capricciosa"};
  String[] primi = {"Bucatini", "Carbonara"};

  Random r = new Random();

  String nome;
  itemType iT;
  if(r.nextBoolean()) {
    iT = itemType.Pizze;
    nome = pizze[r.nextInt(2)];
  }
  else {
    iT = itemType.Primi;
    nome = primi[r.nextInt(2)];
  }

  double prezzo = 6 + 4*r.nextDouble();

  return new MenuItem(iT, nome, prezzo);
}
  @Test
  public void testGetOrderPrice_ListSizeBiggerThan20_RestaurantBillException() {
     Bill b = new Bill();
     try {
        b.getOrderPrice(new ArrayList<MenuItem>(21));
     } catch (RestaurantBillException e) {
        assertEquals(e.getMessage(), "Non si possono ordinare piu' di 20 pietanze");
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