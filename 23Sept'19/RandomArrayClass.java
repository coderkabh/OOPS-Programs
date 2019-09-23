import java.util.Random;
import java.util.Scanner;

public class RandomArrayClass {
    public static void main(String[] args) {
        Random r = new Random();
        int size=r.nextInt(5000);
        System.out.println(size);
        Scanner sc = new Scanner(System.in);
        boolean flag;


        do {
            flag= false;
            try {
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++){
                    arr[i] = r.nextInt(5000);
                }

                System.out.println("Enter index");
                int index=sc.nextInt();
                System.out.println(arr[index]);

            }
            catch (NegativeArraySizeException e) {
                size *= -1;
                //or size=Math.abs(size);
                flag=true;
            }

            catch (IndexOutOfBoundsException i){
                System.out.println("Index value out of bound");
                flag=true;

            }
        }while (flag);

    }
}
