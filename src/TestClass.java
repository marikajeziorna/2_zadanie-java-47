import java.io.IOException;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws IOException {

        GetCsvData getCsvData = new GetCsvData("product.csv", ";");
        List<Product> products = getCsvData.getProducts();

        Calculator calculator = new Calculator(products);
        System.out.print("The most expensive product: " + calculator.findExpenciveProduct().toString());
        System.out.print("Total price for all products: " + calculator.totalPriceProducts());
    }
}
