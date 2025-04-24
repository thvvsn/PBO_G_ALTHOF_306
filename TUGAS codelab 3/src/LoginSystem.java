import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Admin admin1 = new Admin("Admin306", "Password306");
        Mahasiswa mahasiswa1 = new Mahasiswa("Achmad Althof", "202410370110306");

        Scanner masuk = new Scanner(System.in);

        while (true) {
            System.out.print("Pilih Login:\n1. Admin\n2. Mahasiswa\n");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = masuk.nextInt();
            masuk.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan username: ");
                String userAdmin = masuk.nextLine();
                System.out.print("Masukkan password: ");
                String passwordAdmin = masuk.nextLine();

                if (userAdmin.equals(admin1.getNama()) && passwordAdmin.equals(admin1.getNim())) {
                    admin1.login(userAdmin, passwordAdmin);
                    break;
                } else {
                    System.out.println("Login gagal! Coba lagi.\n");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan nama: ");
                String namaMaha = masuk.nextLine();
                System.out.print("Masukkan NIM: ");
                String nimMaha = masuk.nextLine();

                if (namaMaha.equals(mahasiswa1.getNama()) && nimMaha.equals(mahasiswa1.getNim())) {
                    mahasiswa1.login(namaMaha, nimMaha);
                    break;
                } else {
                    System.out.println("Login gagal! Coba lagi.\n");
                }

            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih 1 atau 2.\n");
            }
        }

        masuk.close();
    }
}
