/* Simple number program pattern
 1  
 1  2
 1  2  3
 1  2  3  4  
 1  2  3  4  5 
 */
public class pattern2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" "+j+" ");
            }
            System.out.println(" ");
        }

    }

}
