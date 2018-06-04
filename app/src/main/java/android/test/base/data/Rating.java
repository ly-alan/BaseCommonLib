package android.test.base.data;

/**
 * 评分
 * Created by yong.liao on 2018/5/28 0028.
 */

public class Rating {
    /**
     *
     */
    int max;
    /**
     *
     */
    int min;
    /**
     *
     */
    float average;
    /**
     *
     */
    String starts;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getStarts() {
        return starts;
    }

    public void setStarts(String starts) {
        this.starts = starts;
    }
}
