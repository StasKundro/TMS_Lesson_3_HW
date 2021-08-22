package com.tms.document;

import java.util.Scanner;

public class FinancialInvoice extends MainInfo {
    public String monthlyAmount;
    public int documentNum;
    public int departmentCode;

    @Override
    public void saveDocument() {
        System.out.println("Введите дату документа ");
        Scanner scanner = new Scanner(System.in);
        date = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        System.out.println("Дата документа: " + date);
        System.out.println("Итоговая сумма за месяц: " + monthlyAmount);
        System.out.println("Номер документа: " + documentNum);
        System.out.println("Код департамета: " + departmentCode);
    }
}
