public class PlanoOperadora {
    public static void main(String[] args) {
        //simulando três planos de telefonia: BASIC, MIDIA e TURBO
        String plano = "A"; //B, M ou T

        switch (plano) {
            case "T":{
                System.out.println("5Gb de Youtube");
            }
            case "M":{
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
