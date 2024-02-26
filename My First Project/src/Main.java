//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static final String ANS_RESET ="\u001b[0m";
  public static final String ANS_BLUE ="\u001b[34m";
  public static final String ANS_GREEN ="\u001b[32m";
  public static final String ANS_PURPLE ="\u001b[35m";
  public static final String ANS_YELLOW ="\u001b[33m";
  public static final String ANS_RED ="\u001b[31m";


  public static void main(String[] args) {

      System.out.println("Hello world");


      System.out.println(ANS_BLUE + "BLUE" + ANS_RESET);
      System.out.println(ANS_GREEN + "GREEN" + ANS_RESET);
      System.out.println(ANS_PURPLE + "PURPLE" + ANS_RESET);
      System.out.println("GREEN");
      System.out.println(ANS_BLUE + "BLUE");
      System.out.println("GREEN");
      // public static final String ANS_RESET ="\u001b[0m"; - не дает наследовать цвет на след. строку.

      System.out.println(ANS_PURPLE + "        *");
      System.out.println(ANS_RED + "      * * *" + ANS_RESET);
      System.out.println(ANS_GREEN + "    * * * * *");
      System.out.println(ANS_YELLOW + "  * * * * * * *" + ANS_RESET);
      System.out.println(ANS_GREEN + "* * * *" + ANS_BLUE + " * " + ANS_GREEN + "* * * *");
      System.out.println(ANS_YELLOW + "  * * * * * * *" + ANS_RESET);
      System.out.println(ANS_GREEN + "    * * * * *");
      System.out.println(ANS_RED + "      * * *" + ANS_RESET);
      System.out.println(ANS_PURPLE + "        *" + ANS_RESET);

      System.out.println(ANS_RED + "false" + ANS_RESET);
      System.out.println(ANS_GREEN + "true" + ANS_RESET);
           //int
      int weight = 200 ;
                                         // int age = 10;
      int ageYang = 10;
      int ageOld = 100;
      int sumOfAllAge = ageYang + ageOld;
                                        //можно задать любую операцию (сложение)
      // int maxIntNumber =2147483647;
      //int moreMaxNumInt = maxIntNumber + 1;
                                        // переполнение переменной по размеру. переход на мин значение . ошибки не выдает((

      int value = 4 % 2;
      //int value = 4 % 3;

      int number1 = 7;
      int number2 = 7;
      boolean theAreEqual = number1 == number2;


      int number3 = 5;
      int number4 = 8;
      boolean theAreNotEqual = number3 != number4;

             //Инкремент vs Декримент (Увеличение(уменьшение) значений, любое число)
      int number = 8;
      // number = number + 1;
      // number++;;
      number+=5;;

       System.out.println();


           //boolean
      boolean isWeightOk = true;
      boolean isAgeOk = false;
      boolean isOldAgeBiggerThanYoung = ageOld < ageYang;


           //rewrite

      weight = 50;
      isWeightOk = false;


           //Constant
      final int SCREEN_SYZE = 1024;
      //  SCREEN_SYZE = SCREEN_SYZE + 1;



      System.out.println("This age Equal" + true );
      System.out.println("This age Not Equal" + true );
      System.out.println("This is warble content " + ageYang);
      System.out.println("This is warble content " + weight);



  }
}

