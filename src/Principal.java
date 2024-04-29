import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        ConversorDeMoneda ConversorDeMoneda = new ConversorDeMoneda();
        Conversor Conversor = ConversorDeMoneda.buscaConversion("MXN","USD");

        System.out.println("******************************************");
        System.out.println("***Bienvenid@ al conversor de monedas***\n");

        String MENU = """
                1) Peso Mexicano -->> Dólar
                2) Dólar -->> Peso Colombiano
                3) Won (Moneda de Corea del Sur) -->> Peso Mexicano
                4) Peso Mexicano -->> Won (Moneda de Corea del Sur)
                5) Peso Mexicano -->> Peso Colombiano
                6) Peso Colombiano -->> Peso Mexicano
                7) Peso Euro -->> Peso Colombiano 
                8) Euro -->> Peso Mexicano
                9) Salir
                
                Elija una opción Valida.
                """;
        int opcion = 0;

        while(opcion !=9){
            System.out.println(MENU);
            System.out.println("**********************************");
            opcion = lectura.nextInt();
            System.out.println("Escriba el valor que deseas covertir");
            double valor = lectura.nextDouble();
             switch (opcion){
                 case 1:
                     Conversor = ConversorDeMoneda.buscaConversion("MXN","USD");
                     System.out.println("El valor de "+valor+"[MXN] equivale a: " + Conversor.conversion_rate()*valor + " Dólares USD");
                     System.out.println("---------------------------------------------------------");
                     break;
                 case 2:
                     Conversor = ConversorDeMoneda.buscaConversion("USD","COP");
                     System.out.println("El valor de: "+valor+"[USD] equivale a: " + Conversor.conversion_rate()*valor + " Pesos COP");
                     System.out.println("---------------------------------------------------------");
                     break;
                 case 3:
                     Conversor = ConversorDeMoneda.buscaConversion("KRW","MXN");
                     System.out.println("El valor de: "+valor+"[KRW] equivale a: " + Conversor.conversion_rate()*valor + " Pesos MEX");
                     System.out.println("---------------------------------------------------------");
                     break;
                 case 4:
                     Conversor = ConversorDeMoneda.buscaConversion("MXN","KRW");
                     System.out.println("El valor de: "+valor+"[MXN] equivale a: " + Conversor.conversion_rate()*valor + " Wones KRW");
                     System.out.println("---------------------------------------------------------");;
                     break;
                 case 5:
                     Conversor = ConversorDeMoneda.buscaConversion("MXN","COP");
                     System.out.println("El valor de: "+valor+"[MXN] equivale a: " + Conversor.conversion_rate()*valor + " Pesos COP");
                     System.out.println("---------------------------------------------------------");
                     break;
                 case 6:
                     Conversor = ConversorDeMoneda.buscaConversion("COP","MXN");
                     System.out.println("El valor de: "+valor+"[COP] equivale a: " + Conversor.conversion_rate()*valor + " Pesos MXN");
                     System.out.println("---------------------------------------------------------");
                     break;
                 case 7:
                     Conversor = ConversorDeMoneda.buscaConversion("EUR","COP");
                     System.out.println("El valor de: "+valor+"[EUR] equivale a: " + Conversor.conversion_rate()*valor + "COP");
                     System.out.println("---------------------------------------------------------");
                     break;
                 case 8:
                     Conversor = ConversorDeMoneda.buscaConversion("EUR","MXN");
                     System.out.println("El valor de: "+valor+"[EUR] equivale a: " + Conversor.conversion_rate()*valor + " Pesos MXN");
                     System.out.println("---------------------------------------------------------");
                     break;
                 case 9:
                     System.out.println("Gracias por utilizar nuestra Aplicación.");
                     System.out.println("---------------------------------------------------------");
                     break;
                 default:
                     System.out.println("Lo sentimos, esa opción no es válida.");
                     System.out.println("---------------------------------------------------------");
                     break;
             }
        }
        
    }
}
