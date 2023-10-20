// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array: " + Arrays.toString(array));
        
        shuffleArray(array);
        System.out.println("Shuffled array: " + Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        
        for (int i = array.length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
