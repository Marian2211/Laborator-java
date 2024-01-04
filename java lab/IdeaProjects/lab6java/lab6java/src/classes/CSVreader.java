package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVreader{
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Marian\\OneDrive\\Desktop\\lab6java\\lab6java\\src\\classes\\example_dataset_2.csv";
        List<CsvData> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                CsvData csvData = new CsvData(
                        Double.parseDouble(values[0].trim()),
                        Double.parseDouble(values[1].trim()),
                        values[2].trim()
                );

                dataList.add(csvData);

                //afisare simpla
                System.out.println(csvData);
            }

            //sortare dupa x

           /* Collections.sort(dataList);

            for (CsvData data : dataList) {
                System.out.println(data);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}