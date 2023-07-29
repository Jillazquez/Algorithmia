package algoritmia;

public class palindromo {
    public static void main(String[] args) {
        String palindromo = "arrozzorra";
        boolean pal = true;
        for(int i = 0;i < palindromo.length()/2;i++){
            if(palindromo.charAt(i)!=palindromo.charAt(palindromo.length()-i-1))
                pal = false;
        }
        System.out.println(pal);
    }
}
