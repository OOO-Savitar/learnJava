package Homework0902;

public class Phone implements RingAble{
    private String number, modelName;
    private float weight;

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public String getNumber() {
        return number;
    }

    public Phone setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getModelName() {
        return modelName;
    }

    public Phone setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public Phone setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Модель телефона: %s; \nВес телефона: %s; \nНомер телефона: %s;", this.modelName, this.weight, this.number);
    }

    @Override
    public void ring() {
        System.out.println("Звенит телефон!");
    }
}
