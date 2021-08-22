import com.tms.document.ComingProducts;
import com.tms.document.ContractWithEmployee;
import com.tms.document.FinancialInvoice;
import com.tms.terminal.Register;


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
        myProducts.saveDocument();
        Register terminal1 = new Register();
        terminal1.registerDocument(myProducts);
        System.out.println("---------------------------------");
        ContractWithEmployee myContract = new ContractWithEmployee();
        myContract.contractEndDate = "24.08.2022";
        myContract.documentNum = 2314;
        myContract.employeeName = "Святослав";
        myContract.saveDocument();
        Register terminal2 = new Register();
        terminal2.registerDocument(myContract);
        System.out.println("---------------------------------");
        FinancialInvoice myFinance = new FinancialInvoice();
        myFinance.documentNum = 6973;
        myFinance.departmentCode = 15324234;
        myFinance.monthlyAmount = "1.004.853 $";
        myFinance.saveDocument();
        Register terminal3 = new Register();
        terminal3.registerDocument(myFinance);

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
