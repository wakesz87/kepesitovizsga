package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class PhoneBook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null ||output == null) {
            throw new IllegalArgumentException();
        }

        try {
            FileWriter writer = new FileWriter(output);
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }writer.close();

        } catch (IOException ioe) {
            throw new IllegalStateException("Can't write file" , ioe);
        }
    }

}
