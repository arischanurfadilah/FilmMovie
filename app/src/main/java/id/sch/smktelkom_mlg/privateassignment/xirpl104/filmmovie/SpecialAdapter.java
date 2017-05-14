package id.sch.smktelkom_mlg.privateassignment.xirpl104.filmmovie;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Arischa Nur Fadilah on 14/05/2017.
 */

public class SpecialAdapter extends RecyclerView.Adapter<SpecialAdapter.ViewHolder> {
    private final Context context;
    ArrayList<Special> sItem;

    public SpecialAdapter(ArrayList<Special> favouriteItem, Context context){
        this.sItem = favouriteItem;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Special favouriteItem = sItem.get(position);
        holder.textViewHeadfav.setText(favouriteItem.judul);
        holder.textViewDescfav.setText(favouriteItem.deskripsi);
        Glide
                .with(context)
                .load(favouriteItem.urlgambar)
                .into(holder.imageViewOtoffav);
        holder.buttonDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final Special favouriteItem1 = sItem.get(position);
                sItem.remove(position);
                favouriteItem1.delete();
                SpecialAdapter.this.notifyDataSetChanged();

            }
        });
    }

    @Override
    public int getItemCount() {
        return sItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewHeadfav;
        public TextView textViewDescfav;
        public ImageView imageViewOtoffav;
        public Button buttonDelete;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewHeadfav = (TextView) itemView.findViewById(R.id.textViewHeadfav);
            textViewDescfav = (TextView) itemView.findViewById(R.id.textViewDescfav);
            imageViewOtoffav = (ImageView) itemView.findViewById(R.id.imageViewOtoffav);
            buttonDelete = (Button) itemView.findViewById(R.id.buttonDelete);
        }
    }
}
