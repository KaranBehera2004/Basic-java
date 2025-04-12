public class Payment_Module {
    public static  void payment(String wallettype,int UID)
    {
        System.out.println(wallettype+" "+ UID);
    }
    public static void payment(String cardtype,long cardno,int cvvno)
    {
        System.out.println(cardtype+" "+cardno+" " +cvvno);
    }
    public static void payment(String account_type,String username,String pwd,int account_no)
    {
        System.out.println(account_type+" "+username+" " +pwd+" " +account_no);
    }
        public static void main(String[] args)
        {
            payment("PhonePe",5463);
            payment("Debit Card", 457912513, 456);
            payment("Saving Account" , "Karan@123456" , "@3456", 456789134);
        }
}
