class Customer {
    private final String name;
    private final String contactNumber;

    public Customer(String name, String contactNumber) {
        if (contactNumber.length() != 10) {
            throw new IllegalArgumentException("Contact number must be exactly 10 digits long.");
        }
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
