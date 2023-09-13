import java.util.Scanner;

public class Arays {
    public static void main(String[] args) {
//        int[] marks = new int[3];
//        marks[0] = 90;
//        marks[1] = 92;
//        marks[2] = 85;

//        int marks[] = {90, 92, 85};
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(marks[i]);
//        }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
