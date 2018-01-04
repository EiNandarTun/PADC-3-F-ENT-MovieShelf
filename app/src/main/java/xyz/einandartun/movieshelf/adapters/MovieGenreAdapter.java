package xyz.einandartun.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.viewholders.ItemMoviesGenreViewHolder;

/**
 * Created by einandartun on 12/31/17.
 */

public class MovieGenreAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieGenreItemView = inflater.inflate(R.layout.item_movie_genre, parent , false);
        ItemMoviesGenreViewHolder itemMoviesGenreViewHolder = new ItemMoviesGenreViewHolder(movieGenreItemView);
        return itemMoviesGenreViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
