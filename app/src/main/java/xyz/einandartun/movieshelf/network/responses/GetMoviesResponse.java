package xyz.einandartun.movieshelf.network.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import xyz.einandartun.movieshelf.data.vo.PopularMoviesVO;

/**
 * Created by einandartun on 1/4/18.
 */

public class GetMoviesResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;

    @SerializedName("popular-movies")
    private List<PopularMoviesVO> popularMovie;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<PopularMoviesVO> getPopularMovie() {
        return popularMovie;
    }
}
