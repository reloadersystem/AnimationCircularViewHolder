package ar.reloadersystem.animationcircularviewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<Lugares> mData;
     private View  viewicon;

    public RecyclerViewAdapter(Context mContext, List<Lugares> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater= LayoutInflater.from(mContext);
        view= mInflater.inflate(R.layout.item_northknow,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.destino.setText(mData.get(position).getTitulo());
        holder.lugares_img.setImageResource(mData.get(position).getPhotoimage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hideIcon();
               // showIcon();

                Intent intent= new Intent(mContext,ResumenTourActivity.class);

                intent.putExtra("titulo", mData.get(position).getTitulo());
                intent.putExtra("descripcion", mData.get(position).getDescripcion());
                intent.putExtra("imagen", mData.get(position).getPhotoimage());
                mContext.startActivity(intent);
            }

            private void hideIcon() {
                viewicon = holder.lugares_img;
                int cx = holder.lugares_img.getWidth() / 2;
                int cy = holder.lugares_img.getHeight() / 2;

                float initialRadius = (float) Math.hypot(cx, cy);

                Animator anim = ViewAnimationUtils.createCircularReveal(viewicon, cx, cy, initialRadius, 0);

                anim.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        viewicon.setVisibility(View.INVISIBLE);
                        viewicon.setVisibility(View.VISIBLE);
                    }
                });
                anim.start();
            }

            private void showIcon(){

                viewicon = holder.lugares_img;

                int cx = holder.lugares_img.getWidth() / 2;
                int cy = holder.lugares_img.getHeight() / 2;

                float finalRadius = (float) Math.hypot(cx, cy);

                Animator anim = ViewAnimationUtils.createCircularReveal(viewicon, cx, cy, 0, finalRadius);
                viewicon.setVisibility(View.VISIBLE);
                anim.start();

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView destino;
        ImageView lugares_img;

        CardView cardView;


        public MyViewHolder(View itemView)
        {
            super(itemView);

            destino=itemView.findViewById(R.id.id_destinoV);
            lugares_img= itemView.findViewById(R.id.id_destinoImg);
            cardView=itemView.findViewById(R.id.cardview_id);

        }

    }





}
