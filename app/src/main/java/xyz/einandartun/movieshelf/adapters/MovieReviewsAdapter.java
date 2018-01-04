package xyz.einandartun.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.viewholders.ItemMovieReviewViewHolder;

/**
 * Created by einandartun on 12/31/17.
 */

public class MovieReviewsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieReviewItemView = inflater.inflate(R.layout.item_movie_reviews, parent ,false);
        ItemMovieReviewViewHolder itemMovieReviewViewHolder = new ItemMovieReviewViewHolder(movieReviewItemView);
        return itemMovieReviewViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
