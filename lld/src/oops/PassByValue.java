package oops;

public class PassByValue {

    public static Person modify(Person obj, int num) {

        obj.name = "Forest";

        obj = new Person();
        obj.name = "El";
        num = 20;

        System.out.println("Object -> " + obj.name);
        System.out.println("Integer ->" + num);

        return obj;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Rivendell";
        int a = 10;
        Person res = modify(p, a);

        System.out.println(p.name);
        System.out.println(res.name);
    }
}

class Person {
    String name;
}