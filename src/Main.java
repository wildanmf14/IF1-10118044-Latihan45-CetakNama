import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Printer printer= new Printer();
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda: ");
        printer.setNama(masuk.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJumlahCetak(masuk.nextInt());
        printer.cetak(printer.getNama());
        System.out.println("\nHasil Cetak :");
        printer.cetak(printer.getJumlahCetak(), printer.getNama());
    }

	

}
