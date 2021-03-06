package xyz.einandartun.movieshelf.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.einandartun.movieshelf.R;
import xyz.einandartun.movieshelf.adapters.MovieGenreAdapter;
import xyz.einandartun.movieshelf.adapters.MovieReviewsAdapter;
import xyz.einandartun.movieshelf.adapters.MoviesTrailerAdapter;

/**
 * Created by einandartun on 12/12/17.
 */

public class MovieDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_movie_details)
    RecyclerView rvMovieDetails;

    @BindView(R.id.rv_movie_genre)
    RecyclerView rvMovieGenre;

    @BindView(R.id.rv_movie_review)
    RecyclerView rvMovieReview;

    private MoviesTrailerAdapter movieTrailerAdapter;
    private MovieGenreAdapter movieGenreAdapter;
    private MovieReviewsAdapter movieReviewsAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        ButterKnife.bind(this,this);
        movieTrailerAdapter = new MoviesTrailerAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL , false);

        rvMovieDetails.setLayoutManager(linearLayoutManager);

        rvMovieDetails.setAdapter(movieTrailerAdapter);

        movieGenreAdapter = new MovieGenreAdapter();
        LinearLayoutManager linearLayoutManagerGenre = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL , false);
        rvMovieGenre.setLayoutManager(linearLayoutManagerGenre);
        rvMovieGenre.setAdapter(movieGenreAdapter);

        movieReviewsAdapter = new MovieReviewsAdapter();
        LinearLayoutManager linearLayoutManagerReview = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false);
        rvMovieReview.setLayoutManager(linearLayoutManagerReview);
        rvMovieReview.setAdapter(movieReviewsAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
        //return super.onOptionsItemSelected(item);
    }
}
