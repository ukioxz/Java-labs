public class Doll extends Toys{
    private static int Height_doll = 20;
    private static String Name_doll = "Barbi";
    public Doll(String age_group, int price) {
        super(age_group, price);
        setHeight(Height_doll);
        setName(Name_doll);
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("Doll: ");
        sb.append("Age group: ").append(getAge());
        sb.append("; price: ").append(getPrice());
        sb.append("; height: ").append(getHeight());
        sb.append("; name: ").append(getName());
        return sb.toString();
    }
}
