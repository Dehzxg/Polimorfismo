package ExerciciosPoli;

public class TestePoli {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CavaloPoli cavalo =  new CavaloPoli();
        CachorroPoli cachorro =  new CachorroPoli();
        PreguicaPoli preguica =  new PreguicaPoli();


        int n = (int) (Math.random()*3.0);
        
        System.out.println("\nO som do animal escolhido: " );

        switch(n)
        {
        case 0: cavalo.som(); 
        break;
        case 1:cachorro.som(); 
        break;
        case 2: preguica.som();
        break;
        default: System.out.println("\nErro inesperado");
        }
    }

}