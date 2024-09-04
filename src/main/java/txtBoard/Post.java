package txtBoard;

public class Post {
    private int id;
    private String title;
    private String body;
    private String createDate;

    public Post(int id, String title, String body, String createDate) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createDate = createDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
