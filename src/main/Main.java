package isFib.src.main;

public class Main {
    
    public static void main(String[] args) {
        
        int value = 14;

        if(isFib(value))
            System.out.println("O valor "+ value +" pertence a sequência de Fibonacci");
        else
            System.out.println("O valor "+ value +" NÃO pertence a sequência de Fibonacci");

    }

    static private boolean isFib(int value){
            int current = 1;
            int prior = 0;

            if(value == 0)
                return true;

            while (current < value){
                int aux = current;
                current += prior;
                prior = aux;
            }

            if(current == value)
                return true;

            return false;
    }



}
