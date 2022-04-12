public class Main {
    public static void main(String[] args) {
        MultipleArray multipleArray = new MultipleArray();
        multipleArray.add(new Cat());
        multipleArray.add(new Dog());
        Cat myCat = (Cat) multipleArray.get(0);
        Dog myDog = (Dog) multipleArray.get(1);
        System.out.println(myCat.a);
        System.out.println(myCat.b);
        System.out.println(myCat.c);
        System.out.println(myDog.d);
        System.out.println(myDog.e);
        System.out.println(myDog.b);
    }
}