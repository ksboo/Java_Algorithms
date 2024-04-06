class linear_search 
{
    public static void main (String [] args)
    {
        // here we can take the array as an input from the user
        int[] array = {1, 2, 3, 4, 5};

        // here we can take the key as an input from the user
        int key = 5;
        int counter = 0; // 
        // here we can take n = 6 as an input from the user
        for(int i = 0; i < 5; i ++)
        {
            if (key == array[i])
            {
                System.out.println("The element was fount at the " + (i+1) + " position");
                counter++;
            }
        }
        if ( counter == 0)
        {
            System.out.println("Element does not exist in the array.");
        }
    }
}