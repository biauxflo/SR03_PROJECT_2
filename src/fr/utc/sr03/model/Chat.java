package fr.utc.sr03.model;

import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

public class Chat{
    private UUID id;
    private URL link;
    private String title;
    private String description;
    private LocalTime creationDate;
    private LocalTime expirationDate;
    private User creator;
    private ArrayList<User> members;

    Chat(String title, String description, User creator, ArrayList<User> invited, LocalTime expirationDate){
        this.id = UUID.randomUUID();
        //TODO : générer le lien
        this.title   = title;
        this.description = description;
        this.creationDate = LocalTime.now();
        this.expirationDate = expirationDate;
        this.creator = creator;
        this.members = invited;
    }

    public UUID getId(){
        return this.id;
    }

    public URL getLink() {
        return link;
    }

    public LocalTime getCreationDate() {
        return creationDate;
    }

    public LocalTime getExpirationDate() {
        return expirationDate;
    }

    public User getCreator() {
        return creator;
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public void inviteUser(User u){
        //TODO : ajouter
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}