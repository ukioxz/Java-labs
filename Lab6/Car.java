public class Car extends Toys{
    private static int Height_car = 10;
    private static String Name_car = "McQueen";
    public Car(String age_group, int price) {
        super(age_group, price);
        setHeight(Height_car);
        setName(Name_car);
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("Car: ");
        sb.append("Age group: ").append(getAge());
        sb.append("; price: ").append(getPrice());
        sb.append("; height: ").append(getHeight());
        sb.append("; name: ").append(getName());
        return sb.toString();
    }
}
