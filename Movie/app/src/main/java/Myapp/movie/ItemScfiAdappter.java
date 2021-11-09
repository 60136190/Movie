package Myapp.movie;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemScfiAdappter extends RecyclerView.Adapter<ItemScfiAdappter.ItemViewHolder>{

    private Context mContext;
    private List<ItemScfi> itemScfiList1;

    public ItemScfiAdappter(Context mContext, List<ItemScfi> itemScfiList1) {
        this.mContext = mContext;
        this.itemScfiList1 = itemScfiList1;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemscfi,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        ItemScfi itemScfi = itemScfiList1.get(position);
        if(itemScfi == null){
            return;
        }
        holder.itemImage.setImageResource(itemScfi.getImage());
        holder.itemtxt.setText(itemScfi.getName());
//        holder.itemtxt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               Intent intent1 = new Intent(mContext,DetailActivity.class);
//               mContext.startActivity(intent1);
//            }
//        });


//        holder.tvdetail.setText(itemScfi.getDetail());

        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickgotoDetail(itemScfi);
            }
        });
    }
    private void onClickgotoDetail(ItemScfi itemScfi) {
        Intent intent = new Intent(mContext,DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object",itemScfi);
        intent.putExtras(bundle);
        mContext.startActivity(intent);
    }
    @Override
    public int getItemCount() {

        if(itemScfiList1 != null){
            return itemScfiList1.size();
        }
        return 0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemtxt;

        LinearLayout layoutItem;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layout_item);
            itemImage=itemView.findViewById(R.id.itemImage);
            itemtxt=itemView.findViewById(R.id.itemText);

        }
    }

}
