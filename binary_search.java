import java.util.Scanner;

public class binary_search {

    static int[] array = new int[10];
    static int n;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        n = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Element " + (i+1) +" : ");
            array[i] = scan.nextInt();
        }

        sortArray();

        System.out.println("Enter the number to be found : ");
        int key = scan.nextInt();

        int position = binarySearch(key);

        if (position == -1)
        {
            System.out.println("There is not match in the array");
        }
        else
        {
            System.out.println("The index at whick the key is : " + position);
        }
        
    }

    public static int binarySearch(int key)
    {
        int position, high, low;

        high = n;
        low = 0;

        int mid = high + ((high - low)/2);

        while (low < high)
        {
            if (key > array[mid])
            {
                low = mid + 1;
            }
            else if (key == array[mid])
            {
                position = mid +1;
            }
            else
            {
                high = mid - 1;
            }
        }

         return position;
    }


    private static void sortArray() {

        
    }
}
