//simple banking application

class Account{
    private int balance;
    
    public void sendMoney(Account sender,Account receiver,int amount){
        int x=checkMoney(amount);
        if(x==1){
            receiver.addMoney(amount);
            sender.subMoney(amount);
            System.out.println("Receiver Balance: ");
            receiver.balanceDisplay();
            System.out.println("Sender Balance: ");
            sender.balanceDisplay();
        }
    }
    public int checkMoney(int amount){
        if(amount<=this.balance){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void addMoney(int amount){
        this.balance+=amount;
    }
    public void subMoney(int amount){
        this.balance-=amount;
    }
    public void balanceDisplay(){
        System.out.println(this.balance);
    }
}

class Transaction{
    public static void main(String args[]){
        Account Adnan=new Account();
        Adnan.addMoney(600);
        Account Sead=new Account();
        Adnan.sendMoney(Adnan,Sead,250);
    }
}