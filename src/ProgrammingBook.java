public class ProgrammingBook extends Book {
    public String language = "Java";
    public String framework = "abc";

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook() {

    }

    ;

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.framework = framework;
        this.language = language;


    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                super.toString()+
                '}';
    }
}
