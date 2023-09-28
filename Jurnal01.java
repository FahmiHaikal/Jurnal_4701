import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String NAMA;
        String NIM;
        String KELAS;

        System.out.println("INPUT NAMA = ");
        NAMA = input.nextLine();
        System.out.println("INPUT NIM = ");
        NIM = input.nextLine();
        System.out.println("INPUT KELAS = ");
        KELAS = input.nextLine();

        System.out.println("--------------");
        
        System.out.println("NAMA SAYA = " + NAMA);

        System.out.println("NIM SAYA = " + NIM);
        
        System.out.println("KELAS SAYA = " + KELAS);

    }
}

// Done