class tryecom {
    public static void main(String[] args) {
        tryecom e=new tryecom();
        String[] Products=new String[]{"T-shirt","Jeans","Joggers","Wallet","Watch"};
        int[] Price=new int[]{150,500,200,400,1000};
        int[] Cart=new int[5];
        e.ecommerce(Products,Price,Cart);
    }
    public void ecommerce(String Products[],int Prices[],int Cart[]){
        int option,ex=0;
        /*do {
            Scanner inp=new Scanner(System.in);*/
            for(int i=0;i<5;i++) {
                System.out.println("press "+i+" for " +Products[i]); 
            }

            /*System.out.println("Enter Your Choice :");
            System.out.println("press 1 for T-shirts "
            System.out.println("press ")
            System.out.println("press ")
            System.out.println("press ")    
            System.out.println("press ")
            System.out.println("press ")
            System.out.println("press ")
            option=inp.nextInt();*/
    }
}