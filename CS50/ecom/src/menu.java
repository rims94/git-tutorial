import java.util.*;
class menu {
    public static void main(String[] args) {
        menu M=new menu();
        productGents gents=new productGents(String productName,int price);
        int option,ex=0;
        do {
            Scanner inp=new Scanner(System.in);
            System.out.println("Enter Your Choice :");
            System.out.println("\n 1. Clothes \n 2. Home Appliances \n 3. Exit");
            option=inp.nextInt();
            switch (option) {
                case 1:
        //            System.out.println("Hi");
                    M.subMenuClothes(option,ex,inp);
                    break;
                case 2:
//                    System.out.println("Hello");
                   M.subMenuHa(option,ex,inp);
                    break;
                case 3:
                    System.exit(0);
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            ex=inp.nextInt();
        } while (ex==1);
    }

    // MENU FOR CLOTHES SECTION

    void subMenuClothes(int option,int ex,Scanner inp) {
        do {
            System.out.println("Enter Your Choice :");
            System.out.println("\n 1. Gents \n 2. Ladies \n 3. Exit");
            option=inp.nextInt();
            switch (option) {
                case 1:
                    System.out.println("this is submenu for Gents");
                    //subMenuClothesGents(option,ex,inp);
                    break;
                case 2:
                    System.out.println("this is submenu for Ladies");
//                  subMenuClothesLadies(option,ex,inp);
                    break;
                case 3:
                    System.exit(0);
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            ex=inp.nextInt();
        } while (ex==1);
    }

    
    // SUB MENU FOR CLOTHES

    //GENTS

        void subMenuClothesGents(int option,int ex,Scanner inp) {
        do {
            System.out.println("Enter Your Choice :");
            System.out.println("\n 1. Products \n 2. Exit");
            option=inp.nextInt();
            switch (option) {
                case 1:
                    System.out.println("this is submenu for gents product list");
                    gents.productGents(productName,price);
                    break;
                case 2:
                    System.exit(0);
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            ex=inp.nextInt();
        } while (ex==1);
    }

    //LADIES

    void subMenuClothesLadies(int option,int ex,Scanner inp) {
        do {
            System.out.println("Enter Your Choice :");
            System.out.println("\n 1. Products \n 2. Exit");
            option=inp.nextInt();
            switch (option) {
                case 1:
                    System.out.println("this is submenu for Ladies product list");
                    //M.subProductLadies(option,ex,inp);
                    break;
                case 2:
                    System.exit(0);
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            ex=inp.nextInt();
        } while (ex==1);
    }


    //MENU FOR HOME APPLIANCES SECTION


    void subMenuHa(int option,int ex,Scanner inp) {
        do {
            System.out.println("Enter Your Choice :");
            System.out.println("\n 1. Mobiles \n 2. Laptops \n 3. Others \n 4. Exit");
            option=inp.nextInt();
            switch (option) {
                case 1:
                    System.out.println("this is submenu for mobiles");
                    //M.subMenuHaMobile(option,ex,inp);
                    break;
                case 2:
                    System.out.println("this is submenu for Laptops");
                    //M.subMenuHaLaptops(option,ex,inp);
                    break;
                case 3:
                    System.out.println("this is submenu for others ha");
                    //M.subMenuHaOthers(option,ex,inp);
                    break;
                case 4:
                    System.exit(0);
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            ex=inp.nextInt();
        } while (ex==1);
    }

    //SUBMENU FOR MOBILE

    void subMenuHaMobile(int option,int ex,Scanner inp) {
        do {
            System.out.println("Enter Your Choice :");
            System.out.println("\n 1. Products \n 2. Exit");
            option=inp.nextInt();
            switch (option) {
                case 1:
                    System.out.println("this is submenu for Mobiles product list");
                    //M.subProductMob(option,ex,inp);
                    break;
                case 2:
                    System.exit(0);
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            ex=inp.nextInt();
        } while (ex==1);
    }

    //SUB MENU FOR LAPTOPS

    void subMenuHaLaptops(int option,int ex,Scanner inp) {
        do {
            System.out.println("Enter Your Choice :");
            System.out.println("\n 1. Products \n 2. Exit");
            option=inp.nextInt();
            switch (option) {
                case 1:
                    System.out.println("this is submenu for Laptops product list");
                    //M.subProductMob(option,ex,inp);
                    break;
                case 2:
                    System.exit(0);
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            ex=inp.nextInt();
        } while (ex==1);
    }

    //SUB MENU FOR OTHER HOME APPLIANCES

    void subMenuHaOthers(int option,int ex,Scanner inp) {
        do {
            System.out.println("Enter Your Choice :");
            System.out.println("\n 1. Products \n 2. Exit");
            option=inp.nextInt();
            switch (option) {
                case 1:
                    System.out.println("this is submenu for others ha product list");
                    //M.subProductOthers(option,ex,inp);
                    break;
                case 2:
                    System.exit(0);
                default:
                System.out.println("Invalid Choice !");
                    break;
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            ex=inp.nextInt();
        } while (ex==1);
    }
}