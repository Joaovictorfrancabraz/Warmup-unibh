public class questão3 {

    public static void main(String[] args) {
        String modelos[] = { "Fusca", "Monza", "Chevette", "Opala", "Uno" };
        float kmPorLitro[] = { 10, 8, 11, 6, 14 };

        int posicaoMaisEconomico = maisEconomico(kmPorLitro);

        System.out.printf("Carro mais economico:\n%s: %.1f\n", modelos[posicaoMaisEconomico],
                kmPorLitro[posicaoMaisEconomico]);
        System.out.print("\nConsumo de cada carro para percorrer 1000km:\n");
        for (int i = 0; i < modelos.length; i++) {
            System.out.printf("%s: %.2f\n", modelos[i], calcularConsumoPorDistancia(kmPorLitro[i], 1000));
        }
    }

    public static int maisEconomico(float[] kmPorLitro) {
        int menorConsumo = 0;

        for (int i = 1; i < kmPorLitro.length; i++) {
            if (kmPorLitro[i] > kmPorLitro[menorConsumo]) {
                menorConsumo = i;
            }
        }

        return menorConsumo;
    }

    public static float calcularConsumoPorDistancia(float kmPorLitro, float distancia) {
        return distancia / kmPorLitro;
    }
}
