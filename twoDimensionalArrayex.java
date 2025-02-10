import java.util.*;
public class twoDimensionalArrayex{
    public static void main(String[] args) {
        int [][] intArray;
        intArray = new int[2][2];

        intArray[0][0] = 1;
        intArray[0][1] = 2;
        intArray[1][0] = 3;
        intArray[1][1] = 4;

        System.out.println(Arrays.deepToString(intArray));
        //convert MultiDimensionalArray to String we use Arrays.deepToString(intArray)


        String [][] StringArray={{"hi","hello","bay"},{"good Morning","good night","hi","hello","bay"}};
        System.out.println(Arrays.deepToString(StringArray));

       //time complexity:o(mn)

    }
}