package com.teguholica.samplerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teguholica.samplerecyclerview.models.Post;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView vList = (RecyclerView) findViewById(R.id.list);

        LinearLayoutManager listLayoutManager = new LinearLayoutManager(this);
        vList.setHasFixedSize(true);
        vList.setLayoutManager(listLayoutManager);

        ListAdapter listAdapter = new ListAdapter();
        listAdapter.add("Title 1", "Lorem Ipsum");
        listAdapter.add("Title 2", "Lorem Ipsum");
        listAdapter.add("Title 3", "Lorem Ipsum");
        listAdapter.add("Title 4", "Lorem Ipsum");
        listAdapter.add("Title 5", "Lorem Ipsum");
        listAdapter.add("Title 6", "Lorem Ipsum");
        listAdapter.add("Title 7", "Lorem Ipsum");
        listAdapter.add("Title 8", "Lorem Ipsum");
        listAdapter.add("Title 9", "Lorem Ipsum");
        listAdapter.add("Title 10", "Lorem Ipsum");
        vList.setAdapter(listAdapter);
    }

    private class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

        private ArrayList<Post> posts = new ArrayList<>();

        public void add(String title, String subTitle) {
            posts.add(new Post(title, subTitle));
        }

        @Override
        public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_list_item, parent, false);
            return new ListViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ListViewHolder holder, int position) {
            Post post = posts.get(position);
            holder.txtTitle.setText(post.getTitle());
            holder.txtSubTitle.setText(post.getSubTitle());
        }

        @Override
        public int getItemCount() {
            return posts.size();
        }

        class ListViewHolder extends RecyclerView.ViewHolder {

            TextView txtTitle;
            TextView txtSubTitle;

            public ListViewHolder(View itemView) {
                super(itemView);
                txtTitle = (TextView) itemView.findViewById(R.id.title);
                txtSubTitle = (TextView) itemView.findViewById(R.id.subTitle);
            }
        }

    }
}
