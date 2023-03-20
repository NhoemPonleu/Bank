

import java.util.*;

class Account{
    int id;
    String ownerName;
    double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }


    //acc id owner balance
    //add acc add edit remove show
    //show account information
    // 1 . descending order by account_id
    // 2.  ascending order by account_id
    // 3. descendinder order by balance
    public static void main(String[] args) {

        int option;
        List<Account> accountList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Add account:");
            System.out.println("2: Remove Account: ");
            System.out.println("3. Edit Account ");
            System.out.println("4. Show account infor");
            System.out.println("5. Exit ");
            System.out.println("Choose option ( 1 - 5 ) : ");
            option  = input.nextInt();
            Account acc = new Account();
            switch (option) {
                case 1:
                    // enter account information
                    // object add list
                    //accountList.add();
                    System.out.println("Enter your account infor");

                    System.out.print("Input ID:");
                    acc.id = input.nextInt();
                    System.out.print("Name:");
                    input.nextLine();
                    acc.ownerName = input.nextLine();
                    System.out.print("Balance:");
                    acc.balance = input.nextInt();

                    accountList.add(acc);
                    //Iterator<String> i = accountList.iterator();

                    break;
                case 2:
                    System.out.println("----------------| Remove element aby id |------------");
                    System.out.print("    Enter the id : ");
                    int rmId = input.nextInt();
                    accountList.removeIf(account -> account.id == rmId);
                    System.out.println("You have removed an element!");
                    break;
                case 3:
                    System.out.println("update Your Account");
                    for (Account accc:accountList){
                        System.out.println("Enter account Id:");
                        int id2= input.nextInt();
                        if (accc.getId()==id2){
                            System.out.println("Enter your account infor");
                            System.out.print("Name:");
                            input.nextLine();
                            acc.ownerName = input.nextLine();
                            System.out.print("Balance:");
                            acc.balance = input.nextInt();
                            accc.setOwnerName(acc.getOwnerName());
                            accc.setBalance(acc.getBalance());

                        }
                        else {
                            System.out.println("Can not Find Id in list="+id2);
                        }
                        break;

                    }
                    break;

                case 4:
                    int showOption;
                    System.out.println("Show account nformation");
                    System.out.println("1. Ascending order (by ID )");
                    System.out.println("2. Descending order (by ID) ");
                    System.out.println("3. Descendig order by balance ");
                                       System.out.println("Choose show option : ");
                    showOption = input.nextInt();
                    switch (showOption) {
                        case 1:
                            for (Account account1 : accountList
                            ) {
                                System.out.println(account1);

                            }
                            break;
                        case 2:
                            accountList.sort((Account o1, Account o2) -> o1.getId() - o2.getId());
                            accountList.forEach((li) -> System.out.println("[Id:\t" + li.getId() +
                                    "  Name:\t" + li.getOwnerName() + "  Balance is:" + li.getBalance() + "]"));
                            break;
                        case 3:
                            accountList.sort((Account o1, Account o2) -> (int) (o1.getBalance() - o2.getBalance()));
                            accountList.forEach((li) -> System.out.println("[Id:\t" + li.getId() +
                                    "  Name:\t" + li.getOwnerName() + "  Balanc1" +
                                    "e is:" + li.getBalance() + "]"));
                            break;
                        case 4:

                    }

                    break;

                case 5 :
                    System.out.println("Exit the program....!");break;

            }
        }while(option  !=5);

    }
}