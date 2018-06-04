package android.test.base;

import android.os.Bundle;
import android.test.base.data.InTheaters;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.commonlib.base.LazyFragment;
import com.android.commonlib.net.RequestManager;
import com.android.commonlib.net.RequestMap;
import com.android.commonlib.net.response.RequestCallBack;
import com.android.commonlib.utils.L;
import com.google.gson.Gson;

/**
 * Created by yong.liao on 2018/5/24 0024.
 */

public class ShopFragment extends LazyFragment {
    public static final String KEY_TAG = "ShopFragment";

    TextView mTv;

    @Override
    protected View setContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shop, container, false);
    }

    @Override
    public void firstVisible() {
        new RequestManager().doGetRequest(RequestMap.getInTheaters(), new RequestCallBack<InTheaters>() {
            @Override
            public void onSuccess(InTheaters inTheaters) {
                super.onSuccess(inTheaters);
                Gson gson = new Gson();
                mTv.setText(gson.toJson(inTheaters));
            }
        });
    }

    @Override
    protected void onFragmentVisibleChange(boolean isFirstLoad, boolean isVisible) {
        super.onFragmentVisibleChange(isFirstLoad, isVisible);
        L.d("liao", "onFragmentVisibleChange " + isFirstLoad + " : " + isVisible);
    }

    @Override
    public void initView() {
        super.initView();
        mTv = getContentView().findViewById(R.id.tv_shop);
    }
}
