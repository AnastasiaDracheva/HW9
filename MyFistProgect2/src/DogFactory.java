public class DogFactory {

    public static void main(String[] args) {



        Dog myDog = new Dog();

        myDog.name = "hfgh";
        myDog.weigth = 2;
        myDog.breed = "KoerKoer";

            //execute without parameter (фиксированный)

        myDog.sayHello();

            //should be executed without parameter (параметр должен быть внесен)

        myDog.repeatWord(": Istu");

        myDog.sumTwoNumbers(2,3);
        myDog.sumTwoNumbers(1,8);

        System.out.println(myDog.sumTwoNumbers(2,3));
        System.out.println(myDog.sumTwoNumbers(1,8));

            //int result = 5
        int result = myDog.sumTwoNumbers(2,3);

        System.out.println(myDog.breed);


    }

}
