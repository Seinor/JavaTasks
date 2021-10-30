package task_1.book;

public class Book {
    private String authtorName, name;

    public Book(String n, String auth) {
        authtorName = auth;
        name = n;

    }
    public Book(){
        authtorName = "*Empty*";
        name = "*Empty*";

    }
    public Book(String auth){
        authtorName = auth;
        name = "*Empty*";

    }

    public void setAuthor(String authtorName) {
        this.authtorName = authtorName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName () {
        return  name;
    }

    public String getAuthor() {
        return  authtorName;
    }

    public String toString() {
        return this.authtorName+", "+this.name;
    }


}
