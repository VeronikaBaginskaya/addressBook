public class AddressBookGettersSetters {
    public static void main (String[] args){

        ContactWithGS contact = new ContactWithGS();
        contact.setName("Andre");
        contact.setPhone(223345);
        contact.setAddress("SPB");
        contact.setDel(false);
        System.out.println(contact.name + " " + contact.phone + " " + contact.address + " " + contact.isDel);

        ContactWithGS contact1 = new ContactWithGS();
        contact1.getName();
        contact1.getPhone();
        contact1.getAddress();
        contact1.isDel();

        System.out.println("Copy of contact " + contact.name + " " + contact.phone + " " + contact.address + " " + contact.isDel);




    }

    public static class ContactWithGS{
        String name;
        int phone;
        String address;
        boolean isDel;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public boolean isDel() {
            return isDel;
        }

        public void setDel(boolean del) {
            isDel = del;
        }
    }
}
