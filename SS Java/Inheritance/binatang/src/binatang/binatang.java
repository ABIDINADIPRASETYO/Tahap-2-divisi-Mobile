package binatang;
/**@author Abidin*/
//Konsep Inheritance, konsep pewarisan suatu kelas pada kelas baru 
//sehingga  kelas baru tersebut dapat mengakses metode2 dan data dari
//kelas utamanya
class creature{
    int usia;
    String warna; 
}
//class binatang tidak mempunyai data usia dan warna, 
//data usia dan warna adalah milik class parent nya yaitu class creature
class binatang extends creature{
    public static void main(String[] args) {
        binatang b = new binatang();
        b.usia = 20;
        b.warna = "merah";
        System.out.println(b.usia);
        System.out.println(b.warna);
    }    
}
