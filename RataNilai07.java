import java.util.Scanner;

public class RataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, totalNilai, nilaiMhs, rataNilai;

        while (i <= 5) {
            totalNilai = 0;
            System.out.println("input nilai mahasiswa ke " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("Nilai ke-" + j + "=");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai=totalNilai/5; 
            System.out.println("Rata rata nilai mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
    }
}
