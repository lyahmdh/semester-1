public class DataUser {
    private String[] usernames = {"Jasmine", "Melati", "Bunga"};
    private String[] passwords = {"kasir1", "kasir2", "kasir3"};

    public boolean validasiUser(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return true;
            }
        }
        return false;
    }

    public String[] getUsernames() {
        return usernames;
    }
}
