package com.tms.document;

public class ContractWithEmployee extends MainInfo {
    public int documentNum;
    public String contractEndDate;
    public String employeeName;

    @Override
    public void saveDocument() {
        System.out.println("Сохранение контракта с сотрудником ");
    }

    @Override
    public void showInfo() {
        System.out.println("Дата документа: " + date);
        System.out.println("Номер документа: " + documentNum);
        System.out.println("Дата окончания контракта: " + contractEndDate);
        System.out.println("Имя сотрудника: " + employeeName);
    }
}
