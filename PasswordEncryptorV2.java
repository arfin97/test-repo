public class PasswordEncryptorV2 implements PasswordEncryptor{

    private String key1;
    private String key2;

    public PasswordEncryptorV2(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    public String encrypt(String password) {
        return key1 + password + key2;
    }
}
