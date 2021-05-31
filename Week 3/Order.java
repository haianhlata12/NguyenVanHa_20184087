public class Order {
  public static final int MAX_NUMBERS_ORDERED = 10;
  private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
  private int qtyOrdered;

  public int getQtyOrdered() {
    return qtyOrdered;
  }

  public void setQtyOrdered(int qtyOrdered) {
    this.qtyOrdered = qtyOrdered;
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
}
