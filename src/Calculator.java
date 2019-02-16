import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) throws IOException {
        Product[] products = new Product[7];
        FileReader fileReader = new FileReader("product.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int producerCount = 0;
        double priceCount = 0;
        double highestPrice = 0;

        String line;
            while ((line = bufferedReader.readLine()) != null) {
//                if( products.length ){
                    priceCount++;

                System.out.println(line);
            }
            bufferedReader.close();
        }

    }

}
