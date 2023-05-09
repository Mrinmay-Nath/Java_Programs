//wap in java to marge two array
public class merge {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = new int[array1.length + array2.length];
        
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            mergedArray[index] = array1[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[index] = array2[i];
            index++;
        }
        
        System.out.println("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
