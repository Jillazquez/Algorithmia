package algoritmia;

public class Parenthesis {
    public static void main(String[] args) {
        int cont = 0;
        String ejemplo = "({esto es un ejemplo)}";
        for(int i = 0; i < ejemplo.length();i++){
            if(ejemplo.charAt(i)=='('||ejemplo.charAt(i)=='{'||ejemplo.charAt(i)=='[')
                cont++;
            if(ejemplo.charAt(i)==')'||ejemplo.charAt(i)=='}'||ejemplo.charAt(i)==']')
                cont--;
            
        }
        if(cont!=0)
            System.out.println("No estan cerrados todos los parentesis");
        else
            System.out.println("Estan cerrados todos los parentesis");
    }
}
