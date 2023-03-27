package fr.utc.sr03.model;

import java.util.List;
import java.util.UUID;

public abstract class User{

    private UUID id ;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password ;
    private List<Chat> invitedChats;
    private List<Chat> createdChat;
    protected boolean isAdmin;
    private boolean isActive;

    protected User(String firstName, String lastName, String eMail, String password){
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;
    }
    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Chat> getInvitedChats() {
        return invitedChats;
    }

    public void setInvitedChats(List<Chat> invitedChats) {
        this.invitedChats = invitedChats;
    }

    public void addInvitedChat(Chat newChat){
        this.invitedChats.add(newChat);
    }

    public List<Chat> getCreatedChat() {
        return createdChat;
    }

    public void setCreatedChat(List<Chat> createdChat) {
        this.createdChat = createdChat;
    }

    public void addCreatedChat(Chat newChat){
        this.createdChat.add(newChat);
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    //TODO : implémenter createChat()
    public void createChat(){

    }
    //TODO : implémenter modifyChat()
    public void modifyChat(){

    }
    //TODO : implémenter deleteChat()
    public void deleteChat(){

    }
    //TODO : implémenter joinChat()
    public void joinChat(){

    }
    //TODO : implémenter sendMessage()
    public void sendMessage(){

    }

}