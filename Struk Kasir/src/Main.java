import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga1, harga2, harga3,harga4, harga5, jumlah1, jumlah2, jumlah3,jumlah4,jumlah5,jumlahBarang;
        int uangPembeli,kembalian,hargaFinal, hargaFinal1, hargaFinal2, hargaFinal3,hargaFinal4,hargaFinal5,diskon;
        int diskonPersen, hargaKotor;
        String nama,nama1, nama2, nama3, nama4, nama5, namaKasir;

        System.out.println("========== PROGRAM STRUK FILKOM-MART ==========\n");
        System.out.print("Masukan Nama Kasir : ");
        namaKasir = input.nextLine();
        System.out.print("Masukan jumlah barang [1-5] = ");
        jumlahBarang = input.nextInt();

        if (jumlahBarang == 1){
            System.out.print("Masukan Nama Barang Pertama = ");
            nama = input.nextLine();
            System.out.print("\nMasukan Harga Barang Pertama = ");
            harga1 = input.nextInt();
            System.out.print("Masukan Jumlah Barang Pertama = ");
            jumlah1 = input.nextInt();
            hargaFinal1 = ( harga1 * jumlah1);

            System.out.print("Masukan Jumlah Uang Pembeli = ");
            uangPembeli = input.nextInt();
            
            hargaKotor = hargaFinal1;
        
            hargaFinal = hargaFinal1;

            if(hargaFinal > 50000 ){
                diskonPersen = 5;
                diskon = hargaFinal - (hargaFinal * 95/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 100000) {
                diskonPersen = 10;
                diskon = hargaFinal - (hargaFinal * 90/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 500000){
                diskonPersen = 20;
                diskon = hargaFinal - (hargaFinal * 80/100);
                hargaFinal -= diskon;
            } else {
                diskon = 0;
                diskonPersen = 0;
            }
            kembalian = uangPembeli - hargaFinal;

            System.out.println("\n\n\n\t     FILKOM-MART");
            System.out.println("\t  Jl.VETERAN MALANG");
            System.out.println("TELP. 0341-577911");
            System.out.println("28 September 2021\t07.38");
            System.err.println("Receipt Number\t:\t150901");
            System.out.println("Order ID\t:\tFM001");
            System.out.println("Collected by\t:\t" + namaKasir);
            System.out.println("===================================");
            System.out.println("Momogi");
            System.out.println(jumlah1 + "x" + "   @" + harga1 + "\t\tRp." + hargaKotor);
            System.out.println("===================================");
            System.out.println("Subtotal\t\tRp." + hargaFinal1);
            System.out.println("Diskon");
            System.out.println(diskonPersen + "%\t\t       -Rp." + diskon);
            System.out.println("===================================");
            System.out.println("Total\t\t\tRp." + hargaFinal);
            System.out.println("Bayar\t\t\tRp." + uangPembeli);
            System.out.println("===================================");
            System.out.println("Kembali\t\t       -Rp." + kembalian);
            System.out.println("===================================");
            System.out.println("   Terimakasih Telah Berbelanja Di");
            System.out.println("\t   FILKOM-MART\n\n\n");

            
        } else if ( jumlahBarang == 2){
            System.out.println("Masukan Nama Barang Pertama = ");
            nama1 = input.nextLine();
            System.out.print("Masukan Harga Barang Pertama = ");
            harga1 = input.nextInt();
            System.out.print("Masukan Jumlah Barang Pertama = ");
            jumlah1 = input.nextInt();
            hargaFinal1 = ( harga1 * jumlah1);

            System.out.println("Masukan Nama Barang Kedua = ");
            nama2 = input.nextLine();
            System.out.print("Masukan Harga Barang Kedua = ");
            harga2 = input.nextInt();
            System.out.print("Masukan Jumlah Barang Kedua = ");
            jumlah2 = input.nextInt();
            hargaFinal2 = ( harga2 * jumlah2);

            System.out.print("Masukan Jumlah Uang Pembeli = ");
            uangPembeli = input.nextInt();

            hargaKotor = hargaFinal1 + hargaFinal2;

            hargaFinal = hargaKotor;

            if(hargaFinal > 50000 ){
                diskonPersen = 5;
                diskon = hargaFinal - (hargaFinal * 95/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 100000) {
                diskonPersen = 10;
                diskon = hargaFinal - (hargaFinal * 90/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 500000){
                diskonPersen = 20;
                diskon = hargaFinal - (hargaFinal * 80/100);
                hargaFinal -= diskon;
            } else {
                diskon = 0;
                diskonPersen = 0;
            }
            kembalian = uangPembeli - hargaFinal;

            System.out.println("\n\n\n\t     FILKOM-MART");
            System.out.println("\t  Jl.VETERAN MALANG");
            System.out.println("TELP. 0341-577911");
            System.out.println("28 September 2021\t07.38");
            System.err.println("Receipt Number\t:\t150901");
            System.out.println("Order ID\t:\tFM001");
            System.out.println("Collected by\t:\t" + namaKasir);
            System.out.println("===================================");
            System.out.println("Momogi");
            System.out.println(jumlah1 + "x" + "   @" + harga1 + "\t\tRp." + hargaFinal1);
            System.out.println("Chocolatos");
            System.out.println(jumlah2 + "x" + "   @" + harga2 + "\t\tRp." + hargaFinal2);
            System.out.println("===================================");
            System.out.println("Subtotal\t\tRp." + hargaKotor);
            System.out.println("Diskon");
            System.out.println(diskonPersen + "%\t\t       -Rp." + diskon);
            System.out.println("===================================");
            System.out.println("Total\t\t\tRp." + hargaFinal);
            System.out.println("Bayar\t\t\tRp." + uangPembeli);
            System.out.println("===================================");
            System.out.println("Kembali\t\t       -Rp." + kembalian);
            System.out.println("===================================");
            System.out.println("   Terimakasih Telah Berbelanja Di");
            System.out.println("\t   FILKOM-MART\n\n\n");
        
        } else if ( jumlahBarang == 3){
            System.out.println("Masukan Nama Barang Pertama = ");
            nama1 = input.nextLine();
            System.out.print("Masukan Harga Barang Pertama = ");
            harga1 = input.nextInt();
            System.out.print("Masukan Jumlah Barang Pertama = ");
            jumlah1 = input.nextInt();
            hargaFinal1 = ( harga1 * jumlah1);

            System.out.println("Masukan Nama Barang Kedua = ");
            nama2 = input.nextLine();
            System.out.print("Masukan Harga Barang Kedua = ");
            harga2 = input.nextInt();
            System.out.print("Masukan Jumlah Barang Kedua = ");
            jumlah2 = input.nextInt();
            hargaFinal2 = ( harga2 * jumlah2);

            System.out.println("Masukan Nama Barang Ketiga = ");
            nama3 = input.nextLine();
            System.out.print("Masukan Harga Barang Ketiga = ");
            harga3 = input.nextInt();
            System.out.print("Masukan Jumlah Barang Ketiga = ");
            jumlah3 = input.nextInt();

            System.out.print("Masukan Jumlah Uang Pembeli = ");
            uangPembeli = input.nextInt();
            hargaFinal3 = ( harga3 * jumlah3);
            
            hargaFinal = (hargaFinal1 + hargaFinal2 + hargaFinal3);
            hargaKotor = hargaFinal;

            if(hargaFinal > 50000 ){
                diskonPersen = 5;
                diskon = hargaFinal - (hargaFinal * 95/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 100000) {
                diskonPersen = 10;
                diskon = hargaFinal - (hargaFinal * 90/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 500000){
                diskonPersen = 20;
                diskon = hargaFinal - (hargaFinal * 80/100);
                hargaFinal -= diskon;
            } else {
                diskon = 0;
                diskonPersen = 0;
            } 
            kembalian = uangPembeli - hargaFinal;

            System.out.println("\n\n\n\t     FILKOM-MART");
            System.out.println("\t  Jl.VETERAN MALANG");
            System.out.println("TELP. 0341-577911");
            System.out.println("28 September 2021\t07.38");
            System.err.println("Receipt Number\t:\t150901");
            System.out.println("Order ID\t:\tFM001");
            System.out.println("Collected by\t:\t" + namaKasir);
            System.out.println("===================================");
            System.out.println("Momogi");
            System.out.println(jumlah1 + "x" + "   @" + harga1 + "\t\tRp." + hargaFinal1);
            System.out.println("Chocolatos");
            System.out.println(jumlah2 + "x" + "   @" + harga2 + "\t\tRp." + hargaFinal2);
            System.out.println("Beng-Beng");
            System.out.println(jumlah3 + "x" + "   @" + harga3 + "\t\tRp." + hargaFinal3);
            System.out.println("===================================");
            System.out.println("Subtotal\t\tRp." + hargaKotor);
            System.out.println("Diskon");
            System.out.println(diskonPersen + "%\t\t       -Rp." + diskon);
            System.out.println("===================================");
            System.out.println("Total\t\t\tRp." + hargaFinal);
            System.out.println("Bayar\t\t\tRp." + uangPembeli);
            System.out.println("===================================");
            System.out.println("Kembali\t\t       -Rp." + kembalian);
            System.out.println("===================================");
            System.out.println("   Terimakasih Telah Berbelanja Di");
            System.out.println("\t   FILKOM-MART\n\n\n");

        } else if ( jumlahBarang == 4){
            System.out.println("Masukan nama barang pertama = ");
            nama1 = input.nextLine();
            System.out.print("Masukan harga barang pertama = ");
            harga1 = input.nextInt();
            System.out.print("Masukan jumlah barang pertama = ");
            jumlah1 = input.nextInt();
            hargaFinal1 = ( harga1 * jumlah1);

            System.out.println("Masukan nama barang kedua = ");
            nama2 = input.nextLine();
            System.out.print("Masukan harga barang kedua = ");
            harga2 = input.nextInt();
            System.out.print("Masukan jumlah barang kedua = ");
            jumlah2 = input.nextInt();
            hargaFinal2 = ( harga2 * jumlah2);

            System.out.println("Masukan nama barang ketiga = ");
            nama3 = input.nextLine();
            System.out.print("Masukan harga barang ketiga = ");
            harga3 = input.nextInt();
            System.out.print("Masukan jumlah barang ketiga = ");
            jumlah3 = input.nextInt();
            hargaFinal3 = ( harga3 * jumlah3);

            System.out.println("Masukan nama barang keempat = ");
            nama4 = input.nextLine();
            System.out.print("Masukan harga barang keempat = ");
            harga4 = input.nextInt();
            System.out.print("Masukan jumlah barang keempat = ");
            jumlah4 = input.nextInt();
            hargaFinal4 = ( harga4 * jumlah4);

            System.out.print("Masukan jumlah uang pembeli = ");
            uangPembeli = input.nextInt();

            hargaFinal = (hargaFinal1 + hargaFinal2 + hargaFinal3 + hargaFinal4);
            hargaKotor = hargaFinal;
            
            if(hargaFinal > 50000 ){
                diskonPersen = 5;
                diskon = hargaFinal - (hargaFinal * 95/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 100000) {
                diskonPersen = 10;
                diskon = hargaFinal - (hargaFinal * 90/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 500000){
                diskonPersen = 20;
                diskon = hargaFinal - (hargaFinal * 80/100);
                hargaFinal -= diskon;
            } else {
                diskon = 0;
                diskonPersen = 0;
            }
            kembalian = uangPembeli - hargaFinal;

            System.out.println("\n\n\n\t     FILKOM-MART");
            System.out.println("\t  Jl.VETERAN MALANG");
            System.out.println("TELP. 0341-577911");
            System.out.println("28 September 2021\t07.38");
            System.err.println("Receipt Number\t:\t150901");
            System.out.println("Order ID\t:\tFM001");
            System.out.println("Collected by\t:\t" + namaKasir);
            System.out.println("===================================");
            System.out.println("Momogi");
            System.out.println(jumlah1 + "x" + "   @" + harga1 + "\t\tRp." + hargaFinal1);
            System.out.println("Chocolatos");
            System.out.println(jumlah2 + "x" + "   @" + harga2 + "\t\tRp." + hargaFinal2);
            System.out.println("Beng-Beng");
            System.out.println(jumlah3 + "x" + "   @" + harga3 + "\t\tRp." + hargaFinal3);
            System.out.println("Makaroni");
            System.out.println(jumlah4 + "x" + "   @" + harga4 + "\t\tRp." + hargaFinal4);
            System.out.println("===================================");
            System.out.println("Subtotal\t\tRp." + hargaKotor);
            System.out.println("Diskon");
            System.out.println(diskonPersen + "%\t\t       -Rp." + diskon);
            System.out.println("===================================");
            System.out.println("Total\t\t\tRp." + hargaFinal);
            System.out.println("Bayar\t\t\tRp." + uangPembeli);
            System.out.println("===================================");
            System.out.println("Kembali\t\t       -Rp." + kembalian);
            System.out.println("===================================");
            System.out.println("   Terimakasih Telah Berbelanja Di");
            System.out.println("\t   FILKOM-MART\n\n\n");

        } else if ( jumlahBarang == 5) {
            System.out.println("Masukan nama barang pertama = ");
            nama1 = input.nextLine();
            System.out.print("Masukan harga barang pertama = ");
            harga1 = input.nextInt();
            System.out.print("Masukan jumlah barang pertama = ");
            jumlah1 = input.nextInt();
            hargaFinal1 = ( harga1 * jumlah1);

            System.out.println("Masukan nama barang kedua = ");
            nama2 = input.nextLine();
            System.out.print("Masukan harga barang kedua = ");
            harga2 = input.nextInt();
            System.out.print("Masukan jumlah barang kedua = ");
            jumlah2 = input.nextInt();
            hargaFinal2 = ( harga2 * jumlah2);

            System.out.println("Masukan nama barang ketiga = ");
            nama3 = input.nextLine();
            System.out.print("Masukan harga barang ketiga = ");
            harga3 = input.nextInt();
            System.out.print("Masukan jumlah barang ketiga = ");
            jumlah3 = input.nextInt();
            hargaFinal3 = ( harga3 * jumlah3);

            System.out.println("Masukan nama barang keempat = ");
            nama4 = input.nextLine();
            System.out.print("Masukan harga barang keempat = ");
            harga4 = input.nextInt();
            System.out.print("Masukan jumlah barang keempat = ");
            jumlah4 = input.nextInt();
            hargaFinal4 = ( harga4 * jumlah4);

            System.out.println("Masukan nama barang kelima = ");
            nama5 = input.nextLine();
            System.out.print("Masukan harga barang kelima = ");
            harga5 = input.nextInt();
            System.out.print("Masukan jumlah barang kelima = ");
            jumlah5 = input.nextInt();
            hargaFinal5 = ( harga5 * jumlah5);

            System.out.print("Masukan jumlah uang pembeli = ");
            uangPembeli = input.nextInt();
        
            hargaFinal = (hargaFinal1 + hargaFinal2 + hargaFinal3 + hargaFinal4 + hargaFinal5);
            hargaKotor = hargaFinal;
           
            if(hargaFinal > 50000 ){
                diskonPersen = 5;
                diskon = hargaFinal - (hargaFinal * 95/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 100000) {
                diskonPersen = 10;
                diskon = hargaFinal - (hargaFinal * 90/100);
                hargaFinal -= diskon;
            } else if ( hargaFinal > 500000){
                diskonPersen = 20;
                diskon = hargaFinal - (hargaFinal * 80/100);
                hargaFinal -= diskon;
            } else {
                diskon = 0;
                diskonPersen = 0;
            }
            kembalian = uangPembeli - hargaFinal;

            System.out.println("\n\n\n\t     FILKOM-MART");
            System.out.println("\t  Jl.VETERAN MALANG");
            System.out.println("TELP. 0341-577911");
            System.out.println("28 September 2021\t07.38");
            System.err.println("Receipt Number\t:\t150901");
            System.out.println("Order ID\t:\tFM001");
            System.out.println("Collected by\t:\t" + namaKasir);
            System.out.println("===================================");
            System.out.println("Momogi");
            System.out.println(jumlah1 + "x" + "   @" + harga1 + "\t\tRp." + hargaFinal1);
            System.out.println("Chocolatos");
            System.out.println(jumlah2 + "x" + "   @" + harga2 + "\t\tRp." + hargaFinal2);
            System.out.println("Beng-Beng");
            System.out.println(jumlah3 + "x" + "   @" + harga3 + "\t\tRp." + hargaFinal3);
            System.out.println("Makaroni");
            System.out.println(jumlah4 + "x" + "   @" + harga4 + "\t\tRp." + hargaFinal4);
            System.out.println("Fanta");
            System.out.println(jumlah5 + "x" + "   @" + harga5 + "\t\tRp." + hargaFinal5);
            System.out.println("===================================");
            System.out.println("Subtotal\t\tRp." + hargaKotor);
            System.out.println("Diskon");
            System.out.println(diskonPersen + "%\t\t       -Rp." + diskon);
            System.out.println("===================================");
            System.out.println("Total\t\t\tRp." + hargaFinal);
            System.out.println("Bayar\t\t\tRp." + uangPembeli);
            System.out.println("===================================");
            System.out.println("Kembali\t\t       -Rp." + kembalian);
            System.out.println("===================================");
            System.out.println("   Terimakasih Telah Berbelanja Di");
            System.out.println("\t   FILKOM-MART\n\n\n");

        } else {
            System.out.println("Input Anda Salah !!!");
            System.exit(0);
        }
        
    }
}
