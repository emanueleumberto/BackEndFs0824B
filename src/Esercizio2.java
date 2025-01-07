import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrStr = new String[3];
        System.out.print("Inserisci una prima stringa: ");
        // String str1 = sc.nextLine();
        arrStr[0] = sc.nextLine();
        System.out.print("Inserisci una seconda stringa: ");
        //String str2 = sc.nextLine();
        arrStr[1] = sc.nextLine();
        System.out.print("Inserisci una terza stringa: ");
        //String str3 = sc.nextLine();
        arrStr[2] = sc.nextLine();

        for(int i=0; i< arrStr.length; i++) {
            System.out.print(arrStr[i]);
        }
        //System.out.println(str1 + str2 + str3);
        System.out.println();
        System.out.println("Ordine Inverso");
        for(int i=arrStr.length-1; i>= 0; i--) {
            System.out.print(arrStr[i]);
        }
        //System.out.println(str3 + str2 + str1);
    }
}
