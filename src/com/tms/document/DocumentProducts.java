package com.tms.document;

import java.util.Date;

public class DocumentProducts extends Document {
    public int documentNum;
    public String productType;
    public int sumOfProducts;

    public DocumentProducts() {

    }

    DocumentProducts(int documentNum, String productType, int sumOfProducts, Date documentDate) {
        super(documentDate);
        this.documentNum = documentNum;
        this.productType = productType;
        this.sumOfProducts = sumOfProducts;
    }

    @Override
    public String toString() {
        return "Дата документа: " + documentDate + "; " +
                "Номер документа: " + documentNum + "; " +
                "Продукт: " + productType + "; " +
                "Колличество продуктов: " + sumOfProducts + "; ";

    }
}
