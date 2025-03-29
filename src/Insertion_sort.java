//public class Insertion_sort
//{
//    public static void main(String[] args)
//    {
//      int[] arr = {5,1,6,4,8,0};
//
//      insertion_sort(arr);
//
//    }
//
//    public static void insertion_sort(int[] arr)
//    {
//        for(int i = 1; i < arr.length; i++)
//        {
//            int key = arr[i];
//            int j = i-1;
//
//            while(j >= 0 && arr[j] > key)
//            {
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = key;
//        }
//
//        for(int num : arr)
//        {
//            System.out.print(num + " ");
//        }
//    }
//}


public class Insertion_sort
{
    public static void main(String[] args)
    {
        int[] arr = {5,2,1,7,2,8};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }

        for(int num  : arr)
        {
            System.out.print(num + " ");
        }

    }
}








































