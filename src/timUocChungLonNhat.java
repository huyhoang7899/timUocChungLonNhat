import java.util.Scanner;

public class timUocChungLonNhat {
    public static void main(String[] args) {
        int a, b ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        a = scanner.nextInt();
        System.out.println("Enter b : ");
        b = scanner.nextInt();
        Math.abs(a);
        Math.abs(b);

        if ( a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }
        while ( a != b){
            if ( a > b ){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
