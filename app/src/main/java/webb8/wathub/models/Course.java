package webb8.wathub.models;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by mismayil on 04/02/16.
 */

@ParseClassName("Course")
public class Course extends ParseObject {

    public String getSubject() {
        return getString("subject");
    }

    public void setSubject(String subject) {
        put("subject", subject);
    }

    public int getNumber() {
        return getInt("number");
    }

    public void setNumber(int number) {
        put("number", number);
    }

    public String getTitle() {
        return getString("title");
    }

    public void setTitle(String title) {
        put("title", title);
    }

    public static ParseQuery<ParseObject> getQuery() {
        return ParseQuery.getQuery("Course");
    }

    public static Course getInstance(ParseObject object) {
        return ParseObject.createWithoutData(Course.class, object.getObjectId());
    }
}
