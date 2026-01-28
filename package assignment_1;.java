package assignment_1;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        // Question 1: Write a program to clone an array
        int[] originalArray = {10, 20, 30, 40, 50};
        
        // استخدام ميزة clone المدمجة في جافا
        int[] clonedArray = originalArray.clone();
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Cloned Array: " + Arrays.toString(clonedArray));
    }
}