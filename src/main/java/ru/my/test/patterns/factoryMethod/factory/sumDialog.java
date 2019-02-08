package ru.my.test.patterns.factoryMethod.factory;

import ru.my.test.patterns.factoryMethod.Travels.SummerTravel;
import ru.my.test.patterns.factoryMethod.Travels.Travel;

public class sumDialog extends Dialog {
    @Override
    public Travel createTravel() {
        return new SummerTravel();
    }
}
