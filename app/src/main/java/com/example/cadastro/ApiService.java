package com.example.cadastro;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("estudante")
    Call<ResponseBody> cadastrarEstudante(@Body Estudante estudante);
}
