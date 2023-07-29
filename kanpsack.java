package algoritmia;

public class kanpsack {
    public static void main(String[] args) {
        int max=32;
        int dinero =0;
        int[] peso = {2,5,7,12,15};
        int[] precio ={3,6,9,10,16};
        for(int i = 4;i >= 0;i--){
            if(max>peso[i]){
                max-=peso[i];
                dinero += precio[i];
            }
        }
        System.out.println("Sobra este peso "+max+" este dinero "+dinero);
    }
}
