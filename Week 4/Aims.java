public class Aims {
  public static void main(String[] args) {
    Order anOrder = new Order();
    Order anOrder1 = new Order();
    Order anOrder2 = new Order();
    Order anOrder3 = new Order();
    Order anOrder4 = new Order();
    Order anOrder5 = new Order();

    anOrder5.printOrder();

    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
    dvd1.setCategory("Animation");
    dvd1.setCost(19.95f);
    dvd1.setDirector("Roger Allers");
    dvd1.setLength(87);
    anOrder.addDigitalVideoDisc(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
    dvd2.setCategory("Science Fiction");
    dvd2.setCost(24.95f);
    dvd2.setDirector("George Lucas");
    dvd2.setLength(124);
    anOrder.addDigitalVideoDisc(dvd2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
    dvd3.setCategory("Animation");
    dvd3.setCost(18.99f);
    dvd3.setDirector("John Musker");
    dvd3.setLength(90);
    anOrder.addDigitalVideoDisc(dvd3);

    DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladdin");
    DigitalVideoDisc dvd5 = new DigitalVideoDisc("Bladdin");
    DigitalVideoDisc dvd6 = new DigitalVideoDisc("Claddin");

    anOrder.printOrder();
  }
}
