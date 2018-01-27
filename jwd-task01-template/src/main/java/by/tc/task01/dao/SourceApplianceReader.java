package by.tc.task01.dao;


import by.tc.task01.dao.impl.FileLoaderImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SourceApplianceReader {

    FileLoaderImpl file = new FileLoaderImpl();
    BufferedReader reader;

    public Boolean readFromFile(String nameAppliance, String request) throws IOException {
        try {

            reader = new BufferedReader(new FileReader(file.loadFile()));
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
