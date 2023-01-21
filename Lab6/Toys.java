public class Toys {
    private String age_group;
    private int price;

    private int Height_doll;

    private String Name_doll;

    public Toys(String age_group, int price) {
        setPrice(price);
        setAge(age_group);
    }

    public String getAge() {

        return age_group;
    }

    public void setAge(String age_group) {

        this.age_group = age_group;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }
    public int getHeight() {

        return Height_doll;
    }

    public void setHeight(int Height_doll) {

        this.Height_doll = Height_doll;
    }

    public String getName() {
        return Name_doll;
    }

    public void setName(String Name_doll) {

        this.Name_doll = Name_doll;
    }
}
