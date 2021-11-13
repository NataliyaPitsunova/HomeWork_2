public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(InTheRangeOf10to20(5,15));
        positiveOrNegative(0);
        System.out.println(pstvOrNgtv(0));
        LinesByNumbers("Привет, Виталий!", 3);
        System.out.println(Leapyear(400));
    }
/*сумма в пределах от 10 до 20*/
    public static boolean InTheRangeOf10to20(int a,int b){
       if ((a+b>=10) &&(a+b<=20)){return true;}
       else {return false;}
    }
/*Положительное / отрицатеельное число*/
    public static void positiveOrNegative(int a){
        if (a>=0){System.out.println("Положительное число");}
        else{System.out.println("Отрицательное число");}
    }
    /*Положительное / отрицатеельное число boolean*/
    public static boolean pstvOrNgtv(int a){
        if (a>=0) {
            return true;
        }
        else {
            return false;
        }
    }
public static void LinesByNumbers(String TextLine, int a){
      for (int i=0; i<a; i++){
          System.out.println(TextLine);
      }
}
/*Високосный год*/
public static boolean Leapyear(int a){
  if (a>400) {
      if (a%4==0) {
          if (a%100 ==0) {
              if  (a%400 ==0) {
                  return true;}
              else {return false;}
          }
          else {return true;}
      }
      else {return false;}
  }
  else {if (a%4==0){
      return true;}
      else {
          return false;
      }
  }
}
}
