package aiidziis.clanmanager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

import aiidziis.clanmanager.R;
import aiidziis.clanmanager.adapters.HomeAdapter;
import aiidziis.clanmanager.model.clan.Clan;
import aiidziis.clanmanager.presenter.HomePresenter;
import aiidziis.clanmanager.response.ClanResponse;
import butterknife.BindView;
import butterknife.ButterKnife;
import nucleus.factory.RequiresPresenter;
import nucleus.view.NucleusSupportFragment;

/**
 * HomeFragment.class for application that shows main fragment.
 * Created by aigars.cibulskis on 11/15/2016.
 */
@RequiresPresenter(HomePresenter.class)
public class HomeFragment extends NucleusSupportFragment<HomePresenter> implements AdapterView.OnItemClickListener {

    @BindView(R.id.top_clans_recycler_view)
    RecyclerView mTopClansRecyclerView;

    @BindView(R.id.favorite_clans_recycler_view)
    RecyclerView mFavoriteRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_layout, container, false);

        ButterKnife.bind(this, v);

        if (savedInstanceState == null) {
            //Request top clans;
            getPresenter();
        }

        return v;
    }

    public void onItemNext(List<Clan> items) {
        mTopClansRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mTopClansRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        mTopClansRecyclerView.setAdapter(new HomeAdapter(getContext(), items, this));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
