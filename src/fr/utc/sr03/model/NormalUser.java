package fr.utc.sr03.model;

public class NormalUser extends User {

    NormalUser(String firstname, String lastname, String mail, String password){
        super(firstname , lastname , mail , password);
        this.isAdmin = false;
    }

}