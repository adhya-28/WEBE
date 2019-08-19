package com.example.webe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {
    List<Hero> heroList;
    private Context mCtx;


    public HeroAdapter(Context mCtx, List<Hero> heroList) {
        this.heroList=heroList;
        this.mCtx = mCtx;

    }
    public HeroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_heros, null);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HeroViewHolder holder, int position) {

        Hero hero = heroList.get(position);
        holder.textViewTitle.setText(hero.getName());
        holder.realName.setText(hero.getRealname());
        Glide.with(mCtx).load(hero.getImageurl()).into(holder.imageView);



    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    class HeroViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        TextView realName;
        ImageView imageView;
        CardView cardView;

        public HeroViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
realName=itemView.findViewById(R.id.realName);
            imageView = itemView.findViewById(R.id.imageview);
            cardView = itemView.findViewById(R.id.cardview1);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   /* Intent i = new Intent(mCtx,Hero.class);
                    mCtx.startActivity(i);   */
                }
            });
        }

    }
}


