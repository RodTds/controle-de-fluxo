public class ContadoresVetores {
    public static void main(String[] args) {
        System.out.println("---------FOR---------------");
        for(int x = 1;x <=20;x++){
            System.out.println(x);
        }
        System.out.println("---------WHILE-------------");
        int x = 1;
        while(x <=20){
           System.out.println(x);
           x++;
        }// while
        // Arrays 
        System.out.println("Vetor POr posição ");
        String alunos[] = {"Felipe","Jonas","Julia","Marcos"};
        System.out.println("___________________________________________");
        System.out.println(alunos.length);
        System.out.println("-____________________________________________");
        for( x = 0;x < alunos.length;x++){
            System.out.println("Nomes na sequencia dos índices x = " + x  +" "+ alunos[x]);
        }
        // FOR EACH intera com array e coleção
        // cria uma variável na estrutura do for que vai reber cada elemento do for por vez
        System.out.println("For EACH");
        for(String aluno:alunos){
            System.out.println("Nome do aluno é: " +aluno);
        }
        //Break e Continue no FOR
        System.out.println("For com BREAK");
        for(x = 1;x <=5;x++){
            if(x == 3) // break dentro do for na condição ele interrompe o for quando achar a condição
               break;  // no caso quando chega em 3 ele para o for e sai nao exibindo do 3 endiante
            System.out.println(x);
        }
        // Continue no for
        System.out.println("For com CONTINUE");
        for(x = 1;x <=5;x++){
            if(x == 3) // quando usa CONTINUE no for quando chega na condição no caso do 3 ele pula esata condicao
               continue;  // ou seja ele continua a execução pilando o 3, ou seja continua após ela endiante
            System.out.println(x);
        }
     
    }
    
}
