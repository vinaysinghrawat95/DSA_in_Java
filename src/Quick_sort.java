public class Quick_sort
{
    public static void main(String[] args)
    {
        int[] arr = {15,6,0,4,1,2};
        quickSort(arr,0, arr.length-1);
        for(int num : arr)
        {
            System.out.print(num + " ");
        }

    }

    public static void quickSort(int[] arr,int low, int high)
    {

        if(low < high)
        {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }

    }

    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int iniIndex = low-1;


        for(int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                iniIndex++;
                int temp = arr[iniIndex];
                arr[iniIndex] = arr[j];
                arr[j] = temp;


            }
        }
        iniIndex++;
        int temp = arr[iniIndex];
        arr[iniIndex] = arr[high];
        arr[high] = temp;

        System.out.println("ini" + iniIndex);

        return iniIndex;
    }


}


