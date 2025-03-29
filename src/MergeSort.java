public class MergeSort
{
    private static void mergeSort(int[] arr, int l, int r)
    {
        if(l < r)
        {
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l,int mid, int r)
    {
        int leftSize = mid-l+1;
        int rightSize = r-mid;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for(int x = 0; x < leftSize; x++)
        {
           leftArr[x] = arr[l+x];
        }
        for(int x = 0; x < rightSize; x++)
        {

            rightArr[x] = arr[mid+1+x];
        }

        int i = 0; int j = 0; int k = l;

        while(i < leftSize && j < rightSize)
        {
            if(leftArr[i] < rightArr[j])
            {
               arr[k] = leftArr[i];
               i++;
            }
            else
            {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < leftSize)
        {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightSize)
        {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {558,4144,94125,84,0,782654};
        mergeSort(arr, 0,arr.length-1);

        for(int num : arr)
        {
            System.out.print(num + " ");
        }

    }
}



