package fr.utc.sr03.model;

public class Admin extends User {

    Admin(String firstname, String lastname, String mail, String password){
        super(firstname, lastname, mail, password);
        this.isAdmin = true;
    }
    //TODO : implémenter createUser()
    public void createUser(){

    }
    //TODO : implémenter deleteUser()
    public void deleteUser(){

    }

    //TODO : implémenter getInactiveUsesr()
    public void getInactiveUsers(){

    }

    //TODO : implémenter deleteChat()
    public void deleteChat(){

    }
}