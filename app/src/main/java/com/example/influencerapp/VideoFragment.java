package com.example.influencerapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideoFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private MyAdapter myAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_video,container,false);
        mRecyclerView=rootView.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Model> models=new ArrayList<>();
        Model m1=new Model();
        m1.setEarning("Earnings : Rs. 2500");
        m1.setStatus("Status : Accepted");
        m1.setSubmission("Submitted on 23/03/2020");
        models.add(m1);

        Model m2=new Model();
        m2.setEarning("Earnings : Rs. 4500");
        m2.setStatus("Status : Accepted");
        m2.setSubmission("Submitted on 19/03/2020");
        models.add(m2);

        Model m3=new Model();
        m3.setEarning("Earnings : Rs. 0");
        m3.setStatus("Status : Rejected");
        m3.setSubmission("Submitted on 15/03/2020");
        models.add(m3);

        Model m4=new Model();
        m4.setEarning("Earnings : Rs. 8000");
        m4.setStatus("Status : Accepted");
        m4.setSubmission("Submitted on 9/03/2020");
        models.add(m4);

        Model m5=new Model();
        m5.setEarning("Earnings : Rs. 0");
        m5.setStatus("Status : Rejected");
        m5.setSubmission("Submitted on 23/03/2020");
        models.add(m5);

        Model m6=new Model();
        m6.setEarning("Earnings : Rs. 11500");
        m6.setStatus("Status : Accepted");
        m6.setSubmission("Submitted on 3/03/2020");
        models.add(m6);

        Model m=new Model();
        m.setEarning("Earnings : Rs. 1500");
        m.setStatus("Status : Accepted");
        m.setSubmission("Submitted on 2/02/2020");
        models.add(m);

        myAdapter =new MyAdapter(getContext(),models);
        mRecyclerView.setAdapter(myAdapter);

        return rootView;
    }


}
