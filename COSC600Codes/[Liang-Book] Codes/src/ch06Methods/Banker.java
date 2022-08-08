package ch06Methods;

public class Banker {
    public static void main(String[] args) {
getChange(50);
getChange(55);
getChange(3);
getChange(333);
    }
    public static void getChange(int number){
        //1 - 5 - 10 - 50
        int num=number;
        int fifty=0;
        int ten=0;
        int five=0;
        int one=0;
        while (number > 0) {
            if(number%50==0){
                fifty++;
                number-=50;
            }else if(number%10==0){
                ten++;
                number-=10;
            }else if(number%5==0){
                five++;
                number-=5;
            }else if(number>0){
                one++;
                number-=1;
            }
        }
        System.out.println(num+ " has "+ fifty + " $50 , "+ ten +" $10 , " +five +" $5 , " + one + " $1");
    }
}
