package array;

public class MultiDimensionalArray {
    public static void main(String[] args){
        int marks[][] = {
            {67, 76, 87, 89, 98},
            {76, 77, 56, 65, 90},
            {67, 79,92,63,55}
        };

        for (int i = 0; i < 3; i++) { // row
            for(int j = 0; j < 5; j++){ //column
                System.out.println(marks[i][j]);
            }
            System.out.println();
        }
    }
}
