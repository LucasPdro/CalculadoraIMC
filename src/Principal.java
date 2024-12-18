import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();
        calculadoraIMC pessoa1 = new calculadoraIMC();
        Locale.setDefault(Locale.US);
        //Scanner para usuário digitar
        Scanner resultx = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
         paciente1.peso = resultx.nextDouble();
        System.out.println("Digite sua altura: ");
         paciente1.altura = resultx.nextDouble();
        resultx.close();



        IndiceMassaCorporal imc = pessoa1.calcularIMC(paciente1);

        System.out.printf("Peso: %.2f%n",paciente1.peso);
        System.out.printf("Altura: %.2f%n",paciente1.altura);
        System.out.printf("IMC: %.2f%n", imc.resultado);

        System.out.println("===========================");

        if (imc.estarComObesidade()) {
            System.out.println("ACIMA DO PESO");

        } else if (imc.estarAbaixoDoPeso()) {
            System.out.println("ABAIXO DO PESO");
        }


    }
}
