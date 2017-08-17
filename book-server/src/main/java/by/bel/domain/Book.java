package  by.bel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Barys_Shliaha on 03-Mar-17.
 */
@Document
public class Book {

    private String downloadUrl;
    private Boolean downloaded;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Book() {
    }

    @Id
    private String id;

    private String name;
    private String url;
    private List<String> author;
    private Integer year;

    private Integer pages;
    private String language;
    private Float size;
    private String dimensions;
    private List<String> category;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public Book(String name, String url, List<String> author) {
        this.name = name;
        this.url = url;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", author=" + author +
                ", year=" + year +
                ", pages=" + pages +
                ", language='" + language + '\'' +
                ", size=" + size +
                ", dimensions='" + dimensions + '\'' +
                ", category=" + category +
                '}';
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloaded(boolean downloaded) {
        this.downloaded = downloaded;
    }

    public Boolean getDownloaded() {
        return this.downloaded;
    }

    public boolean isDownloaded() {
        return downloaded;
    }
}
