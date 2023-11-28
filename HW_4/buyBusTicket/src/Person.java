public class Person {
    private int id;
    private String personName;
    private long cardNumber;
    private long hashPass;
    private String login;

    public Person(int id, String personName, long cardNumber, long hashPass, String login) {
        this.id = id;
        this.personName = personName;
        this.cardNumber = cardNumber;
        this.hashPass = hashPass;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public String getPersonName() {
        return personName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getHashPass() {
        return hashPass;
    }

    public void setHashPass(long hashPass) {
        this.hashPass = hashPass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void authorizationPerson(String personName, String login, long hashPass) {
        // Реализация метода авторизации зарегистрированного пользователя

    }

    public void createPerson(String personName, String login, long hashPass) {
        // Реализация метода добавления нового пользователя
    }

    public void deletePerson(int id) {
        // Реализация метода удаления пользователя
    }

}
