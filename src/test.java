import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Testone {
   static int factorial(int n) {
      int f;

      for(f = 1; n > 1; n--){
         f *= n;
      }
      return f;
   }
   static int ncr(int n,int r) {
      return factorial(n) / ( factorial(n-r) * factorial(r) );
   }
   public void print() throws IOException{
	   FileWriter writer = new FileWriter("/Users/raghu/JavaFile/testwo.txt");
   
	   System.out.println();
      int n, i, j;
      n = 5;

      for(i = 0; i <= n; i++) {
         for(j = 0; j <= n-i; j++){
            System.out.print(" ");
            writer.write(" ");
         }
         for(j = 0; j <= i; j++){
            System.out.print(" "+ncr(i, j));
            writer.write(" "+ncr(i, j));
            
         }
         writer.write(System.getProperty( "line.separator" ));
      }
   writer.close();
   }
}
class test extends Testone{
	

public static void main(String[] args) throws IOException {
	Testone t = new Testone();
      
	 t.print();	


}
}
