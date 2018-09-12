package vunt.com.vn.viewpagertablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleFragment extends Fragment {
    public static final String ARGUMENT_OBJECT = "object";
    private String[] mTitles = {"A", "B", "C", "D", "E", "F", "G", "h"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample, container, false);
        initRecycler(view);
        return view;
    }

    private void initRecycler(View view) {
        RecyclerView recycler = view.findViewById(R.id.recycler_view);
        SampleAdapter adapter = new SampleAdapter(mTitles);
        recycler.setAdapter(adapter);
    }
}



