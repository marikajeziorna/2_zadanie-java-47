import java.util.List;

public class Calculator {
    private List<Product> products;

    public Calculator(List<Product> products) {
        this.products = products;
    }

    public double totalPriceProducts() {
        double price = 0;
        for (int i = 0; i < products.size(); i++) {
            price += products.get(i).getPrice();
        }
        return price;
    }

    public Product findExpenciveProduct() {
        double mostExpensivePrice = 0;
        int mostExpensiveProductIndex = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > mostExpensivePrice) {
            }
            mostExpensivePrice = i;
        }
        return products.get(mostExpensiveProductIndex);
    }

//        public String findRepeatedProducerName (){
//        }
}


