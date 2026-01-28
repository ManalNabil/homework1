package assignment_1;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        // Question 3: Write a program in Java to remove a specific element from an array
        int[] arr = {1, 2, 3, 4, 5};
        int elementToRemove = 3;
        
        // إنشاء مصفوفة جديدة بحجم أقل بواحد
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                newArr[index++] = arr[i];
            }
        }
        
        System.out.println("Array after removal: " + Arrays.toString(newArr));
    }
}