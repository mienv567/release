package com.fanwe.o2o.adapter;

import java.util.List;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fanwe.library.adapter.SDSimpleAdapter;
import com.fanwe.library.customview.SD2LvCategoryViewHelper.SD2LvCategoryViewHelperAdapterInterface;
import com.fanwe.library.utils.SDResourcesUtil;
import com.fanwe.library.utils.SDViewBinder;
import com.fanwe.library.utils.SDViewUtil;
import com.fanwe.library.utils.ViewHolder;
import com.fanwe.o2o.R;
import com.fanwe.o2o.model.Bcate_listModel;

public class CategoryCateLeftAdapter extends SDSimpleAdapter<Bcate_listModel> implements SD2LvCategoryViewHelperAdapterInterface
{

	private int mDefaultIndex;

	public CategoryCateLeftAdapter(List<Bcate_listModel> listModel, Activity activity)
	{
		super(listModel, activity);
	}

	public void setmDefaultIndex(int rightIndex)
	{
		this.mDefaultIndex = rightIndex;
	}

	@Override
	public int getLayoutId(int position, View convertView, ViewGroup parent)
	{
		return R.layout.item_category_left;
	}

	@Override
	public void bindData(int position, View convertView, ViewGroup parent, Bcate_listModel model)
	{
		View viewSelected = ViewHolder.get(R.id.view_selected, convertView);
		TextView tvTitle = ViewHolder.get(R.id.item_category_left_tv_title, convertView);
//		TextView tvArrowRight = ViewHolder.get(R.id.item_category_left_tv_arrow_right, convertView);

		SDViewBinder.setTextView(tvTitle, model.getName());

		if (model.isSelect())
		{
			convertView.setBackgroundColor(SDResourcesUtil.getColor(R.color.bg_act_fra));
			SDViewUtil.show(viewSelected);
			SDViewUtil.setTextViewColorResId(tvTitle,R.color.main_color);
		} else
		{
			convertView.setBackgroundColor(SDResourcesUtil.getColor(R.color.white));
			SDViewUtil.hide(viewSelected);
			SDViewUtil.setTextViewColorResId(tvTitle,R.color.text_content_deep);
		}
//		if (model.isHasChild())
//		{
//			tvArrowRight.setVisibility(View.VISIBLE);
//		} else
//		{
//			tvArrowRight.setVisibility(View.GONE);
//		}
	}

	@Override
	public void setPositionSelectState(int position, boolean select, boolean notify)
	{
		getItem(position).setSelect(select);
		if (notify)
		{
			notifyDataSetChanged();
		}
	}

	@Override
	public String getTitleNameFromPosition(int position)
	{
		return getItem(position).getName();
	}

	@Override
	public BaseAdapter getAdapter()
	{
		return this;
	}

	@Override
	public Object getSelectModelFromPosition(int position)
	{
		return getItem(position);
	}

	@Override
	public int getTitleIndex()
	{
		return mDefaultIndex;
	}

	@Override
	public Object getRightListModelFromPosition_left(int position)
	{
		return getItem(position).getBcate_type();
	}

	@Override
	public void updateRightListModel_right(Object rightListModel)
	{

	}

	@Override
	public void setPositionSelectState_left(int positionLeft, int positionRight, boolean select)
	{
		List<Bcate_listModel> listRight = getItem(positionLeft).getBcate_type();
		if (listRight != null && positionRight >= 0 && positionRight < listRight.size())
		{
			listRight.get(positionRight).setSelect(select);
		}
	}

}
