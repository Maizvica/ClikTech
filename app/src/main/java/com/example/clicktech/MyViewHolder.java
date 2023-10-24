package com.example.clicktech;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nomeView, valorView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById((R.id.imageview));
        nomeView = itemView.findViewById(R.id.nome);
        valorView = itemView.findViewById(R.id.valor);
    }
}
