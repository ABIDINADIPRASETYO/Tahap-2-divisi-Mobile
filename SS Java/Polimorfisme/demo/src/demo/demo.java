package demo;/*** @author Abidin */
class binatang{
    void suara(){
        System.out.println("suara default"); 
   }
}
class kucing extends binatang{
    void suara(){
        System.out.println("miaw"); 
   }
}
class anjing extends binatang{
    void suara(){
        System.out.println("guk guk");
    }
}//konsep polimorfisme adalah nama method sama tp dapat melakukan
//hal yang berbeda-beda
public class demo {
       public static void main(String[] args) {
        binatang normal = new binatang();
        normal.suara();
        
        binatang kucing = new kucing();
       kucing.suara();
       
       binatang anjing = new anjing();
       anjing.suara(); 
    }
}
