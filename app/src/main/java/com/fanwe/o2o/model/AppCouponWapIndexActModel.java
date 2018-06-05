package com.fanwe.o2o.model;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */

public class AppCouponWapIndexActModel extends BaseActModel
{
    private int city_id; // 当前城市ID
    private int area_id;// 当前大区ID
    private int quan_id;// 当前商圈ID
    private int cate_id;// 当前大分类ID
    private PageModel page;
    private List<YouhuiModel> item;
    private List<Bcate_listModel> bcate_list;
    private List<Quan_listModel> quan_list;
    private List<CategoryOrderModel> navs;

    public List<CategoryOrderModel> getNavs()
    {
        return navs;
    }

    public void setNavs(List<CategoryOrderModel> navs)
    {
        this.navs = navs;
    }

    public int getCity_id()
    {
        return city_id;
    }

    public void setCity_id(int city_id)
    {
        this.city_id = city_id;
    }

    public int getArea_id()
    {
        return area_id;
    }

    public void setArea_id(int area_id)
    {
        this.area_id = area_id;
    }

    public int getQuan_id()
    {
        return quan_id;
    }

    public void setQuan_id(int quan_id)
    {
        this.quan_id = quan_id;
    }

    public int getCate_id()
    {
        return cate_id;
    }

    public void setCate_id(int cate_id)
    {
        this.cate_id = cate_id;
    }

    public List<Bcate_listModel> getBcate_list()
    {
        return bcate_list;
    }

    public void setBcate_list(List<Bcate_listModel> bcate_list)
    {
        this.bcate_list = bcate_list;
    }

    public List<Quan_listModel> getQuan_list()
    {
        return quan_list;
    }

    public void setQuan_list(List<Quan_listModel> quan_list)
    {
        this.quan_list = quan_list;
    }

    public List<YouhuiModel> getItem()
    {
        return item;
    }

    public void setItem(List<YouhuiModel> item)
    {
        this.item = item;
    }

    public PageModel getPage()
    {
        return page;
    }

    public void setPage(PageModel page)
    {
        this.page = page;
    }
}
