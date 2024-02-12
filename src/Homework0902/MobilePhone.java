package Homework0902;

public class MobilePhone extends Phone{
    private double screenSize;
    private boolean isFoldable;

    public double getScreenSize() {
        return screenSize;
    }

    public MobilePhone setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public boolean isFoldable() {
        return isFoldable;
    }

    public MobilePhone setFoldable(boolean foldable) {
        isFoldable = foldable;
        return this;
    }
    public void sendMessage(String message, int number) {
        System.out.printf("Сообщение отправлено на номер: %s\nТекст сообщения: %s", number, message);
    }

    @Override
    public void ring() {
        System.out.println("Играет полифония мобильника");
    }
}
