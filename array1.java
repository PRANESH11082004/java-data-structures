import java.util.*;
public class array1{
    public static void main(String[] args) {
  
    
        int[] intarray;
        intarray =new int[3];
        intarray[0]=1;
        intarray[1]=2;
        intarray[2]=3;
        System.out.println("array element are:"+Arrays.toString(intarray));

        // another way of declaring all in in one step
        int[] arrays1={1,2,3};
        System.out.println("array element are:"+Arrays.toString(arrays1));
        String[] arrays2={"hi","hello","all"};
        System.out.println("array element are:"+Arrays.toString(arrays2));

        //time complexity of this program is o(1)
    }
}