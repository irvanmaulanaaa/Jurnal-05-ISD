import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        MainQueue<String> queue = new MainQueue<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Program Manajemen Tugas :\n 1. Menambahkan Data \n 2. Menghapus Data \n 3. Lihat Data \n 4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan data: ");
                String data = scanner.next();
                queue.enqueue(data);
            } else if (menu == 2) {
                queue.dequeue();
            } else if (menu == 3) {
                queue.printQueue();
            } else if (menu == 4) {
                break;
            } else {
                System.out.println("Menu tidak tersedia");
            }
        }    
    }
}