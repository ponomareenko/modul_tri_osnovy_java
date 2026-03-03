package ru.netology.service;

public class CustomsService {

    public static int calculateCustoms(int price, int weight) {
        final int ST_PO_WEIGHT = 100;

        int result = (price / 100) + (weight * ST_PO_WEIGHT);
        return result;
    }
}
