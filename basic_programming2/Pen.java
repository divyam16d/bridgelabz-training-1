import java.util.*;
public class Pen {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int students = sc.nextInt();

        int pensEach = pens/students; 
        int remaining = pens%students; 

        System.out.println("Each student gets: " +pensEach);
        System.out.println("Remaining pens: " +remaining);
    }
}
