import java.util.concurrent.ThreadLocalRandom; // biblioteca de numeros aleatórios 
import java.util.Random; // para criar funcção tocando do algorimo com o valor booleano
public class whileEvalorAleatorio {
    public static void main(String[] args) {
        double mesada = 50.0;
        int contador = 0; // contar quantos doces joaozinho levou
        while(mesada > 0 ){
            double valorDoce = valorAleatorio(); // recebendo um valor aleatorio atravez da função aleatoria
           /*  if (valorDoce > mesada){
                valorDoce =  mesada;
            }// if*/
            System.out.println("Doce do valor: R$"+ valorDoce + " Adicionado ao carrinho ");
            mesada = mesada - valorDoce;
            contador ++;
            
        }// while

        System.out.println("Joãozinho gastou toda sua mesada em doces ");
        System.out.println("Valor da Mesada: R$"+mesada);
        System.out.println("Joãozinho comprou * " + contador +" * Doces ");

    // algoritimo joãozinho ligando para seu amigo falando que se intupiu de doces
    // importou classe aletoria para funcção tocando e criada a função aletoria de tocar o telefone

    // do while  nesta condição o comando é executo pelo menos uma vez se caso o valor seja o desejado ele sai senao ele continua
    System.out.println("___________________________________________________________________________________________________________");
    System.out.println(" Discando ...");
    do{
  
       System.out.println(" Telefone Tocando ");

    }while(tocando());
    System.out.println("Alô ");

    } // main
   
    // função para retornar numeros aletorios
    private static double valorAleatorio(){ 
        return ThreadLocalRandom.current().nextDouble(2, 8);// espaço de valores aleatórios que serao retornados entre 2 e 8
    }// função
    
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu " + atendeu);
        // negando ato de continuar tocando
        return ! atendeu ;
    }// função


}// classe




