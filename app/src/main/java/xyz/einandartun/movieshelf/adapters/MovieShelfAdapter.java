package xyz.einandartun.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.viewholders.MovieShelfViewHolder;

/**
 * Created by einandartun on 12/7/17.
 */

public class MovieShelfAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewMovieShelf = layoutInflater.inflate(R.layout.movie_shelf,parent,false);
        MovieShelfViewHolder movieShelfViewHolder = new MovieShelfViewHolder(viewMovieShelf);

        return movieShelfViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
