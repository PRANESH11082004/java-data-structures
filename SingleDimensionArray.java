public class SingleDimensionArray {
    int arr[]=null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
            }
        }

        //insert element in a array
    public void insert(int location,int valueToBeInserted)
    {
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=valueToBeInserted;
                System.out.println("Sucessfully Inserted");
            }
            else{
                System.out.println("this cell is already occupied");
            }

        }
        catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("invalid index to access element!");
        }
        
    }

    //Array Traversal
    public void TraverseArray(){
        try{
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i] + " ");
                }
        }
        catch(Exception e ){
            System.out.println("Array no longer exists!");
        }
    }
    //time complexity:o(n)
    //space complexity:o(1)


    public void searchArray(int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println("searched Array element is :"+arr[i]);
                System.out.println("index of Array element is :"+i);
                return;
            }
           
        }
        System.out.println("element of Array is not found");
    }

    //time complexity:o(n) because of for loop
    //space complexity:o(1)


    //delete an Array
    // 2^-31 is a min value also called deleted
    
    public void deleteArray(int valueIndex){
        try{
            arr[valueIndex]=Integer.MIN_VALUE;
            System.out.println("element of Array is deleted sucessfully");
        }
    
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("element of Array is not found for deleteoperation");
        }
    
    }
    //time complexity:o(1)
    //space complexity:o(1)
    
}
