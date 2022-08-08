package ch06Methods;

public class dayYear {
    public static void main(String[] args) {

        getYear(59);
    }
    public static void getYear(int number){
        if(number<=31)
            System.out.println("January");//31
        else if (number<=59)
            System.out.println("February");//28
        else if (number<=90)
            System.out.println("March");//31
        else if (number<=120)
            System.out.println("April");//30
        else if (number<=151)
            System.out.println("May"); //31
        else if (number<=181)
            System.out.println("June");//30
        else if (number<=212)
            System.out.println("July");//31
        else if (number<=243)
            System.out.println("August");//31
        else if (number<=273)
            System.out.println("September");//30
        else if (number<=304)
            System.out.println("October");//31
        else if (number<=334)
            System.out.println("November");//30
        else if (number<=365)
            System.out.println("December");//31
        else
            System.out.println("wrong input");
    }


}
