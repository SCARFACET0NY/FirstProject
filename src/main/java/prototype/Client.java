package prototype;

public class Client {
    public static void main(String[] args) {
        Wikipedia.loadArticles();
        Article wikiArticle = Wikipedia.getArticle("Title 2");
        System.out.println(wikiArticle.getText());

        wikiArticle.setText("New text");
        System.out.println(wikiArticle.getText());

        wikiArticle = Wikipedia.getArticle("Title 2");
        System.out.println(wikiArticle.getText());
    }
}
