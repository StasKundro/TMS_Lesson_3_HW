import com.tms.document.DocumentProducts;
import com.tms.document.DocumentContract;
import com.tms.document.DocumentFinance;
import com.tms.terminal.Register;

import java.sql.Date;


/**
 * создаем 3 разных документа и задаем им необходимые значения. сохраняем документы и выводим в консоль их информацию
 * Register terminal1 = new Register();
 * terminal1.registerDocument(myProducts);
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        DocumentProducts myProducts = new DocumentProducts();
        myProducts.documentNum = 1543;
        myProducts.productType = "дрова";
        myProducts.sumOfProducts = 134;
        myProducts.documentDate = new Date(100 + 21, 7, 7);

        DocumentContract myContract = new DocumentContract();
        myContract.contractEndDate = "24.08.2022";
        myContract.documentNum = 2314;
        myContract.employeeName = "Святослав";
        myContract.documentDate = new Date(100 + 21, 9, 3);

        DocumentFinance myFinance = new DocumentFinance();
        myFinance.documentNum = 6973;
        myFinance.departmentCode = 15324234;
        myFinance.monthlyAmount = "1.004.853 $";
        myFinance.documentDate = new Date(100 + 21, 3, 10);

        System.out.println("---------------------------------");

        Register registration = new Register();
        registration.saveDocument(myContract);
        registration.saveDocument(myProducts);
        registration.saveDocument(myFinance);
        System.out.println(registration.getInfo(registration.documentsArray[0]));
        System.out.println("---------------------------------");
        System.out.println(registration.getInfo(registration.documentsArray[1]));
        System.out.println("---------------------------------");
        System.out.println(registration.getInfo(registration.documentsArray[2]));
        System.out.println("---------------------------------");


        System.out.println("End");
    }
}
