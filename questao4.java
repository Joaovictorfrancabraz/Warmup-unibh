import java.util.Scanner;

public class questão4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorComCadaPessoa[] = new float[10];
        boolean caractereIncorreto;

        do{
            System.out.println("Informe o valor que o bandido possuia:");

            try {
                valorComCadaPessoa[0] = scanner.nextFloat();
                caractereIncorreto = false;

                if(valorComCadaPessoa[0] % 10 != 0) {
                    System.out.println("Favor informe um numero multiplo de 10");
                    caractereIncorreto = true;
                }
            }
            catch(Exception e) {
                System.out.println("Caractere incorreto inserido! Favor informe um numero");
                caractereIncorreto = true;
                scanner.next();
            }
        } while(caractereIncorreto);

        System.out.println("Informe o valor que cada pessoa possui:");
        for(int i = 1; i < valorComCadaPessoa.length; i++) {

            do{
                System.out.printf("Valor com pesssoa %d\n", i);

                try {
                    valorComCadaPessoa[i] = scanner.nextFloat();
                    caractereIncorreto = false;
                }
                catch(Exception e) {
                    System.out.println("Caractere incorreto inserido! Favor informe um numero");
                    caractereIncorreto = true;
                    scanner.next();
                }
            } while(caractereIncorreto);
        }

        String posicaoDosBandidos = "[0] ";
        float dinheiroRoubado = valorComCadaPessoa[0];

        for(int i = 1; i < valorComCadaPessoa.length; i++) {
            if(valorComCadaPessoa[i] % 10 == 0 && valorComCadaPessoa[i] > valorComCadaPessoa[0]) {
                dinheiroRoubado += valorComCadaPessoa[i];
                posicaoDosBandidos += "["+i+"] ";
            }
        }

        System.out.println("Dinheiro roubado: "+dinheiroRoubado);
        System.out.println("Posicao dos bandidos no array\n"+posicaoDosBandidos);
    }
}
