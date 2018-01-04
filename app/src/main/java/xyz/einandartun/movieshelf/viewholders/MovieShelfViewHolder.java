package xyz.einandartun.movieshelf.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.data.vo.PopularMoviesVO;
import xyz.einandartun.movieshelf.delegates.MovieActionDelegate;

/**
 * Created by einandartun on 12/7/17.
 */

public class MovieShelfViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_movie_title)
    TextView tvMovieTitle;

    @BindView(R.id.tv_movie_category)
    TextView tvMovieCategory;

    @BindView(R.id.iv_movie_img)
    ImageView ivMovieImage;

    @BindView(R.id.tv_vote_average)
    TextView tvVoteAverage;

    private MovieActionDelegate mMovieActionDelegate;

    public MovieShelfViewHolder(View itemView, MovieActionDelegate movieActionDelegate) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mMovieActionDelegate = movieActionDelegate;
    }

    @OnClick(R.id.cv_movies_items_root)
    public void onTapMoviesItem(){
        mMovieActionDelegate.onTapMovieItems();
    }

    public void setMovies(PopularMoviesVO movies){
        tvMovieTitle.setText(movies.getTitle());

        Glide.with(ivMovieImage.getContext())
                .load(movies.getPosterPath())
                .into(ivMovieImage);

        tvVoteAverage.setText(Double.toString(movies.getVoteAverage()));

    }

}
