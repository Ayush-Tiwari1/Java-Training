public class ForLoop
{
    public static void main(String[] args)
    {
        int[] arr = {13, 86, 9, 54, 21, 43};
        printArray(arr);
    }

    public static void printArray(int[] arr)
    {
        System.out.print("[ ");

        for(int i : arr)
            System.out.print(i + ", ");

        System.out.println("]");
    }
}