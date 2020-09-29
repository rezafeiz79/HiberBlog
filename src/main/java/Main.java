import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User(null, "ali", "0372020471", "23/05/1379", "ali2",
                new Role(null, "Admin"),
                new Address(null, "paeez", "hesabi"));
        Set<Category> categories = new HashSet<Category>();
        categories.add(new Category(null, "cat1", "cat1 des"));
        categories.add(new Category(null, "cat2", "cat2 des"));
        Set<Tag> tags = new HashSet<Tag>();
        tags.add(new Tag(null, "tag1"));
        tags.add(new Tag(null, "tag2"));
        Article article = new Article(null, "Article1", "Article1 brief", "Article1 content", "1399", false, categories, tags, user);
        session.save(article);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
