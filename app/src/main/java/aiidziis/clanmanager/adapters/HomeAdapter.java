package aiidziis.clanmanager.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

import aiidziis.clanmanager.model.clan.Clan;

/**
 * Created by aigars.cibulskis on 11/17/2016.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private LayoutInflater mLayoutInflater;
    private List<Clan> mClans;
    private AdapterView.OnItemClickListener mListener;


    public HomeAdapter(Context context, List<Clan> clans, AdapterView.OnItemClickListener listener) {
        mLayoutInflater = LayoutInflater.from(context);
        mClans = clans;
        mListener = listener;
    }

    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class HomeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public HomeViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
