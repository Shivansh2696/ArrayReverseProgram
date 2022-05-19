import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //Taking Array Size to User
        System.out.print("Enter the Size = ");
        int num = scanner.nextInt();

        //Taking Values of Array by User
        int[] list =  new int[num];
        System.out.print("Enter The Values = ");
        for (int i = 0; i < num; i++) {
            list[i] = scanner.nextInt();
        }

        //Showing the Entered Data via User
        System.out.print("Your Entered Values = ");
        for(int i=0; i<num; i++){
            System.out.print(list[i] + ",");
        }

        //Reversing Array And Taking Result in result
        int[] result = new int[num];
        result = reverseArray(list,num);

        //Printing Reversed Array
        System.out.println();
        System.out.print("Reversed Array = ");
        for (int i=0; i<num; i++){
            System.out.print(result[i] + ",");
        }
    }

    private static int[] reverseArray(int[] list, int num) {
        int x = -1;
        int[] newList = new int[num];

        for(int i=0; i< num/2; i++){
            newList = swap(list, i, num + (x * i) + x);
        }
        return newList;
    }

    static int[] swap(int[] list, int i, int j)
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
    }
}
