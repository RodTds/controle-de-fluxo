public class CaixaEletronico {
    public static void main(String[] args) {
       double saldo = 25.0;
       double valorSolicitado = 18.0;

       if(valorSolicitado < saldo){
           saldo = saldo - valorSolicitado;
           System.out.println("Novo Saldo:R$ " + saldo);
        }
        else
           System.out.println("Saldo: R$ " + saldo + " Você não Possui saldo suficiente para este SAQUE ");
        
    }
}
