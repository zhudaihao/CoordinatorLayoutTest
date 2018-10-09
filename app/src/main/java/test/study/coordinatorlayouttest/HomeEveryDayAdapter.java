package test.study.coordinatorlayouttest;

import android.app.Activity;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;



/**
 * Created by Administrator on 2018/9/27.
 */

public class HomeEveryDayAdapter extends BaseQuickAdapter<HomeEveryDayBean, BaseViewHolder> {
    private List<HomeEveryDayBean> mList;
    private Activity activity;

    public void setList(List<HomeEveryDayBean> mList) {
        this.mList = mList;
        notifyDataSetChanged();
    }

    public HomeEveryDayAdapter(List<HomeEveryDayBean> mList, Activity activity) {
        super(R.layout.item_home_everyday, mList);
        this.mList = mList;
        this.activity = activity;
    }


    @Override
    protected void convert(BaseViewHolder helper, HomeEveryDayBean item) {

    }


}
