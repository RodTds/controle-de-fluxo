public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        // switch case sem o break en cada case para uma logica de impressão conforme o plano
        // lógica ao contrário decrecente porque se for opcao M sem o break imprime dali endiante por exemplo
        // estudar conceitos de " continue, break e default "
        switch (plano) {
            case "T":{
                 System.out.println("5GB Youtube");
            }
             case "M":{
                System.out.println("Whatsapp e Instragran Gratis ");
            }
            case "B":{
                System.out.println("100 minutos de ligação ");
        }
   
        } // switch

    }// main
    
}// class
