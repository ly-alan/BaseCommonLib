package android.test.base.data;

import java.util.List;

/**
 * 电影
 * Created by yong.liao on 2018/5/28 0028.
 */

public class Movie {
    /**
     * 条目id
     */
    String id;
    /**
     * 中文名
     */
    String title;
    /**
     * 原名
     */
    String original_title;
    /**
     * 条目URL
     */
    String alt;
    /**
     * 电影海报图
     */
    Images images;
    /**
     * 收藏
     */
    int collect_count;
    /**
     * 分类
     */
    List<String> genres;
    /**
     * 年代
     */
    String year;
    /**
     * 条目分类, "movie"或者"tv"
     */
    String subtype;
    /**
     * 导演
     */
    List<Person> directors;
    /**
     * 演员
     */
    List<Person> casts;
    /**
     * 评分
     */
    Rating rating;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public List<Person> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Person> directors) {
        this.directors = directors;
    }

    public List<Person> getCasts() {
        return casts;
    }

    public void setCasts(List<Person> casts) {
        this.casts = casts;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
