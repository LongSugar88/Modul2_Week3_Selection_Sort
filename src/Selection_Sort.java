public class Selection_Sort<T extends Comparable> {
    int count = 1;

    T[] sort(T[] myArray){
       for(int i=0; i< myArray.length; i++){
           T max = myArray[i];
           int positon = i;
           for(int j=i+1; j<myArray.length; j++){
               if(myArray[j].compareTo(max) > 0){
                   max = myArray[j];
                   positon = j;
               }
           }
           T token = myArray[i];
           myArray[i] = max;
           myArray[positon] = token;
           print(myArray);
       }
       return myArray;
    }
    void print(T[] myArray){
        System.out.println("Lần " + count);
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        count++;

    }
}
