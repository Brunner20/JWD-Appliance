package by.tc.task01.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ApplianceReader {

    public  List<String> readAll(String path) throws IOException {

        List<String> linesOfAppliances = Files.readAllLines(Paths.get(path));
        linesOfAppliances.removeAll(Collections.singleton(""));
        return linesOfAppliances;

    }
}
