package ru.gb.task2.products;

import ru.gb.task2.commons.*;

/**
 * Сыр Балыковый (Балык)
 */
public class BalykCheese implements Snack {
    @Override
    public boolean getProteins() {
        return true;
    }

    @Override
    public boolean getFats() {
        return false;
    }

    @Override
    public boolean getCarbohydrates() {
        return false;
    }

    @Override
    public String getName() {
        return "Сыр (Балык)";
    }
}