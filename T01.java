// 12S24032 - Angga B. P. Sianipar
//Latihan
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, format;
        int tahun, stok;
        double rating, margin, harga;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahun = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        format = input.nextLine();
        harga = Double.parseDouble(input.nextLine());
        margin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating);
    }
}
