import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nama = new ArrayList<>();

        while (true) {

            int i = nama.size();
            System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
            String namaInput = scanner.nextLine();

            try {
                if (namaInput.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }

                if (!namaInput.equalsIgnoreCase("selesai")) {
                    nama.add(namaInput);
                } else {
                    break;
                }
            } catch (IllegalArgumentException error) {

                System.err.println("Error: " + error.getMessage());
            }
        }

        System.out.println("\nDaftar Nama Mahasiswa:");
        for (String mahasiswa : nama) {
            System.out.println("- " + mahasiswa);
        }
    }
}
