import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RekeningBank rekening1 = new RekeningBank();
        rekening1.nomorRekening = "202410370110306";
        rekening1.namaPemilik = "Achmad Althof Avisena";
        rekening1.saldo = 500000.0;

        RekeningBank rekening2 = new RekeningBank();
        rekening2.nomorRekening = "303420370220306";
        rekening2.namaPemilik = "Najwa Rachma Syafira";
        rekening2.saldo = 1000000.0;

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        System.out.println("Masukkan junmlah setor tunai untuk Achmad Althof Avisena: ");
        double setorAchmad = scanner.nextDouble();
        rekening1.setorUang(setorAchmad);

        System.out.println("Masukkan junmlah setor tunai untuk Najwa Rachma Syafira: ");
        double setorNajwa = scanner.nextDouble();
       rekening2.setorUang(setorNajwa);

        System.out.println("Masukkan jumlah tarik tunai untunk Achmad Althof Avisena: ");
        double tarikAchmad = scanner.nextDouble();
        rekening1.tarikSaldo(tarikAchmad);

        System.out.println("Masukkan jumlah tarik tunai untunk Najwa Racham Syafira: ");
        double tarikNajwa = scanner.nextDouble();
       rekening2.tarikSaldo(tarikNajwa);

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        scanner.close();
    }
}