package orang3;

public class orang3 {
//atribut

    int umur = 20;
    String warna = "Hitam";

    public static void main(String[] args) {
        orang3 abidin = new orang3();
        
        String warnaBaru = abidin.getWarna();
        System.out.println(warnaBaru);
    }

    //method get = return
    String getWarna() {
        return "merah";
    }
}
