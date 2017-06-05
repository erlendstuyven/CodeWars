package java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Articles {

    private final List<Article> articles;

    public Articles(List<Article> articles) {
        this.articles = articles;
    }

    public List<String> getTags() {
        return articles.stream()
                .flatMap(article -> article.getTags().stream())
                .collect(Collectors.toList());
    }
    public Set<String> getUniqueTags() {
        return articles.stream()
                .flatMap(article -> article.getTags().stream())
                .collect(Collectors.toSet());
    }

    public List<Article> getArticlesWithTag(String tag) {
        return articles.stream()
                .filter(article -> article.getTags().contains(tag))
                .collect(Collectors.toList());
    }

    public Map<String, List<Article>> groupByAuthor() {
        return articles.stream()
                .collect(Collectors.groupingBy(article -> article.getAuthor()));
    }
}