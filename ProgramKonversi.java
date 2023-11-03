package AOK;
import java.util.Scanner;
public class ProgramKonversi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Hexa");
        System.out.println("4. Hexa ke Biner");
        System.out.println("5. Desimal ke Hexa");
        System.out.println("6. Hexa ke Desimal");

        System.out.print("Masukkan pilihan: ");
        int pilihan = inp.nextInt();

        switch (pilihan){
            case 1:
                int bilBiner;
                int a=1;
                int desimal=0;
                int digit;

                System.out.print("Angka biner: ");
                bilBiner = inp.nextInt();

                while(bilBiner!=0) {
                    digit = bilBiner % 10;
                    desimal += (digit*a);
                    a *= 2;
                    bilBiner /= 10;
                }
                System.out.println("Desimalnya adalah: "+ desimal);
                break;

            case 2:
                int[] angka = new int[32];
                int n;
                int i;

                System.out.print("Angka desimal: ");
                n = inp.nextInt();

                for(i=0; n>0; i++){
                    angka[i] = n%2;
                    n /= 2;
                }

                System.out.print("Angka binernya: ");

                for(i=i-1 ;i>=0 ;i--) {
                    System.out.print(angka[i]);
                }
                System.out.println();
                break;

            case 3:
                int angkaBiner, hexDigit=0, m=1, c=1, rem, x=0;
                char[] angkaHexa = new char[20];

                System.out.print("Masukkan angka biner: ");
                angkaBiner = inp.nextInt();

                while(angkaBiner!=0) {
                    rem = angkaBiner%10;
                    hexDigit = hexDigit + (rem*m);
                    if(c%4==0){
                        if(hexDigit<10)
                            angkaHexa[x] = (char)(hexDigit+48);
                        else
                            angkaHexa[x] = (char)(hexDigit+55);
                        m = 1;
                        c = 1;
                        hexDigit = 0;
                        x++;
                    }
                    else {
                        m *= 2;
                        c++;
                    }
                    angkaBiner = angkaBiner/10;
                }

                if(c!=1)
                    angkaHexa[x] = (char)(hexDigit+48);
                if(c==1)
                    x--;

                System.out.print("Hexadesimalnya: ");
                for(i=1; i>=0; i--)
                    System.out.print(angkaHexa[i]);
                break;

            case 4:
                System.out.print("Masukkan angka Hexa: ");
                String hexadesimal = inp.next();

                int decimal = Integer.parseInt(hexadesimal, 16);
                String binari = Integer.toBinaryString(decimal);
                System.out.printf("Angka biner dari %s adalah %s %n", hexadesimal, binari );
                break;

            case 5:
                System.out.print("Angka desimal: ");
                int desimal1 = inp.nextInt();
                String hex = "";

                while (desimal1 != 0){
                    int hexValue = desimal1 % 16;

                    char hexaDigit = (hexValue <= 9 && hexValue >= 0) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
                    hex = hexaDigit + hex;
                    desimal1 /= 16;
                }
                System.out.println("Hexadesimal = " + hex);
                break;

            case 6:
                System.out.print("Masukkan angka Hexa: ");
                String hexadesimal1 = inp.next();

                int decimal2= Integer.parseInt(hexadesimal1, 16);
                System.out.println("Converted Decimal number is : " + decimal2);
                break;
        }
    }
}
