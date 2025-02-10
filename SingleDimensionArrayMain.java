   class SingleDimensionArrayMain{
       public static void main(String[] args) {

        SingleDimensionArray sda = new SingleDimensionArray(10);

        sda.insert(0,50);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(1,30);
        sda.insert(12,120);

        // accessing a element
        var store1 = sda.arr[0];
        System.out.println("first element:"+store1);
        var store2 = sda.arr[1];
        System.out.println("Second element:"+store2);

        // Transveral is means visitting all element of a array eg) 1.printing for all element in a array 2.update all elements in a array 3.search a element    

        System.out.println("Array Traversal");
        sda.TraverseArray();

        //search a element

        sda.searchArray(10);
        sda.searchArray(100);

        // delete an element
        sda.deleteArray(0);
        System.out.println(sda.arr[0]);

    }
}
    