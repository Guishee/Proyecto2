package com.example.proyecto2app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GrupoService {
    @GET("apibalmes/grups")
    Call<List<Grupos>> getGrupos();
}
