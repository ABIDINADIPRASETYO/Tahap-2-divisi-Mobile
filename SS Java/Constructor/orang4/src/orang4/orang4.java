package orang4;

/*** @author Abidin*/
public class orang4 {

    int umur;
    String warna;
//Constructor adalah method yang pertama kali dijalankan ketika objek dibuat
    //nama konstruktor harus sama dengan nama kelas

    public orang4(int umur, String warna) {
        this.umur = umur;
        this.warna = warna;
    }

    public static void main(String[] args) {
        orang4 abidin = new orang4(20, "putih");
        orang4 adi = new orang4(21, "hitam");

        System.out.println(abidin.umur +" "+abidin.warna);
        System.out.println(adi.umur +" "+adi.warna);

    }

}
