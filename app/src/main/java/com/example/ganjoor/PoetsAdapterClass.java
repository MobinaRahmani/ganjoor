package com.example.ganjoor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ganjoor.Model.poets.Poet;

import java.util.List;

public class PoetsAdapterClass extends RecyclerView.Adapter<PoetsAdapterClass.MyviewHolder> {

    Context context;
    List<Poet> ProductList;
    public PoetsAdapterClass(Context context, List<Poet> ProductList) {
        this.context = context;
        this.ProductList = ProductList;
    }

    @NonNull
    @Override
    public PoetsAdapterClass.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {


        holder.new_product_name.setText(ProductList.get(position).getName());
        holder.new_product_price.setText(" زادگاه :"+ProductList.get(position).getBirthPlace());
        holder.offer_price_discounted_popular.setText(" ولادت :"+ProductList.get(position).getBirthYearInLHijri()+" هجری");
        holder.discount_offer_popular.setText(" وفات :"+ProductList.get(position).getDeathYearInLHijri()+" هجری");
    }


    @Override
    public int getItemCount() {
        return ProductList.size();
    }


    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView new_product_name, new_product_price,offer_price_discounted_popular,discount_offer_popular;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            new_product_name = itemView.findViewById(R.id.textView8);
            new_product_price = itemView.findViewById(R.id.textView9);
            offer_price_discounted_popular = itemView.findViewById(R.id.textView10);
            discount_offer_popular = itemView.findViewById(R.id.textView11);

        }

    }

}
