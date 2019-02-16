import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetCsvData {
    private String fileName;
    private String separator;

    public GetCsvData(String fileName, String separator) {
        this.fileName = fileName;
        this.separator = separator;
    }

    public List<Product> getProducts() throws IOException {
        List<Product> products = new ArrayList<Product>();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] dataLine = line.split(separator);
            products.add(new Product(dataLine[0], dataLine[1], Double.valueOf(dataLine[2])));
        }
        return products;

    }

}

