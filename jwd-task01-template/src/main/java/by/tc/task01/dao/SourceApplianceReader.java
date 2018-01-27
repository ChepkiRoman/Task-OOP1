package by.tc.task01.dao;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SourceApplianceReader {
    private String FILE_PATH = "/Users/RomanChepki/Downloads/JWD_Task01_OOP-master-2/jwd-task01-template/src/main/resources/appliances_db.txt";
    File file = new File(FILE_PATH);
    BufferedReader reader;

    public  Boolean readFromFile(String nameAppliance, String request) throws IOException {
        try {

            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(nameAppliance) && line.contains(request)) {
                    return true;
                }
            }


        } finally {
            reader.close();
        }

        return false;
    }
}
