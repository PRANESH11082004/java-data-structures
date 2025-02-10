public class twoDimensionalArray{
    int [][] arr=null;

    //constructor
    public twoDimensionalArray(int numberOfrows,int numberOfcolumns){

        this.arr = new int[numberOfrows][numberOfcolumns];
        for(int row=0;row<arr.length;row++){
                for(int column=0;column<arr.length;column++){
                    arr[row][column]=Integer.MIN_VALUE;
                }
            }
        }



    public void insert(int row,int column, int value)
    {
        try{
            if(arr[row][column]==Integer.MIN_VALUE){
                arr[row][column]=value;
                System.out.println("Sucessfully Inserted");
            }
            else{
                System.out.println("this cell is already occupied");
            }

        }
        catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("invalid index to access 2D Array element!");
        }
        //time complexity:o(1)
        //space complexity:o(1)
    
    }    

    public void access(int row ,int column){
        System.out.println("row:"+row+",column:"+column);
        try{
            System.out.println("cell value is:"+ arr[row][column]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index for 2D array");
        }
    }    
    //time complexity:o(1)
    //space complexity:o(1)

    public void TraverseArray(){

        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr.length;column++){
                System.out.println(arr[row][column]+" ");
            }
            System.out.println(); 
        }
    }
    //time complexity:o(mn)
    //space complexity:o(1)
}