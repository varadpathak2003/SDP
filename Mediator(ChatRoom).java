import java.util.*;
class Main{
    public static void main(String args[]){
        ChatRoom room=new ChatRoom();
        Col member1=new Col("Raj");
        Col member2=new Col("Rahul");
        Col member3=new Col("Rohit");
        room.registerMember(member1);
        room.registerMember(member2);
        room.registerMember(member3);
        room.sendMessage("Hello ","Rahul",member1);
        room.sendMessage("Hello ","Raj",member2);
    }
}

class Col{
    String name;
    Col (String name){
        this.name=name;
    }
    public void receive(String message){
        System.out.println("Message : "+message);
    }
}
class ChatRoom{
    String name;
    Map <String,Col>  members;
    ChatRoom(){
        this.members=new HashMap<>();
    }
    public void registerMember(Col member){
        members.put(member.name,member);
    }
    public void sendMessage(String message,String to,Col sendFrom){
        Col sendTo=members.get(to);
        System.out.println("Sending Message from : "+sendFrom.name);
        sendTo.receive(message);
    }
}
