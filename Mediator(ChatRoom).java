import java.util.*;
class Main{
    public static void main(String args[]){
        ChatRoom room=new ChatRoom();
        Col member1=new Col("Raj",room);
        Col member2=new Col("Rahul",room);
        Col member3=new Col("Rohit",room);
        room.registerMember(member1);
        room.registerMember(member2);
        room.registerMember(member3);
        room.sendMessage("Hello ","Rahul",member1);
        room.sendMessage("Hello ","Raj",member2);
    }
}
class Col{
    String name;
    ChatRoom room;
    Col (String name,ChatRoom room){
        this.name=name;
        this.room=room;
    }
    void sendMessage(String message,String to){
        room.sendMessage(message,to,this);
    }
    void receive(String message){
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
        sendTo.receive(message);
    }
}
