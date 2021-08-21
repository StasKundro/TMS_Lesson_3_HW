package com.tms.document;

public class FinancialInvoice extends MainInfo {
    public String monthlyAmount;
    public int documentNum;
    public int departmentCode;

    @Override
    public void saveDocument() {
        System.out.println("Сохранение финансовой накладной");
    }

    @Override
    public void showInfo() {
        System.out.println("Дата документа: " + date);
        System.out.println("Итоговая сумма за месяц: " + monthlyAmount);
        System.out.println("Номер документа: " + documentNum);
        System.out.println("Код департамета: " + departmentCode);
    }
}
