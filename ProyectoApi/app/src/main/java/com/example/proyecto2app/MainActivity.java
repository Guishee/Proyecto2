package com.example.proyecto2app;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    ArrayList<Grupos> grups;
    RecyclerView recycler;

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.recyclerView);

        tv=findViewById(R.id.texto);
//inicio
        GrupoService grupoService = ApiClient.getGrupoService();
        Call<List<Grupos>> call = grupoService.getGrupos();

        call.enqueue(new Callback<List<Grupos>>() {
            @Override
            public void onResponse(Call<List<Grupos>> call, Response<List<Grupos>> response) {
                if (response.isSuccessful()) {
                    List<Grupos> grupos = response.body();

                    //bucle para pillar los datos
                    for (Grupos grupo : grupos) {
                        grupo.toString();//acabar luego
                    }
                    //saca los datos por pantalla o...



                } else {
                    System.out.println("response no es succesful");
                }
            }


            @Override
            public void onFailure(Call<List<Grupos>> call, Throwable t) {
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });


//final
    }




}