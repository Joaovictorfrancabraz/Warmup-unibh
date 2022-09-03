public class questão2 {

    public static void main(String[] args) {

        int tam = 10;
        int vetor[] = new int[tam];
        int i;

        for (i = 0; i < tam; i++) {
            vetor[i] = (int) (Math.random() * 10 * Math.random() * 10);
        }

        System.out.printf("\n");
        for (i = 0; i < tam; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.printf("Posição %d = %2d\n", i, vetor[i]);
            }
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero == 0 || numero == 1) {
            return false;
        }

        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}
