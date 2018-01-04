package xyz.einandartun.movieshelf.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by einandartun on 12/21/17.
 */

public class PopularMoviesVO {
    private int voteCount;
    private int Id;
    private boolean video;
    @SerializedName("vote_average")
    private double voteAverage;
    private String title;
    private double popolarity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private Integer[] genreIds;
    private String backdropPath;
    private boolean adult;
    private String overview;
    private String releaseDate;

    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return Id;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public double getPopolarity() {
        return popolarity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public Integer[] getGenreIds() {
        return genreIds;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
