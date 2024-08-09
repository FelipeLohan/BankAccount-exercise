package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    //Constructor
    public Account(int number, double withdrawLimit, String holder) {
        this.number = number;
        this.withdrawLimit = withdrawLimit;
        this.holder = holder;
        this.balance = 0;
    }

        //Methods
        public void deposit(double amount) {
        setBalance(getBalance() + amount);
        }

        public void withdraw ( double amount){
            if(getBalance() >= amount){
                setBalance(getBalance() - amount);
            }
        }

        //Getters and Setters
        public int getNumber () {
            return number;
        }

        public void setNumber ( int number){
            this.number = number;
        }

        public String getHolder () {
            return holder;
        }

        public void setHolder (String holder){
            this.holder = holder;
        }

        public double getBalance () {
            return balance;
        }

        private void setBalance ( double balance){
            this.balance = balance;
        }

        public double getWithdrawLimit () {
            return withdrawLimit;
        }

        private void setWithdrawLimit ( double withdrawLimit){
            this.withdrawLimit = withdrawLimit;
        }
    }
