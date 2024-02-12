package Lesson0902;

public class WirelessPhone extends AbstractPhone{

    private int workHour;
    public WirelessPhone(int year, int workHour) {
        super(year);
        this.workHour = workHour;
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Исходящий звонок: " + outNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Входящий звонок: " + inputNumber);
    }
}
