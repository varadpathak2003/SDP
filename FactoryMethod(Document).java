interface Document{
    public void write();
}
class PDF implements Document{
    @Override
    public void write (){
        System.out.println("PDF");
    }
}
class Word implements Document{
    @Override
    public void write (){
        System.out.println("WORD FILE");
    }
}

interface DocumentFactory{
    public Document createDocument();
}
class PDFDocumentFactory implements DocumentFactory{
    public Document createDocument(){
        return new PDF();
    }
}
class WordDocumentFactory implements DocumentFactory{
    public Document createDocument(){
        return new Word();
    }
}
class Main {
    public static void main(String[] args) {
        DocumentFactory factory=new PDFDocumentFactory();
        Document word=factory.createDocument();
        word.write();
        DocumentFactory factory2=new WordDocumentFactory();
        Document pdf=factory2.createDocument();
        pdf.write();
    }
}
