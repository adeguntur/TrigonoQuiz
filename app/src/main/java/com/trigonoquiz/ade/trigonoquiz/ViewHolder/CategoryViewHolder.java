package com.trigonoquiz.ade.trigonoquiz.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.trigonoquiz.ade.trigonoquiz.Interface.ItemClickListener;
import com.trigonoquiz.ade.trigonoquiz.R;

/**
 * Created by Ade on 21/02/2018.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView category_name;
    public ImageView category_image;

    private ItemClickListener itemClickListener;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        category_image = (ImageView)itemView.findViewById(R.id.category_image);
        category_name = (TextView)itemView.findViewById(R.id.category_name);

        itemView.setOnClickListener(this);
    }

    public void setCategory_name(TextView category_name) {
        this.category_name = category_name;
    }

    public void setCategory_image(ImageView category_image) {
        this.category_image = category_image;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}
