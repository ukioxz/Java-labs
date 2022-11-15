import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Cosmetics[] cosmetics = new Cosmetics[5];
		cosmetics[0] = new Cosmetics("avon", "red", "lipstick", 180, 3.6);
		cosmetics[1] = new Cosmetics("nyx", "translucent", "powder", 270, 8.0);
		cosmetics[2] = new Cosmetics("essence", "brown", "eye shadow", 160, 4.5);
		cosmetics[3] = new Cosmetics("maybelline", "ivory", "concealer", 150, 6.8);
		cosmetics[4] = new Cosmetics("max factor", "black", "mascara", 236, 9.0);
		bubbleSort(cosmetics);
		System.out.println("Sorting by desending order:");
		for (int i = 0; i < cosmetics.length; i++) {
            System.out.println(cosmetics[i].getPrice()+ " " + cosmetics[i].getName());
        }
		bubbleSortWeight(cosmetics);
		System.out.println("\nSorting by increments:");
		for (int i = 0; i < cosmetics.length; i++) {
            System.out.println(cosmetics[i].getWeight() + " " + cosmetics[i].getName());
        }
		
	}
	private static Cosmetics[] bubbleSort(Cosmetics[] arr) {
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j].getPrice() > arr[j+1].getPrice()) {
                    Cosmetics temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
		 
        return  arr;
    }
	private static Cosmetics[] bubbleSortWeight(Cosmetics[] arr) {
		 
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j].getWeight() < arr[j+1].getWeight()) {
                    Cosmetics temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }
}
