import java.io.IOException;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws IOException {

        GetCsvData getCsvData = new GetCsvData("product.csv", ",");
        List<Product> products = getCsvData.getProducts();

        Calculator calculator = new Calculator(products);
        calculator.findExpenciveProduct();
        calculator.totalPriceProducts();

        System.out.print(calculator.findExpenciveProduct().toString());
        System.out.print(calculator.totalPriceProducts());


    }
}
