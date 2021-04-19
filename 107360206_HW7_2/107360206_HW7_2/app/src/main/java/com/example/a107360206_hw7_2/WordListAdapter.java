package com.example.a107360206_hw7_2;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {

    private final LinkedList<String> mWordList;
    private final LayoutInflater mInflater;
    private Context main;

    static class WordViewHolder extends RecyclerView.ViewHolder{
            //implements View.OnClickListener {

        public final TextView wordItemView;
        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
            //itemView.setOnClickListener(this);
        }

        /*@Override
        public void onClick(View v) {
            wordItemView.setText ("Clicked! "+ wordItemView.getText());
        }*/
    }

    public WordListAdapter(Context context, LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
        main = context;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView =
                mInflater.inflate(R.layout.wordlist_item,
                        parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        // Retrieve the data for that position
        String mCurrent = mWordList.get(position);
        // Add the data to the view
        holder.wordItemView.setText(mCurrent);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.v("test","click" + position);
                int Recipes_position = position + 1;
                Toast.makeText(main.getApplicationContext(), "Click Recipes" + Recipes_position + "!", Toast.LENGTH_LONG).show();
                if(position == 0){
                    Intent intent = new Intent(main,
                            Recipes1.class);
                    main.startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(main,
                            Recipes2.class);
                    main.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}