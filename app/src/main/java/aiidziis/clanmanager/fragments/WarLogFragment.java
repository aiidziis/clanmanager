package aiidziis.clanmanager.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import aiidziis.clanmanager.R;
import aiidziis.clanmanager.adapters.WarLogAdapter;
import aiidziis.clanmanager.api.ClansService;
import aiidziis.clanmanager.response.WarLogEntryResponse;
import aiidziis.clanmanager.utils.ServiceGenerator;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by aigars.cibulskis on 9/8/2016.
 */
public class WarLogFragment extends Fragment implements Callback<WarLogEntryResponse> {
    private static final String TAG = WarLogFragment.class.getCanonicalName();
    private static final String WAR_LOG_CLAN_TAG = "war_log_clan_tag";

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private WarLogAdapter mWarLogAdapter;
    private String mClanTag;

    public static WarLogFragment create(String clanTag) {
        WarLogFragment f = new WarLogFragment();
        Bundle args = new Bundle();
        args.putString(WAR_LOG_CLAN_TAG, clanTag);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();

        if (args != null) {
            mClanTag = args.getString(WAR_LOG_CLAN_TAG, "");
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_war_log, container, false);
        ButterKnife.bind(this, v);

        setupRecyclerView();
        getWarLog(mClanTag);

        return v;
    }

    private void getWarLog(String clanTag) {
        ClansService clanService = ServiceGenerator.createService(ClansService.class);
        Call<WarLogEntryResponse> call = clanService.warLogEntryList(clanTag);
        call.enqueue(this);
    }

    private void setupRecyclerView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setHasFixedSize(true);
    }

    @Override
    public void onResponse(Call<WarLogEntryResponse> call, Response<WarLogEntryResponse> response) {
        if (isAdded()) {
            mWarLogAdapter = new WarLogAdapter();
            mRecyclerView.setAdapter(mWarLogAdapter);
        }
    }

    @Override
    public void onFailure(Call<WarLogEntryResponse> call, Throwable t) {
        if (getView() != null)
            Snackbar.make(getView(), t.getMessage(), Snackbar.LENGTH_SHORT).show();
    }
}
