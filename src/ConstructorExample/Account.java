package ConstructorExample;

class Account {
    String accountNumber;
    double balance;

    Account() {
        this("000-00-0000", 0.0); // 다른 생성자 호출
    }

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("계좌번호: " + accountNumber + ", 잔액: " + balance);
    }
}

