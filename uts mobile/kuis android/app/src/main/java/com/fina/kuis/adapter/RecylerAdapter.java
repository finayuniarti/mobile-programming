package com.fina.kuis.adapter;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.fina.kuis.MainActivity;
import com.fina.kuis.R;
import com.fina.kuis.model.DataModel;
import java.util.List;
/**
 * Created by Server on 13/09/2017.
 */
public class RecylerAdapter extends
        RecyclerView.Adapter<RecylerAdapter.MyHolder> {
    List<DataModel> mList ;
    Context ctx;
    public RecylerAdapter(Context ctx, List<DataModel> mList) {
        this.mList = mList;
        this.ctx = ctx;
    }
    @Override
    public RecylerAdapter.MyHolder onCreateViewHolder(ViewGroup
                                                              parent, int viewType) {
        View layout =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutlist,
                        parent, false);
        MyHolder holder = new MyHolder(layout);
        return holder;
    }
    @Override
    public void onBindViewHolder(RecylerAdapter.MyHolder holder,
                                 final int position) {
        holder.nama.setText(mList.get(position).getNama());
        holder.stok.setText(mList.get(position).getStok());
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(ctx,MainActivity.class);
                try {
                    goInput.putExtra("id",
                            mList.get(position).getId());
                    goInput.putExtra("nama",
                            mList.get(position).getNama());
                    goInput.putExtra("stok",
                            mList.get(position).getStok());
                    ctx.startActivity(goInput);
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(ctx, "Error data " +e,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public int getItemCount()
    {
        return mList.size();
    }
    public class MyHolder extends RecyclerView.ViewHolder {
        TextView nama, stok;
        DataModel dataModel;
        public MyHolder(View v)
        {
            super(v);
            nama = (TextView) v.findViewById(R.id.tvNama);
            stok = (TextView) v.findViewById(R.id.tvStok);
        }
    }
}
