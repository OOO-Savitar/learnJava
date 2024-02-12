import Homework0902.LandLinePhone;
import Homework0902.MobilePhone;
import Homework0902.Phone;
import Homework0902.RingAble;
import Homework1.Work1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        LandLinePhone landLinePhone1 = new LandLinePhone();
        LandLinePhone landLinePhone2 = new LandLinePhone();

        MobilePhone mobilePhone1 = new MobilePhone();
        MobilePhone mobilePhone2 = new MobilePhone();

        phone1.receiveCall("Телефон 1");
        phone2.receiveCall("Телефон 2");
        landLinePhone1.receiveCall("Стационарный телефон 1");
        landLinePhone2.receiveCall("Стационарный телефон 2");
        mobilePhone1.receiveCall("Мобильный телефон 1");
        mobilePhone2.receiveCall("Мобильный телефон 2");

        System.out.println();

        phone1.ring();
        phone2.ring();
        landLinePhone1.ring();
        landLinePhone2.ring();
        mobilePhone1.ring();
        mobilePhone2.ring();

        System.out.println();

        aboutPhone(phone1);
        System.out.println(phone1 + "\n");

        aboutPhone(phone2);
        System.out.println(phone2 + "\n");

        aboutPhone(landLinePhone1);
        System.out.println(landLinePhone1 + "\n");

        aboutPhone(landLinePhone2);
        System.out.println(landLinePhone2 + "\n");

        aboutPhone(mobilePhone1);
        System.out.println(mobilePhone1 + "\n");

        aboutPhone(mobilePhone2);
        System.out.println(mobilePhone2 + "\n");

        landLinePhone1.setModelName("Panasonic F300");
        landLinePhone1.setNumber("(0291)52-4-14");
        landLinePhone1.setCallable(true);

        mobilePhone2.setModelName("Samsung S9");
        mobilePhone2.setWeight(123.4f);

        System.out.println(landLinePhone1);
        System.out.println();
        System.out.println(mobilePhone2);
    }

    public static void aboutPhone(RingAble ringAble) {
        ringAble.ring();
    }
}