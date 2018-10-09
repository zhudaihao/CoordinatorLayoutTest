package test.study.coordinatorlayouttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler_view;
    List<HomeBean> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view,"LHD",Snackbar.LENGTH_LONG)
//                        .setAction("cancel", new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Snackbar.make(view,"Cancel",Snackbar.LENGTH_LONG).show();
//                            }
//                        }).show();
//            }
//        });

        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);
        recycler_view.setHasFixedSize(true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(toolbar);


        HomeBean homeBean1 = new HomeBean("");
        HomeBean homeBean2 = new HomeBean("");
        HomeBean homeBean3 = new HomeBean("");
        HomeBean homeBean4 = new HomeBean("");
        HomeBean homeBean5 = new HomeBean("");

        mList.add(homeBean1);
        mList.add(homeBean2);
        mList.add(homeBean3);
        mList.add(homeBean4);
        mList.add(homeBean5);


        HomeAdapter homeAdapter = new HomeAdapter(mList, this);
        homeAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        homeAdapter.isFirstOnly(false);

        View layout=View.inflate(this,R.layout.main,null);
        setEveryDay(layout);
       homeAdapter.addFooterView(layout);

        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        recycler_view.setAdapter(homeAdapter);



    }

    private RecyclerView  rv_everDay;
    private List<HomeEveryDayBean> everyDayBeanList = new ArrayList<>();
    private HomeEveryDayAdapter homeEveryDayAdapter;

    private void setEveryDay(View headView) {
        rv_everDay = (RecyclerView) headView.findViewById(R.id.rv_everDay);

        //假数据
        HomeEveryDayBean cookBookBean1 = new HomeEveryDayBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1538052349582&di=52c28ecce77e3209b90444d64f2f3e2f&imgtype=0&src=http%3A%2F%2Fuploads.jy135.com%2Fallimg%2F201706%2F18-1F6031GF0.jpg", "测试1");
        HomeEveryDayBean cookBookBean2 = new HomeEveryDayBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1538052349774&di=85f45dbf0b6a095b320e3a986cf4ac48&imgtype=0&src=http%3A%2F%2Fimg.redocn.com%2Fsheying%2F20150210%2Fsucaizijuan_3945508.jpg", "测试2");
        HomeEveryDayBean cookBookBean3 = new HomeEveryDayBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1538052349775&di=12235135a54b53f54846d35d2a423a1c&imgtype=0&src=http%3A%2F%2Fwww.360changshi.com%2Fcp%2Fd%2Ffile%2Fbigpic%2F2016%2F06%2F14%2Fsgyja1o5ofp.jpg", "测试3");

        everyDayBeanList.add(cookBookBean1);
        everyDayBeanList.add(cookBookBean2);
        everyDayBeanList.add(cookBookBean3);

        everyDayBeanList.add(cookBookBean1);
        everyDayBeanList.add(cookBookBean2);
        everyDayBeanList.add(cookBookBean3);


        homeEveryDayAdapter = new HomeEveryDayAdapter(everyDayBeanList, this);
        homeEveryDayAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);

        rv_everDay.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_everDay.setLayoutManager(manager);

        rv_everDay.setAdapter(homeEveryDayAdapter);


    }
}
