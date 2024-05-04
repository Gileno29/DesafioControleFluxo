import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int param1;
        int param2;
        Scanner s = new Scanner(System.in);
        System.out.println("insira o primeiro valor");
        param1= s.nextInt();
        System.out.println("insira o valor numero 2");
        param2= s.nextInt();

        try{
            contar(param1, param2);

        }catch(Exception e){
            System.out.println("Houve uma excessao: " + e);

        }

        
    }


    static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if (n1<n2){
            throw new ParametrosInvalidosException();
        }

        
        for(int x=0; x < (n1-n2); x++){
            System.out.println(x+1);
        }
    }
   
    
}
