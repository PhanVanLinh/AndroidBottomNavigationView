package toong.vn.androidbottomnavigationview.screen.main.search;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import toong.vn.androidbottomnavigationview.R;
import toong.vn.androidbottomnavigationview.base.BaseFragment;

public class SearchFragment extends BaseFragment {

    public static final String TAG = "SearchFragment";

    public static SearchFragment newInstance() {
         Bundle args = new Bundle();
         SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        Log.i(TAG, "onCreateView");
        return view;
    }
}
