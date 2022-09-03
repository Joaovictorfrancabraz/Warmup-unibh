public class questão1 {
   public static void main(String[] args) {

      int tabuada[][] = new int[10][10];

      for (int lin = 0; lin < 10; lin++) {

         for (int coluna = 0; coluna < 10; coluna++) {

            int num = lin + coluna;
            tabuada[lin][coluna] = num;
            System.out.print(tabuada[lin][coluna] + "\t");
         }
         System.out.println("");
      }
   }
}
