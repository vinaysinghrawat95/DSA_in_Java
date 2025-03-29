import java.util.Scanner;
public class Binary_Search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7, 8, 12, 14, 20, 44, 50, 72, 80, 155};

        System.out.print("Enter number for Find : ");
        int target = sc.nextInt();

        int index_value = binarySearch(arr,target);
        if(index_value != 0)
        {
            System.out.println(target + " value in " + index_value + " Index");
        }
        else
        {
            System.out.println(target + " value not found in this Array");
        }
        sc.close();


    }

    public static int binarySearch(int[] arr, int target)
    {
       int starting_point = 0;
       int ending_point = arr.length - 1;
       int mid;
       while(starting_point <= ending_point)
       {
           mid = (starting_point + ending_point) / 2;

           if(arr[mid] == target)
           {
               return mid;
           }
           else if (arr[mid] < target)
           {
               starting_point = mid + 1;
           }
           else
           {
               ending_point = mid - 1;
           }

       }
       return -1;
    }
}
