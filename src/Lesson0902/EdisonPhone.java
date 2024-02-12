package Lesson0902;

public class EdisonPhone extends  AbstractPhone{
    public EdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообшщите номер абонента");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Звонок входящий");
    }
}
