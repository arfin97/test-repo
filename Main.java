
public class Main {
    public static void main(String[] args) {
        PasswordEncryptorV1 encryptorV1 = new PasswordEncryptorV1();
        PasswordEncryptorV2 encryptorV2 = new PasswordEncryptorV2("PQRS", "XYZ");
        User user = new User("Abul", "4945", encryptorV2);
        System.out.println(user);
    }
}

//USER <.encrypt> ENCRYPTOR


//Coding against interface.