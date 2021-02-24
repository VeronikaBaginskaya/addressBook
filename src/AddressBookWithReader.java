import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddressBookWithReader {
    public static void main(String[] args) throws IOException {
        ContactWithReader contactWithReader = new ContactWithReader();
        System.out.println(contactWithReader.name);
        System.out.println(contactWithReader.phone);
        System.out.println(contactWithReader.address);

    }

    public static class ContactWithReader {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        long phone = Long.parseLong(reader.readLine());
        String address = reader.readLine();

        public ContactWithReader() throws IOException {
        }
    }
}

