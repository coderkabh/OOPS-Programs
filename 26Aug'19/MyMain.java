import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain obj = new MyMain(); // Constructor calling
        Scanner sc = new Scanner(System.in); // Constructor calling
        MyCalculator obj2 = new MyCalculator();
        int option = 0;
        int input1,input2,result=0;

        do {
            option =  obj.displayMenu(sc);
            switch (option){
                case 1:
                    input1 = obj.getInput(sc);
                    input2 = obj.getInput(sc);
                    result = obj2.add(input1, input2);
                    System.out.println(result);
                    break;

                case 2:
                    input1 = obj.getInput(sc);
                    input2 = obj.getInput(sc);
                    result = obj2.sub(input1, input2);
                    System.out.println(result);
                    break;

                case 3:
                    input1=obj.getInput(sc);
                    input2=obj.getInput(sc);
                    result= obj2.mul(input1,input2);
                    System.out.println(result);
                    break;
                case 4:
                    input1=obj.getInput(sc);
                    input2=obj.getInput(sc);
                    double result2= obj2.div(input1,input2);
                    System.out.println(result2);
                    break;
                case 0:
                    System.out.println("Ok Byee!");
                    break;
                default:
                    System.out.println("Choose a valid option");
            }
        }
        while (option != 0);


    }

    int getInput(Scanner sc) {
        int response = 0;
        System.out.println("Enter an integer");
        response= sc.nextInt();


        return response;
    }

    int displayMenu(Scanner sc) {
        int response = 0;
        System.out.println("Choose from following options:-");
        System.out.println("Press 1 for Addition \n Press 2 for Subtraction \n Press 3 for Multiplication \n Press 4 for Division \n Press 0 for exit");
        response = sc.nextInt();


        return response;
    }
}
