package section11_design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        BankAccount newAccount = BankAccount
                .builder()
                .withName("Jon")
                .withAccountNumber("1234567")
                .withEmail("jon@example.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}
