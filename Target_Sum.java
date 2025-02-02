import java.util.*;

class Target_Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum");
        int target = sc.nextInt();

        for (int i = 0; i < size; i++)
        {
            for (int j = i+1; j < size; j++)
            {
                if (array[i] + array[j] == target)
                {
                    System.out.println("Index of the required elements");
                    System.out.println(i + " " + j);
                    System.out.println("Values of the required elements");
                    System.out.println(array[i] + " " + array[j]);
                    break;
                }
            }
        }
    }
}