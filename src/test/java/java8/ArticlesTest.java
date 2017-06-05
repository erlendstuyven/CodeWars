package java8;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ArticlesTest {

    @Test
    public void getTags() throws Exception {
        Article article1 = new Article("Lord of the rings", "Tolkien", Lists.newArrayList("fantasie", "sprookje"));
        Article article2 = new Article("Oorlog", "Hertmans", Lists.newArrayList("drama", "fantasie"));
        Articles articles = new Articles(Lists.newArrayList(article1, article2));

        List<String> tags = articles.getTags();

        assertThat(tags).containsExactly("fantasie", "sprookje", "drama", "fantasie");
    }

    @Test
    public void getUniqueTags() throws Exception {
        Article article1 = new Article("Lord of the rings", "Tolkien", Lists.newArrayList("fantasie", "sprookje"));
        Article article2 = new Article("Oorlog", "Hertmans", Lists.newArrayList("drama", "fantasie"));
        Articles articles = new Articles(Lists.newArrayList(article1, article2));

        Set<String> tags = articles.getUniqueTags();

        assertThat(tags).containsOnly("fantasie", "sprookje", "drama");
    }

    @Test
    public void getAllArticlesWithSameTag() throws Exception {
        Article article1 = new Article("Lord of the rings", "Tolkien", Lists.newArrayList("fantasie", "sprookje"));
        Article article2 = new Article("Dune", "Jozez", Lists.newArrayList("drama", "sf"));
        Article article3 = new Article("Oorlog", "Hertmans", Lists.newArrayList("drama", "fantasie"));
        Articles articles = new Articles(Lists.newArrayList(article1, article2, article3));

        List<Article> result = articles.getArticlesWithTag("fantasie");

        assertThat(result).containsOnly(article1, article3);
    }

    @Test
    public void groupByAuthor() throws Exception {
        Article article1 = new Article("Lord of the rings", "Tolkien", Lists.newArrayList("fantasie", "sprookje"));
        Article article2 = new Article("Dune", "Tolkien", Lists.newArrayList("drama", "sf"));
        Article article3 = new Article("Oorlog1", "Hertmans", Lists.newArrayList("drama", "fantasie"));
        Article article4 = new Article("Oorlog2", "Hertmans", Lists.newArrayList("drama", "fantasie"));
        Article article5 = new Article("Geen Oorlog", "French", Lists.newArrayList("drama", "fantasie"));
        Articles articles = new Articles(Lists.newArrayList(article1, article2, article3, article4, article5));

        Map<String, List<Article>> articlesByAuthor = articles.groupByAuthor();

        assertThat(articlesByAuthor.get("Hertmans")).containsOnly(article3, article4);
    }


}