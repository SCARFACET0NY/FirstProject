package prototype;

import java.util.HashMap;

public class Wikipedia {
    private static HashMap<String, Article> articleMap = new HashMap<>();

    public static Article getArticle(String article) {
        return articleMap.get(article).clone();
    }

    public static void addArticle(Article article) {
        articleMap.put(article.getTitle(), article);
    }

    public static void loadArticles() {
        Article article1 = new WikiArticle("Title 1", "Article 1");
        Article article2 = new WikiArticle("Title 2", "Article 2");
        Article article3 = new WikiArticle("Title 3", "Article 3");

        articleMap.put(article1.getTitle(), article1);
        articleMap.put(article2.getTitle(), article2);
        articleMap.put(article3.getTitle(), article3);
    }
}
