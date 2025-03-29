public class Bubble_Sort
{
    public static void main(String[] args) {
        int[] arr = {15,4,11,0,5,29,7,48,6};

        System.out.println("Before Swapping");
        for(int num : arr)
        {
            System.out.print(num + " ");


        }
        System.out.println();
        bubble_sort(arr);

    }


    public static void bubble_sort(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After Swapping");
        for (int num : arr) {
            System.out.print(num + " ");

        }


    }

}






















