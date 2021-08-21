package com.tms.document;

import java.net.SocketOption;

public class ComingProducts extends MainInfo {
    public int documentNum;
    public String productType;
    public int sumOfProducts;

    @Override
    public void saveDocument() {
        System.out.println("Сохранение документа о поставке товара");
    }

    @Override
    public void showInfo() {
        System.out.println("Дата документа: " + date);
        System.out.println("Номер документа: " + documentNum);
        System.out.println("Тип товаров: " + productType);
        System.out.println("Количество товаров: " + sumOfProducts);

    }
}
