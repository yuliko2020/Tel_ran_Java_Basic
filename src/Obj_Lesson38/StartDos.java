package Obj_Lesson38;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 16/06/2020  19:23
 */
public class StartDos {
    public static void main(String[] args) {
        Person sasha, dasha, pasha, glasha;

        Person misha = new Person(100, 185);
        // конструктор
        // дефаултный, пустой, с параметрами

        System.out.println(misha.height);
        misha.findBmiClassIndex();
        System.out.println(misha.bmi);
        sasha = new Person();

        dasha = new Person(65, 185);
        System.out.println("Индекс массы тела Даши " + dasha.bmi);
        pasha = new Person();
        glasha = new Person();
        Person[] bm13morning = {sasha, pasha, dasha, glasha, misha};
        glasha.myPrint();
        System.out.println(Arrays.toString(bm13morning));


    }
}
