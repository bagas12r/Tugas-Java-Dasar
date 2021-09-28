import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float harga, jumlah, hargaFinal;
        
        System.out.print("Masukan harga barang persatuan = ");
        harga = input.nextInt();
        System.out.print("Masukan jumlah barang = ");
        jumlah = input.nextInt();

        hargaFinal = ( harga * jumlah);

        if(hargaFinal > 50000 ){
            hargaFinal = hargaFinal * 95/100;
            System.out.println("Anda mendapatkan diskon sebesar 5%, harga yang dibayarkan = " + hargaFinal);
        } else if ( hargaFinal > 100000) {
            hargaFinal = hargaFinal * 90/100;
            System.out.println("Anda mendapatkan diskon sebesar 10%, harga yang dibayarkan = " + hargaFinal);
        } else if ( hargaFinal > 500000){
            hargaFinal = hargaFinal * 80/100;
            System.out.println("Anda mendapatkan diskon sebesar 20%, harga yang dibayarkan = " + hargaFinal);
        }
    }
}
