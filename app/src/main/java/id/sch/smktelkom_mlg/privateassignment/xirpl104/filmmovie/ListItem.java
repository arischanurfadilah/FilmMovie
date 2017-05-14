package id.sch.smktelkom_mlg.privateassignment.xirpl104.filmmovie;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by Arischa Nur Fadilah on 11/05/2017.
 */

public class ListItem extends SugarRecord implements Serializable {
    private String imageUri;
    private String head;
    private String desc;


    public ListItem(String imageUri, String head, String desc) {

        this.imageUri = imageUri;
        this.head = head;
        this.desc = desc;

    }

    public String getImageUrl() {
        return imageUri;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}
