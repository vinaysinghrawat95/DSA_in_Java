//public class Recursion
//{
//    public static void main(string[] args)
//    {
//        int result = sum(5);
//        system.out.println(result);
//
//    }
//
//    static int sum(int num)
//    {
//        is(num > 1)
//        {
//            return num*sum(num-1);
//        }
//        else
//        {
//            return 1;
//
//        }
//    }
//}




public class Recursion
{
    public static void main(String[] args) {
        factorial(5,1,1);
    }

    private static void factorial(int i, int base, int fact)
    {
        if(i == base)
        {
            fact *= i;
            System.out.println(fact);
            return;
        }
        fact *= i;
        factorial(i-1,base,fact);

    }

}























