//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProviderB providerB = new ProviderB();

        providerB.processPayment("Eu", 1245.20);
        providerB.processPayment("US", 6326);
        providerB.processPayment("mxn", 21525);
    }
}