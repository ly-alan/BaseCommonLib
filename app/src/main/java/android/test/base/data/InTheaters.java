package android.test.base.data;

import java.util.HashMap;
import java.util.List;

/**
 * Created by yong.liao on 2018/5/28 0028.
 */

public class InTheaters {
    String title;
    int total;
    int start;
    int count;
    List<Movie> subjects;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Movie> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Movie> subjects) {
        this.subjects = subjects;
    }
}
