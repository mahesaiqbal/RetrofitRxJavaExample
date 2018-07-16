package com.mahesaiqbal.retrofitrxjavaexample.retrofit;

import com.mahesaiqbal.retrofitrxjavaexample.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
