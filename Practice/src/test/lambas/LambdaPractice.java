package test.lambas;

public class LambdaPractice {

    public static void main(String[] args) {

        MyLambda myLambaFunction = () -> System.out.println("Hi, welcome to java 8");
        MyLambda innerClassLmabda = new MyLambda() {
            public void foo() {
                System.out.println("Hi from lambda");
            }
        };
        //1st way
        MyLambda1 stringTestLambda = s -> s.length();
        System.out.println(stringTestLambda.foo1("testing of lambda with a return type"));
        innerClassLmabda.foo();
        myLambaFunction.foo();
        LambdaPractice.secondWay(stringTestLambda);

        Thread myThread =  new Thread(() -> System.out.println("hi from this thread"));
        try {
            Thread.sleep(1000) ;
            myThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void secondWay(MyLambda1 l) {
        System.out.println("second way of using lambda : " + l.foo1("pass the value from this method"));
    }

    interface MyLambda {
        void foo();
    }

    interface MyLambda1 {
        int foo1(String s);
    }


}
