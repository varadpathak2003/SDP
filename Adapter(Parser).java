//Target Interface
interface newParser{
    void parse(String parser,String Document);
}
//Adaptee
class XMLParser{
    String document;
    XMLParser(String document){
        this.document=document;
    }
    void parse(){
        System.out.println("Document  " + document+ "has been parsed");
    }
}

//Adapter
class JSONProcessorAdapter implements newParser{
    @Override
    public void parse(String parser,String document){
        String doc="Parser Type : "+parser+" document: " +document;
        XMLParser p=new XMLParser(doc);
        p.parse();
    }
}

public class Main {
    public static void main(String[] args) {
       JSONProcessorAdapter adapter =new JSONProcessorAdapter();
        adapter.parse("JSON","Hello.txt");
    }
}
