package java8;

import com.google.common.collect.Lists;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class ArticlesTest {

    @Test
    public void getTags() throws Exception {
        Article article1 = new Article("Lord of the rings", "Tolkien", Lists.newArrayList("fantasie", "sprookje"));
        Article article2 = new Article("Oorlog", "Hertmans", Lists.newArrayList("drama", "fantasie"));
        Articles articles = new Articles(Lists.newArrayList(article1, article2));

        List<String> tags = articles.getTags();

        Assertions.assertThat(tags).containsExactly("fantasie", "sprookje", "drama", "fantasie");
    }

    @Test
    public void getUniqueTags() throws Exception {
        Article article1 = new Article("Lord of the rings", "Tolkien", Lists.newArrayList("fantasie", "sprookje"));
        Article article2 = new Article("Oorlog", "Hertmans", Lists.newArrayList("drama", "fantasie"));
        Articles articles = new Articles(Lists.newArrayList(article1, article2));

        Set<String> tags = articles.getUniqueTags();

        Assertions.assertThat(tags).containsOnly("fantasie", "sprookje", "drama");
    }


}