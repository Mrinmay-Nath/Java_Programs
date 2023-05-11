//Dynamic method dispatch
class A
{
    void dsp()
    {
        System.out.println("BWU");
    }
}
class B extends A {
    void dsp()
    {
        System.out.println("CSE");
    }
}
class C extends  A {
    void dsp()
    {
        System.out.println("SEM 4");
    }
}
class dmd{
public static void main(String[]args) {
    A a = new A();
    B b = new B();
    C c = new C();
    A r;
    r=a;
    r.dsp();
    r=b;
    r.dsp();
    r=c;
    r.dsp();
    }
}