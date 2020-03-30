package com.example.influencerapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    TextView mEarning,mSubmission,mStatus;
    public MyHolder(@NonNull View itemView) {
        super(itemView);

        mEarning=itemView.findViewById(R.id.earning_tv);
        mStatus=itemView.findViewById(R.id.status_tv);
        mSubmission=itemView.findViewById(R.id.submission_tv);


    }
}
