package test.study.coordinatorlayouttest;

import android.app.Activity;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27.
 */

public class HomeAdapter extends BaseQuickAdapter<HomeBean, BaseViewHolder> {
    private List<HomeBean> mList;
    private Activity activity;

    public void setList(List<HomeBean> mList) {
        this.mList = mList;
        notifyDataSetChanged();
    }

    public HomeAdapter(List<HomeBean> mList, Activity activity) {
        super(R.layout.item_home_capacity, mList);
        this.mList = mList;
        this.activity = activity;
    }


    @Override
    protected void convert(BaseViewHolder helper, HomeBean item) {



    }


}
