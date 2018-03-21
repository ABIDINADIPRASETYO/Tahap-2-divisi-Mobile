package binatang2;
/*** @author Abidin*/
 class creature{
    int usia = 20;
    
    int getUsia(){
        return usia;
    }
}

class binatang2 extends creature{
//Overiding, adalah teknik dimana kita punya data atau methode dengan 
//nama yang sama di parrent dan child class maka akan terlebih dahulu menjalankan
//di classnya sendiri terlebih dahulu, jika tidak ada maka akan mencari di parentnya
//jika ingin mengakses data atau method parrentnya maka menggunakan
//key Super     
    
//pembuktian pada data/variable
    int usia = 21;
    
    public static void main(String[] args) {
       binatang2 b = new binatang2();
        System.out.println(b.usia);
    } 
}
