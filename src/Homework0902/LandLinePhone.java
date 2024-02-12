package Homework0902;

public class LandLinePhone extends Phone{
    private boolean isCallable;

    public boolean isCallable() {
        return isCallable;
    }

    public LandLinePhone setCallable(boolean callable) {
        isCallable = callable;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nisCallable: %s;", this.isCallable);
    }

    @Override
    public void ring() {
        System.out.println("Пищит стационарный телефон!");
    }
}
