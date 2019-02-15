
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProductsList {
    public static void main(String[] args) throws IOException {
        Product[] products = new Product[7];
        products[0] = new Product("Mleko", "Mlekpol", 3.5);
        products[1] = new Product("Jogurt", "Bakoma", 2.4);
        products[2] = new Product("Maślanka", "Jan", 2.8);
        products[3] = new Product("SerZółty", "Mlekowita", 4.2);
        products[4] = new Product("SerKozi", "Mlekovita", 7.2);
        products[5] = new Product("SerTopiony", "Hochland", 2.8);
        products[6] = new Product("SerFeta", "Mlekovita", 3.2);

        FileWriter fileWriter = new FileWriter("product.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < products.length; i++) {
            bufferedWriter.write(products[i].toString());
        }bufferedWriter.close();
    }
}
