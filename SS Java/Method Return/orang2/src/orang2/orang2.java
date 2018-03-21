package orang2;
/*** @author Abidin*/
public class orang2 {

    int umur = 20;
    public static void main(String[] args) {
           orang2 abidin = new orang2();
           abidin.umurSekarang();
           //memanggil method return dengan dibungkus suatu variable
           int variable = abidin.umurSekarang();
           System.out.println(variable);
    }
    //methode return adalah methode yang mengembalikan nilai,bisa berupa nilai
    //langsung atau dibungkus dalam suatu variable
    //tipeData namaMethod{
    //return value
    //};
    //dibawah ini contoh Method return bernama umurSekarang dan return valuenya bernilai 21 
    int umurSekarang(){
    return 21;
}
}
