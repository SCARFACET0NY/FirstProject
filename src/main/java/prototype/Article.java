package prototype;

public abstract class Article implements Cloneable {
    private String title;
    private String text;

    Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Article clone() {
        Article clone = null;
        try {
            clone = (Article) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}

