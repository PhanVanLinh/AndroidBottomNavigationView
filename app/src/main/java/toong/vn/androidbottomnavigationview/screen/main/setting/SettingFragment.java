package toong.vn.androidbottomnavigationview.screen.main.setting;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import toong.vn.androidbottomnavigationview.R;
import toong.vn.androidbottomnavigationview.base.BaseFragment;

public class SettingFragment extends BaseFragment {

    public static final String TAG = "SettingFragment";

    public static SettingFragment newInstance() {
         Bundle args = new Bundle();
         SettingFragment fragment = new SettingFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        Log.i(TAG, "onCreateView");
        return view;
    }
}
