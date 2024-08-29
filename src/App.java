public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria contapobre = new ContaBancaria("12345", "54321", "12534", 10);
        ContaBancaria contapobrepremium = new ContaBancaria("290924", "242909", "092429", 100);
        ContaBancaria contarico = new ContaBancaria("180906", "090618", "061809", 10000);
        
        System.out.println("Saldos das contas:");
        System.out.println();
            contapobre.verSaldo1();  
            contapobrepremium.verSaldo2();
            contarico.verSaldo3();
        System.out.println();
            contapobre.setSaldo(10);
            contapobrepremium.setSaldo(200);
            contarico.setSaldo(20000);
        System.out.println("Saldos atualizado das contas:");
        System.out.println();    
            contapobre.verSaldo1();  
            contapobrepremium.verSaldo2();
            contarico.verSaldo3();


    }
}
