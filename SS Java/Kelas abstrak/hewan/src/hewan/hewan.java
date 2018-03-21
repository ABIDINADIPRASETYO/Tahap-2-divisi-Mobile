package hewan;
/*** @author Abidin*/
public class hewan extends makhluk{
//class abstract adalah kelas yang mengandung 1 methode abstract atau lebih
//hanya untuk mendeklarasikan method tanpa implementasinya langsung
    public static void main(String[] args) {
        makhluk m = new hewan();
        m.tidur();
    }
    
    //tidak perlu abstract karena di kelas anaknya
    void tidur(){
        
    }
    
}
