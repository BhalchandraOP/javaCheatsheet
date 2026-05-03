interface interface1{
    void method1();
}
interface Interface2 extends Interface1{
    void method2();
}
class Implementation implements Interface2{
public void method1(){}
public void method2(){}    }
abstract class impl implements Interface2{
    public void method1(){ }
}
interface Interface3 {
    int test=3;
}