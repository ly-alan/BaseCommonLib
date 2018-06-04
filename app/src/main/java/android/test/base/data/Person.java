package android.test.base.data;

/**
 * 人物
 * Created by yong.liao on 2018/5/28 0028.
 */

public class Person {
    /**
     * 连接
     */
    String alt;
    /**
     * 头像
     */
    Images avatars;
    /**
     * 名称
     */
    String name;
    /**
     * id
     */
    String id;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Images getAvatars() {
        return avatars;
    }

    public void setAvatars(Images avatars) {
        this.avatars = avatars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
