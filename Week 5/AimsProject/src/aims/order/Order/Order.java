package aims.order.Order;

import aims.disc.DigitalVideoDisc.DigitalVideoDisc;

import java.util.Date;

public class Order {
  public static final int MAX_NUMBERS_ORDERED = 10;
  public static final int MAX_LIMITED_ORDERS = 5;
  private static int nbOrders;
  private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
  private int qtyOrdered;
  private Date dateOrdered;

  public Order() {
    if (nbOrders == MAX_LIMITED_ORDERS) {
      System.out.println("Max limited orders in day");
      return;
    }
    this.setDateOrdered();
    nbOrders++;
  }

  public int getQtyOrdered() {
    return qtyOrdered;
  }

  public void setQtyOrdered(int qtyOrdered) {
    this.qtyOrdered = qtyOrdered;
  }

  public Date getDateOrdered() {
    return dateOrdered;
  }

  public void setDateOrdered() {
    dateOrdered = new Date();;
  }

  public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered < 10) {
      itemsOrdered[qtyOrdered] = disc;
      qtyOrdered++;
      System.out.println("The disc has been added!");
    } else {
      System.out.println("The order is almost full!");
    }
  }

  public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    if (qtyOrdered + dvdList.length < 10) {
      for (int i = 0; i < dvdList.length; i++) {
        itemsOrdered[qtyOrdered] = dvdList[i];
        qtyOrdered++;
        System.out.println("The disc has been added!");
      }
    } else {
      System.out.println("The order is almost full!");
    }
  }

  public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    if (qtyOrdered + 2 < 10) {
      itemsOrdered[qtyOrdered] = dvd1;
      qtyOrdered++;
      itemsOrdered[qtyOrdered] = dvd2;
      qtyOrdered++;
      System.out.println("The disc has been added!");
    } else {
      System.out.println("The order is almost full!");
    }
  }

  public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered > 0) {
      int index = -1;

      for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i].equals(disc)) {
          index = i;
          break;
        }
      }

      if (index == -1) {
        System.out.println("Disc is not in order!");
      } else {
        qtyOrdered--;
        for (int i = index; i < qtyOrdered; i++) {
          itemsOrdered[i] = itemsOrdered[i + 1];
        }
        System.out.println("The disc has been removed!");
      }
    } else {
      System.out.println("There is no disc in order!");
    }
  }

  public float totalCost() {
    float total = 0;

    for (int i = 0; i < qtyOrdered; i++) {
      total += itemsOrdered[i].getCost();
    }
    return total;
  }

  public void printOrder() {
    System.out.println("*****************Order******************");
    System.out.println("Date: " + dateOrdered);
    System.out.println("Ordered items:");
    for (int i = 0; i < qtyOrdered; i++) {
      System.out.println(i + 1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
    }
    System.out.println("Total cost: " + this.totalCost());
    System.out.println("****************************************");
  }

  public DigitalVideoDisc getALuckyItem() {
    int randomDvd = (int)(qtyOrdered * Math.random());
    itemsOrdered[randomDvd].setCost(0);
    return itemsOrdered[randomDvd];
  }
}
