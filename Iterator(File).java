import java.util.*;
public class Main{
    public static void main(String args[]){
        List <String > files=List.of("hello.txt","hi.txt");
        FileIterator it=new FileIterator(files);
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class FileIterator implements Iterator<String>{
    private  List <String> files;
    private int i=0;
    FileIterator(List <String > files){
        this.files=files;
    }
    public boolean hasNext(){
        return i<files.size();
    }
    public String next(){
        return files.get(i++);
    }
}
