package condition;

public class Ifelse {
    public static void main(String[] args){
//        boolean isAuthenticated = true;
//
//        if(isAuthenticated)
//            System.out.println("Logged In");
//        else
//            System.out.println("logged Out");

        //Selling price
        float sellingPrice = 1200, costPrice = 1000;
        if(sellingPrice > costPrice)
            System.out.println("profit");
        if(sellingPrice < costPrice)
            System.out.println("loss");
        if(sellingPrice == costPrice)
            System.out.println("non-profit non loss");

    }
}
