public class Room {
    private int availableCost;
    private Toys[] content;

    public Room(int availableCost) {
        this.setAvailableCost(availableCost);
    }
    public void DisplayRoom() {
        for (int i = 0; i < content.length; i++) {
            System.out.println("Item " + i);
            System.out.println(content[i].toString());
        }
    }

    public int getAvailableCost() {
        return availableCost;
    }

    public void setAvailableCost(int availableCost) {
        this.availableCost = availableCost;
    }

    public Toys[] getContent() {
        return content;
    }

    public void setContent(Toys[] content) {
        this.content = content;
    }
}
