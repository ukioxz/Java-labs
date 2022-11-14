import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Cosmetics[] cosmetics = new Cosmetics[5];
		cosmetics[0] = new Cosmetics("avon", "red", "lipstick", 180, 3.6);
		cosmetics[1] = new Cosmetics("nyx", "translucent", "powder", 270, 8.0);
		cosmetics[2] = new Cosmetics("essence", "brown", "eye shadow", 160, 4.5);
		cosmetics[3] = new Cosmetics("maybelline", "ivory", "concealer", 150, 6.8);
		cosmetics[4] = new Cosmetics("max factor", "black", "mascara", 236, 9.0);
		/*System.out.println(cosmetics[0].getBrand());
		System.out.println(cosmetics[0].getColor());*/
		/*for (int i = 0; i < cosmetics.length; i++) {
            int cosmetics_Price = cosmetics[i].getPrice();
        }*/
		/*for (int i = 0; i < cosmetics.length -1; i++) {
            for (int j = i+1; j < cosmetics.length-i-1; j++) {
                if (cosmetics[i].getPrice() > cosmetics[j].getPrice()) {
                	Cosmetics temp = cosmetics[j];
                    cosmetics[i] = cosmetics[j];
                    cosmetics[j] = temp;
                }
            }
        }
		System.out.println(cosmetics[0].getPrice());*/
	
		/*for (double values : cosmetics) {
			System.out.print(values + ',');
		}*/
		bubbleSort(cosmetics);
		for (int i = 0; i < cosmetics.length; i++) {
            System.out.println(cosmetics[i].getPrice());
        }
		bubbleSortWeight(cosmetics);
		for (int i = 0; i < cosmetics.length; i++) {
            System.out.println(cosmetics[i].getWeight());
        }
		
	}
	private static Cosmetics[] bubbleSort(Cosmetics[] arr) {
        /*for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j].getPrice() > arr[j+1].getPrice()) {
                    Cosmetics temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/
		 int n = arr.length;  
	        //int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1].getPrice() > arr[j].getPrice()){  
	                                 //swap elements  
	                        	  Cosmetics temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
        return  arr;
    }
	private static Cosmetics[] bubbleSortWeight(Cosmetics[] arr) {
		 int n = arr.length;  
	        //int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1].getWeight() < arr[j].getWeight()){  
	                                 //swap elements  
	                        	  Cosmetics temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
        return  arr;
    }
}
