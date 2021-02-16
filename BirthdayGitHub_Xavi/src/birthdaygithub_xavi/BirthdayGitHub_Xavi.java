/*
AUTOR: Xavi Paniagua
FECHA: 16/02/2021
 */
package birthdaygithub_xavi;

/**
 *
 * @author xavierpanand
 */
public class BirthdayGitHub_Xavi {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {//inicio main
       int day=13,month=9,year=2021;
       String stData=birthDay_ZellerMonlau(day,month,year);
        System.out.println("Interantional programer's day: "+stData+" sep2021");
    }//fin main
      private static String birthDay_ZellerMonlau(int day, int month, int year){
        String []ArrayWeek ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int a, y, m, d;
        a=(14-month)/12;
        y=year-a;
        m=month +12*a-2;
        d=(day+y+y/4-y/100+y/400+(31*m)/12)%7;
        return ArrayWeek[d];
    }
    
}
