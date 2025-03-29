public class Selection_Sort
{
    public static void main(String[] args)
    {
        int[] arr = {15,4,11,0,6};

        System.out.println("Before Swapping");
        for(int num : arr)
        {
            System.out.print(num + " ");


        }
        System.out.println();
        selection_sort(arr);

        System.out.println();
        System.out.println("After Sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void selection_sort(int[] arr)
    {
        int maxIndex = -1;
        int temp = 0;

        for(int i = 0; i < arr.length-1; i++)
        {
            maxIndex = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if (arr[maxIndex] > arr[j]) {
                    maxIndex = j;
                }

            }

                temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;

                for(int num : arr)
                {
                    System.out.print(num + " ");
                }
            System.out.println();
        }

    }
}























