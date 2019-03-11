package nl.munitielexicon.munitielexicon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapterHistory extends RecyclerView.Adapter<RecyclerViewAdapterHistory.HistoryViewHolder> {
    private ArrayList<History> histories;
    private Context context;

    public RecyclerViewAdapterHistory(Context context, ArrayList<History> histories) {
        this.histories = histories;
        this.context = context;
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder {
        TextView munafkorting;
        TextView mundefinitie;

        public HistoryViewHolder(View v) {
            super(v);
            munafkorting = (TextView) v.findViewById(R.id.mun_afkorting);
            mundefinitie = (TextView) v.findViewById(R.id.mun_definitie);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    String text = histories.get(position).get_mun_afkorting();

                    Intent intent = new Intent(context, WordMeaningActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("mun_afkorting", text);
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.history_item_layout, parent, false);
        return new HistoryViewHolder(view);


    }

    @Override
    public void onBindViewHolder(HistoryViewHolder holder, final int position) {
        holder.munafkorting.setText(histories.get(position).get_mun_afkorting());
        holder.mundefinitie.setText(histories.get(position).get_mun_definitie());

    }
    @Override
    public int getItemCount() {
        return histories.size();
    }
}

