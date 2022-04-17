package section11_design_patterns.builder;

public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.name = bankAccountBuilder.name;
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.email = bankAccountBuilder.email;
        this.newsletter = bankAccountBuilder.newsletter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    // constructors/getters

    public static BankAccountBuilder builder() {
        return new BankAccountBuilder();
    }

    public static class BankAccountBuilder {

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        private BankAccountBuilder() {

        }

        public BankAccountBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BankAccountBuilder withAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
