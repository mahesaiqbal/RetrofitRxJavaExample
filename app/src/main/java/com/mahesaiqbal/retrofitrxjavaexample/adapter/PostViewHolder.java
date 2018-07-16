package com.mahesaiqbal.retrofitrxjavaexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mahesaiqbal.retrofitrxjavaexample.R;

public class PostViewHolder extends RecyclerView.ViewHolder {
    TextView title, content, author;

    public PostViewHolder(View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
        content = itemView.findViewById(R.id.content);
        author = itemView.findViewById(R.id.author);
    }
}
