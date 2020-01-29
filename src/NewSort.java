import java.util.Arrays;
import java.util.Scanner; 
  
public class NewSort 
{ 
   
    static void insertionSortRecursive(int arr[], int n) 
    { 
        
        if (n <= 1) 
            return; 
       
        insertionSortRecursive( arr, n-1 ); 

        int last = arr[n-1]; 
        int j = n-2; 
        
        while (j >= 0 && arr[j] > last) 
        { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; 
    } 
      
    public static void main(String[] args) 
    { 
    	Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int s = sc.nextInt();
		int i = 0 ;
		
		int arr[] = new int[s];
		while(i< s)
		{
			System.out.println("Enter element "+i);
			arr[i] = sc.nextInt();
			i ++;
		} 
       
        insertionSortRecursive(arr, arr.length); 
          
        System.out.println(Arrays.toString(arr)); 
    } 
}