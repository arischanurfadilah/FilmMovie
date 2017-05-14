package id.sch.smktelkom_mlg.privateassignment.xirpl104.filmmovie;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by Arischa Nur Fadilah on 14/05/2017.
 */

public class Special extends SugarRecord implements Serializable
{
            public String judul;
            public String deskripsi;
            public String urlgambar;

            public Special()
            {
            }

            public Special(String judul, String deskripsi, String urlgambar)
            {
                this.judul = judul;
                this.deskripsi = deskripsi;
                this.urlgambar = urlgambar;
            }
}
