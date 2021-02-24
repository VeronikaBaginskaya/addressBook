public class AddressBookWithConstructor {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Andre", 876768686, "Saint-P", false);
        Contact contact2 = new Contact("Chubaka", 786887678, "Planet Mars", true);
        System.out.println(contact1.name + " " + contact1.phone + " " + contact1.address + " " + contact1.isDel);
        System.out.println(contact2.name + " " + contact2.phone + " " + contact2.address + " " + contact2.isDel);

    }

    public static class Contact {
        String name;
        int phone;
        String address;
        boolean isDel;

        public Contact(String name, int phone, String address, boolean isDel) {
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.isDel = isDel;
        }
    }
}
