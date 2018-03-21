package orang1;
/**@author Abidin**/
public class orang1 {

    int umur = 20;
    String asal = "Blitar";

    public static void main(String[] args) {
        orang1 abidin = new orang1();
        //Parameter adalah nilai yang bisa kita oper pada fungsi
        abidin.berjalan(" dengan kaki");
       ;
    }

    //Dapat Melakukan Aktivitas atau kita bisa menyebutnya method pada OOP
    public void berjalan(String anggotaTubuh){
        System.out.println("berjalan"+ anggotaTubuh);
    }
}
