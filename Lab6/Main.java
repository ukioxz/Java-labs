import java.util.*;
public class Main {
    public static void main(String[] args) {
        Toys[] toys = {
                new Doll("middle", 100),
                new Car("little", 67),
                new Doll("little", 60),
                new Doll("little", 30),
                new Cube("big", 42),
                new Car("big", 167),
                new Cube("middle", 102),
        };
        Room room = new Room(600);
        ArrayList<Toys> myList = new ArrayList<Toys>();

        int fullCosts = 0;
        for (Toys item : toys) {
            if (fullCosts < room.getAvailableCost()) {
                myList.add(item);
                fullCosts += item.getPrice();
            } else {
                break;
            }
        }
        room.setContent(myList.toArray(toys));

        System.out.println("Cost: " + fullCosts);
        for (Toys item : myList) {
            if ((item.getPrice() >= 60) && (item.getPrice() < 102)) {
                System.out.println(item);
            }
        }
    }
}