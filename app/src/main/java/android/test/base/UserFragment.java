package android.test.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.commonlib.base.BaseFragment;

/**
 * Created by yong.liao on 2018/5/24 0024.
 */

public class UserFragment extends BaseFragment {
    public static final String KEY_TAG = "UserFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user,container,false);
    }

    @Override
    public void initView() {
        super.initView();
    }

    @Override
    public void setView() {
        super.setView();
    }

    @Override
    public void setListener() {
        super.setListener();
    }
}
