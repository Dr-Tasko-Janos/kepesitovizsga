package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }

        /*Path directory = Path.of("phonebookOutput");
        try {
            Files.createDirectory(directory);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can't create directory", ioe);
        }
*/
        Path textFile = Path.of(output);

        try (BufferedWriter writer = Files.newBufferedWriter(textFile)) {

            for (Map.Entry item : contacts.entrySet()) {
                writer.write(item.getKey() + ": " + item.getValue() + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not write file", ioe);
        }
    }
}
