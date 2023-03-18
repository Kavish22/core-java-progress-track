package loops;

public class for_loop {
    public static void main(String[] args) {
        
    
    
    // reversing an array using for loop

    int arr[] = {1,2,3,4,5,6};

    printarray(arr);
    reversarray(arr, 0, arr.length - 1);
    System.out.println("reversed array is");
    printarray(arr);
    }

    static void reversarray(int arr[], int start, int end){
         int n = arr.length;

        for(int i =0; i < n ; i++){

            if(start < end){

                int temp = arr[start];

                arr[start] = arr[end];

                arr[end] = temp;

                start++;
                end--;
            }
        }
      
    }
    static void printarray(int arr[]){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.println(" ");
        }
    }
}
