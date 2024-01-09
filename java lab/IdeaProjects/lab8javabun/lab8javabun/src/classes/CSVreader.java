package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVreader implements Runnable {
    private String filePath;
    private List<CsvData> dataList;

    public CSVreader(String filePath, List<CsvData> dataList) {
        this.filePath = filePath;
        this.dataList = dataList;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                double x = Double.parseDouble(values[0].trim());
                double y = Double.parseDouble(values[1].trim());
                String fruit = values[2].trim();

                CsvData csvData = new CsvData(x, y, fruit);

                synchronized (dataList) {
                    dataList.add(csvData);
                }

                // Simple display
                System.out.println(csvData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Marian\\OneDrive\\Desktop\\lab8javabun\\lab8javabun\\src\\classes\\example_dataset_2.csv";
        List<CsvData> dataList = Collections.synchronizedList(new ArrayList<>());

        Runnable csvReader = new CSVreader(filePath, dataList);
        Thread readerThread = new Thread(csvReader);
        readerThread.start();

        try {
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Collections.sort(dataList);


        for (CsvData data : dataList) {
            System.out.println(data);
        }
    }
}
