import com.tms.document.ComingProducts;
import com.tms.document.ContractWithEmployee;
import com.tms.document.FinancialInvoice;
import com.tms.terminal.Terminal;

/**
 * создаем 3 разных документа и задаем им необходимые значения. сохраняем документы и выводим в консоль их информацию
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("---------------------------------");
        ComingProducts myProducts = new ComingProducts();
        myProducts.documentNum = 1543;
        myProducts.productType = "дрова";
        myProducts.sumOfProducts = 134;
        myProducts.date = "13.07.2021";
        Terminal terminal1 = new Terminal();
        terminal1.registerDocument(myProducts);
        myProducts.saveDocument();
        System.out.println("---------------------------------");
        ContractWithEmployee myContract = new ContractWithEmployee();
        myContract.contractEndDate = "24.08.2022";
        myContract.date = "14.07.2021";
        myContract.documentNum = 2314;
        myContract.employeeName = "Святослав";
        Terminal terminal2 = new Terminal();
        terminal2.registerDocument(myContract);
        myContract.saveDocument();
        System.out.println("---------------------------------");
        FinancialInvoice myFinance = new FinancialInvoice();
        myFinance.date = "15.07.2021";
        myFinance.documentNum = 6973;
        myFinance.departmentCode = 15324234;
        myFinance.monthlyAmount = "1.004.853 $";
        Terminal terminal3 = new Terminal();
        terminal3.registerDocument(myFinance);
        myFinance.saveDocument();
        System.out.println("---------------------------------");

        myProducts.showInfo();
        System.out.println("---------------------------------");
        myContract.showInfo();
        System.out.println("---------------------------------");
        myFinance.showInfo();
        System.out.println("---------------------------------");
        System.out.println("End");
    }
}
