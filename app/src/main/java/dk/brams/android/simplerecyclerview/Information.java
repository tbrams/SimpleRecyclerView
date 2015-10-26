package dk.brams.android.simplerecyclerview;

/**
 * Created by tbrams on 26/10/15.
 */
public class Information {
    private int mId;
    private String mTitle;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Information(int id, String title) {
        mId = id;
        mTitle = title;
    }
}
