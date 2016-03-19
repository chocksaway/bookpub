package org.test.bookpub.entity;

/**
 * Created by milesd on 19/03/2016.
 */
public class SimpleBook {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    private String name;
    private String authorName;

    public SimpleBook(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }

    public SimpleBook() {
    }


}
