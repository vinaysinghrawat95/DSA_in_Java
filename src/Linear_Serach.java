import java.util.Scanner;
public class Linear_Serach
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = {7, 8, 12, 14, 20, 44,};

        System.out.print("Enter number for Find : ");
        int target = sc.nextInt();

        int index_value = linearSearch(arr,target);
        if(index_value !=
                0)
        {
            System.out.println(target + " value in" + index_value + " Index");
        }
        else
        {
            System.out.println(target + " value not found in this Array");
        }
        sc.close();

    }

    public static int linearSearch(int[] arr, int target)
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
