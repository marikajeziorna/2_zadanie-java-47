import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) throws IOException {
        Product[] products = new Product[7];
        FileReader fileReader = new FileReader("product.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (Product product : products) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        
    }

}
