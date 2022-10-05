import java.util.Arrays;
public class Pancake
{
    // Reverses arr[0 ... j]
    public void flipArr(int[] arr, int j)
    {
        int temp, begin = 0;
        while (begin < j)
        {
            temp = arr[begin];
            arr[begin] = arr[j];
            arr[j] = temp;
            begin = begin + 1;
            j = j - 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    // Returning the index of the
// element, which is maximum in
// arr[0 ... s - 1]
    public int findMax(int[] arr, int s)
    {
        int idx, j;
        for (idx = 0, j = 0; j < s; ++j)
        {
            if (arr[j] > arr[idx])
            {
                idx = j;
            }
        }
        return idx;
    }
    // The main method that sorts the given array
// using the flip operations
    public int pancake(int[] arr, int s)
    {
// Starting from the complete
// array and one by one
// reducing the current size by 1
        for (int currSize = s; currSize > 1; --currSize)
        {
// Find index of the
// maximum element in
// arr[0..curr_size-1]
            int idx = findMax(arr, currSize);
// Moving the maximum element
// to the end of the current array
// if it is not already at te end
            if (idx != currSize - 1)
            {
// To move at the end,
// first we have to move the maximum
// element to the beginning
                flipArr(arr, idx);
// Now, we are moving the maximum number to end by
// reversing the current array
                flipArr(arr, currSize - 1);
            }
        }
        return 0;
    }
    // a utility method to display the array arr[]
    public void displayArray(int[] arr, int s)
    {
        for (int j = 0; j < s; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }
    // main method
    public static void main (String[] args)
    {
        int[] arr = {23, 100, 210, 101, 112, 66, 27, 67, 809};
        int s = arr.length;

// creating an object of the class PancakeSortingExample
        Pancake obj = new Pancake();
        System.out.println("Input Array is: ");
        obj.displayArray(arr, s);
        obj.pancake(arr, s);
        System.out.println(" \nAfter sorting the array is: ");
        obj.displayArray(arr, s);
    }
}