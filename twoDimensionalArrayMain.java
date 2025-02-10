import java.util.*;
public class twoDimensionalArrayMain{
    public static void main(String[] args) {
        twoDimensionalArray tda = new twoDimensionalArray(3,3);
        tda.insert(0,0,10);
        tda.insert(0,1,20);
        tda.insert(1,0,30);
        tda.insert(2,0,40);
        tda.TraverseArray();
        tda.access(0,1);
        System.out.println(Arrays.deepToString(tda.arr));
    }

    
    
}