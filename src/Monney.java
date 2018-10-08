import java.util.Scanner;

public class Monney {
    public static void main(String[] args) {
        double monney=0;
        int month=1;
        double interset_rate=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter investment amount :");
        monney=sc.nextDouble();
        System.out.println("Enter number of montha:");
        month=sc.nextInt();
        System.out.println("Enter annual interest rate in persentage:");
        interset_rate=sc.nextDouble();
        double total_interset=0;
        for(int i=0;i<month;i++) {
            total_interset=monney+ (interset_rate/100/12)*3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
