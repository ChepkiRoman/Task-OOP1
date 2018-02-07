package by.tc.task01.dao.impl;

import by.tc.task01.dao.FileLoader;

import java.io.File;

public class FileLoaderImpl implements FileLoader {
    @Override
    public File loadFile() {
        String FILE_PATH = "/Users/RomanChepki/Downloads/JWD_Task01_OOP-master-2/jwd-task01-template/src/main/resources/appliances_db.txt";
        // ..... а ты с таким хардкодом как-то задумывался, что прогламма может быть запущена, ну, хотя бы на другой машине.......
        File file = new File(FILE_PATH);
        return file;
    }
}
