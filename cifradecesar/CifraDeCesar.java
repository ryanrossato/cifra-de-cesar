package cifradecesar;

import java.util.Scanner;

public class CifraDeCesar {

    static String palavra;
    static char[] letras;
    static int desfaz;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao Cifra de César!!");
        System.out.println("===================================");
        System.out.println("Informe uma palavra: ");
         palavra = entrada.nextLine();
        letras = palavra.toCharArray();

        System.out.println("Informe o valor do deslocamento: ");
        int desloca = entrada.nextInt();
        String novaFrase = "";

        System.out.println("Aqui está: ");

        for(byte indice = 0; indice < letras.length; indice++){
            int numero = (int)letras[indice];
            char novaLetra = (char)(numero + desloca);
            novaFrase += novaLetra;
            System.out.println(novaLetra);
        }
        System.out.println("");

        System.out.println("Deseja desfazer a cifra?");
        System.out.println("1 para SIM - 2 para NÃO");
        desfaz = entrada.nextInt();

// Loop para garantir que o usuário insira apenas valores válidos
while (true) {
    if (entrada.hasNextInt()) {
        desfaz = entrada.nextInt();
        if (desfaz == 1 || desfaz == 2) {
            break; // Sai do loop se o valor for válido
        } else {
            System.out.println("Por favor, insira apenas 1 para SIM ou 2 para NÃO.");
        }
    } else {
        System.out.println("Por favor, insira um número.");
        entrada.next(); // Limpa a entrada inválida do buffer do scanner
    }
}
    // pergunta ao usuário se deseja desfazer a cifra e voltar a palavra normal
    
        if(desfaz == 1){
        System.out.println("\n desfazendo a cifra");
        letras = novaFrase.toCharArray();
        for(byte indice = 0; indice < letras.length; indice++){
            int numero = (int)letras[indice];
            char novaLetra = (char)(numero - desloca);

            System.out.println(novaLetra);
        }
    }else{
        System.out.println("Até mais!");
    }
    }
}