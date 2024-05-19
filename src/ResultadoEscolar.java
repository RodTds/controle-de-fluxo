public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6;
        // condicional composta if e else
        // encandeadas if elif e else
        if(nota >= 7)
           System.out.println("Aprovado");
        else if(nota >= 5 && nota < 7)
             System.out.println(" Prova de recuperação");
        else  
            System.out.println("Reprovado");
        
        // condição ternária
        String resultado = nota>=7 ?  "Aprovado " : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        
        // switch case
        String sigla = "G";
        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
            } // também funcionou com sem CHAVES
            case "M":
                 System.out.println("Médio");
                 break;
            case "G":
                 System.out.println("Grande");
                 break;
            default:
                 System.out.println("INDEFINIDO");
                
        }

    }
    
}
