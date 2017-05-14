package id.sch.smktelkom_mlg.privateassignment.xirpl104.filmmovie;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static id.sch.smktelkom_mlg.privateassignment.xirpl104.filmmovie.R.id.recyclerViewSpecial;

/**
 * A simple {@link Fragment} subclass.
 */
public class SpecialFragment extends Fragment {

    ArrayList<Special> sList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    public SpecialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_special, container, false);

        recyclerView = (RecyclerView) view.findViewById(recyclerViewSpecial);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        sList = new ArrayList<>();

        adapter = new SpecialAdapter(sList, getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);

        sList.addAll(Special.listAll(Special.class));
        adapter.notifyDataSetChanged();

        return view;

    }

}
