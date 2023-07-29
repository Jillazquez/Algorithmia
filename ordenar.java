package algoritmia;

public class ordenar {
    public static void main(String[] args) {
        int[] lista = {4,6,2,33,6,77,2,8,34};
        int primer =0,segundo =0;
        for(int j = 0;j < lista.length-1;j++){
        for(int i = j;i<lista.length-1;i++){
            if(lista[i]>lista[i+1]){
                primer = lista[i];
                lista[i] = lista[i+1];
                lista[i+1] = primer;
            }
            
        }
         }
        for(int i = 0;i<lista.length;i++){
                System.out.println(lista[i]);
            }
            
    }
}
