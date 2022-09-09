package com.example.shapesarea2;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.shapesViewHolder> {
    ArrayList<shapes_arr>shapes ;

    public recyclerViewAdapter(ArrayList<shapes_arr> shapes) {
        this.shapes = shapes;
    }

    @NonNull
    @Override
    public shapesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.shape_custom_item,null,false);
        shapesViewHolder viewHolder = new shapesViewHolder(v);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return shapes.size();
    }

    @Override
    public void onBindViewHolder(@NonNull shapesViewHolder holder, int position) {
        shapes_arr sh = shapes.get(position);
        holder.iv_img.setImageResource(sh.getImage());
        holder.tv_name.setText(sh.getName());

    }

    //class for shapes view holder
    class  shapesViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name;
        ImageView iv_img;


        public shapesViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.tv_triangle_name);
            iv_img =itemView.findViewById(R.id.iv_triangle_img);

        }
    }

}
