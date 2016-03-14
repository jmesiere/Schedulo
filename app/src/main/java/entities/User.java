package entities;

/**
 * Created by Jeremy Mesiere on 14/03/2016.
 */
public class User {
    private String firstName;
    private String name;
    private String email;
    private String username;
    private String password;

    public User(){
        this.firstName="default";
        this.name="default";
        this.email="default";
        this.username="default";
        this.password="default";
    }

    public User(String firstName,String name, String email,String username,String password){
        this.firstName=firstName;
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
