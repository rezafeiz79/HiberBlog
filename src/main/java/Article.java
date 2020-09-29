import javax.persistence.*;
import java.util.Set;

@Entity
public class Article {
    @Id @GeneratedValue
    private Integer id;
    private String title;
    private String brief;
    private String content;
    private String createDate;
    private Boolean isPublished;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Category> categories;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Tag> tags;
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public Article(Integer id, String title, String brief, String content, String createDate, Boolean isPublished, Set<Category> categories, Set<Tag> tags, User user) {
        this.id = id;
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.createDate = createDate;
        this.isPublished = isPublished;
        this.categories = categories;
        this.tags = tags;
        this.user = user;
    }

    public Article() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Boolean getPublished() {
        return isPublished;
    }

    public void setPublished(Boolean published) {
        isPublished = published;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
