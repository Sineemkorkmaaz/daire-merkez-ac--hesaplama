import java.util.Scanner;

public class dairemerkezacı {
    public static void main(String[] args) {
        // Değerler 
        int r ;
        double pi = 3.14 , a, mao ;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Dairenizin r değerini giriniz:");
        r =input.nextInt();
        
        System.out.print("Dairenizin a değerini giriniz :");
        a =input.nextDouble();

        mao = (pi*(r*r)*a)/360 ;
        System.out.println("Dairenizin dilim alanı : "+mao);
    }
}
