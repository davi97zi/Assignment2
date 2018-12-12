////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////
package it.unipd.tos.model;
public class MenuItem {
  public enum itemType{Pizze,Primi}
  
  private itemType itemT;
  private String nome;
  private double prezzo;
  
  public MenuItem(itemType iT, String n, double p) {
    itemT = iT;
    nome = n;
    prezzo = p;
  }
  
  public itemType getItemType() {
    return itemT;
  }
  
  public String getNome() {
    return nome;
  }
  
  public double getPrezzo() {
    return prezzo;
  }
}