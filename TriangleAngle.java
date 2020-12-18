import java.util.Scanner;
public class TriangleAngle
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter First Angle");
        int a1 = in.nextInt();

        System.out.println("Enter Second Angle");
        int a2 = in.nextInt();

        System.out.println("Enter Third Angle");
        int a3 = in.nextInt();
        
        int angleSum = a1+a2+a3;
        if(angleSum == 180 && a1 >0 && a2 >0 && a3 >0){
            if(a1<90 && a2 <90 && a3<90){
                System.out.println("Acute-angled Triangle");
            }else
            if(a1 == 90 || a2 == 90 || a3 == 90){
                System.out.println("Right-angled Triangle");
            }else{
                System.out.println("Obtuse-angled Triangle");
            } 
        }
        else{
            System.out.println("Triangle not possible");
        }
    }
}