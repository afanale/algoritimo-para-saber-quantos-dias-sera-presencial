import java.util.Scanner;

public class quantidadeDeDiasPresencial {
    public static void main(String[] args) {

        int janeiro = 31;
        int fevereiro = 28;
        int marco = 31;
        int abril = 30;
        int maio = 31;
        int junho = 30;
        int julho = 31;
        int agosto = 31;
        int setembro = 30;
        int outubro = 31;
        int novembro = 30;
        int dezembro = 31;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();
        int diasDoMes = 0;

        switch (mes) {
            case 1:
                diasDoMes = janeiro;
                break;
            case 2:
                diasDoMes = fevereiro;
                break;
            case 3:
                diasDoMes = marco;
                break;
            case 4:
                diasDoMes = abril;
                break;
            case 5:
                diasDoMes = maio;
                break;
            case 6:
                diasDoMes = junho;
                break;
            case 7:
                diasDoMes = julho;
                break;
            case 8:
                diasDoMes = agosto;
                break;
            case 9:
                diasDoMes = setembro;
                break;
            case 10:
                diasDoMes = outubro;
                break;
            case 11:
                diasDoMes = novembro;
                break;
            case 12:
                diasDoMes = dezembro;
                break;
            default:
                System.out.println("Mês inválido.");
        }
        System.out.println("Esse mês tem " + diasDoMes + " dias.");
        int quantidadeFinalDeSemanaMes = (diasDoMes > 28) ? 5 : 4;
        System.out.println("Esse mês tem " + quantidadeFinalDeSemanaMes + " finais de semana.");
        int diasUteis = diasDoMes - quantidadeFinalDeSemanaMes;
        System.out.println("Esse mês tem " + diasUteis + " dias úteis.");
        int diasDeHomeSemana1 = 3 * 3;
        int diasDeHomeSemana2 = 2 * 2;
        int diasDeHomeOffice = diasDeHomeSemana1 + diasDeHomeSemana2;
        System.out.println("Esse mês você irá ficar de home " + diasDeHomeOffice + " dias.");
        int diasDePresencial = diasUteis - diasDeHomeOffice;
        System.out.println("Esse mês você irá " + diasDePresencial + " dias presencial.");
    }
}
