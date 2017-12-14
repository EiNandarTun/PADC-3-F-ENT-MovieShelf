package xyz.einandartun.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.viewholders.MoviesTrailerViewHolder;

/**
 * Created by einandartun on 12/13/17.
 */

public class MoviesTrailerAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewMoviesTrailer = layoutInflater.inflate(R.layout.item_movies_trailer,parent,false);
        MoviesTrailerViewHolder moviesTrailerViewHolder = new MoviesTrailerViewHolder(viewMoviesTrailer);
        return moviesTrailerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
