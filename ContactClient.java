import java.util.Scanner;

public class ContactClient {
    public static void main(String[] args) {
        IContract contract = new Pernament();
        Scanner sc = new Scanner(System.in);
        String contractid = sc.nextLine();
        String propertyid = sc.nextLine();
        String tenantid = sc.nextLine();
        double amount = sc.nextDouble();
        contract.BuildContractID(contractid);
        contract.BuildPropertyID(propertyid);
        contract.BuildTenant(tenantid);
        contract.RentAmount(amount);
        Contract contractno1 = contract.signContract();
        System.out.println(contractno1  +" "+contract.getClass().getName());
    }
}
