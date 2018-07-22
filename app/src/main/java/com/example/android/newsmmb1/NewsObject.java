package com.example.android.newsmmb1;

import java.util.Date;

/**
 * An {@link NewsObject} object contains information related to a single news.
 */
public class NewsObject {

    /**
     * Title of the news
     */
    private final String newsTitle;

    /**
     * Section name of the news
     */
    private final String newsCategory;

    /**
     * Author name of the news
     */
    private final String newsAuthor;

    /**
     * Publication date of the news
     */
    private final Date newsDate;

    /**
     * Website URL of the news
     */
    private final String newsUrl;

    /**
     * Constructs a new {@link NewsObject} object.
     *
     * @param title           is the title of the news
     * @param section         is the section where the news happened
     * @param authorFullName  is the news author full name
     * @param publicationDate is the news publication date
     * @param url             is the website URL to find more details about the news
     */
    public NewsObject(String title, String section, String authorFullName, Date publicationDate, String url) {
        newsTitle = title;
        newsCategory = section;
        newsAuthor = authorFullName;
        newsDate = publicationDate;
        newsUrl = url;
    }

    /**
     * Returns the magnitude of the news.
     */
    public String getTitle() {
        return newsTitle;
    }

    /**
     * Returns the section name of the news.
     */
    public String getNewsCategory() {
        return newsCategory;
    }

    /**
     * Returns the author of the news.
     */
    public String getNewsAuthor() {
        return newsAuthor;
    }

    /**
     * Returns the publication date of the news.
     */
    public Date getNewsDate() {
        return newsDate;
    }

    /**
     * Returns the Guardian website URL with the article.
     */
    public String getUrl() {
        return newsUrl;
    }
}