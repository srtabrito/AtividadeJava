import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a largura do cômodo em metros: ");
        double largura = scanner.nextDouble();
        
        System.out.print("Digite o comprimento do cômodo em metros: ");
        double comprimento = scanner.nextDouble();
        
        double area = largura * comprimento;
        
        int potenciaIluminacao = (int) (area * 18);
        
        System.out.println("A área do cômodo é: " + area + " m²");
        System.out.println("A potência de iluminação necessária é: " + potenciaIluminacao + " W");
        
        scanner.close();
    }
}
