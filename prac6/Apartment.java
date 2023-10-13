package prac6;

class Apartment implements Priceable {
    private double price;

    public Apartment(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
