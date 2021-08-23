package com.tms.document;

import java.util.Date;

public class DocumentFinance extends Document {
    public String monthlyAmount;
    public int documentNum;
    public int departmentCode;

    public DocumentFinance() {

    }

    DocumentFinance(String monthlyAmount, int documentNum, int departmentCode, Date documentDate) {
        super(documentDate);
        this.documentNum = documentNum;
        this.departmentCode = departmentCode;
        this.monthlyAmount = monthlyAmount;
    }

    @Override
    public String toString() {
        return "Дата документа: " + documentDate + "; " +
                "Сумма за месяц: " + monthlyAmount + "; " +
                "Номер документа: " + documentNum + "; " +
                "Код департамента: " + departmentCode + "; ";

    }
}
