public class Cube extends Toys{
    private static int Height_cube = 10;
    private static String Name_cube = "Lego";
    public Cube(String age_group, int price) {
        super(age_group, price);
        setHeight(Height_cube);
        setName(Name_cube);
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("Cube: ");
        sb.append("Age group: ").append(getAge());
        sb.append("; price: ").append(getPrice());
        sb.append("; height: ").append(getHeight());
        sb.append("; name: ").append(getName());
        return sb.toString();
    }
}
