package com.example.jjh10.searchbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class ListViewAdapter extends BaseAdapter {

	// Declare Variables
	Context mContext;
	LayoutInflater inflater;
	private List<WorldPopulation> worldpopulationlist = null;
	private ArrayList<WorldPopulation> arraylist;

	public ListViewAdapter(Context context, List<WorldPopulation> worldpopulationlist) {
		mContext = context;
		this.worldpopulationlist = worldpopulationlist;
		inflater = LayoutInflater.from(mContext);
		this.arraylist = new ArrayList<WorldPopulation>();
		this.arraylist.addAll(worldpopulationlist);
	}

	public class ViewHolder {
		TextView sort;
		TextView name;
		TextView place;
	}

	@Override
	public int getCount() {
		return worldpopulationlist.size();
	}

	@Override
	public WorldPopulation getItem(int position) {
		return worldpopulationlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(final int position, View view, ViewGroup parent) {
		final ViewHolder holder;
		if (view == null) {
			holder = new ViewHolder();
			view = inflater.inflate(R.layout.listview_item, null);
			// Locate the TextViews in listview_item.xml
			holder.sort = (TextView) view.findViewById(R.id.sort);
			holder.name = (TextView) view.findViewById(R.id.name);
			holder.place = (TextView) view.findViewById(R.id.place);
			view.setTag(holder);
		} else {
			holder = (ViewHolder) view.getTag();
		}
		// Set the results into TextViews
		holder.sort.setText(worldpopulationlist.get(position).getSort());
		holder.name.setText(worldpopulationlist.get(position).getName());
		holder.place.setText(worldpopulationlist.get(position).getPlace());


		// Listen for ListView Item Click
		view.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, SingleItemView.class);
				// Pass all data sort
				intent.putExtra("sort",(worldpopulationlist.get(position).getSort()));
				// Pass all data name
				intent.putExtra("name",(worldpopulationlist.get(position).getName()));
				// Pass all data place
				intent.putExtra("place",(worldpopulationlist.get(position).getPlace()));

				intent.putExtra("address",(worldpopulationlist.get(position).getAddress()));

				intent.putExtra("number",(worldpopulationlist.get(position).getNumber()));

				intent.putExtra("price",(worldpopulationlist.get(position).getPrice()));

				intent.putExtra("price2",(worldpopulationlist.get(position).getPrice2()));

				intent.putExtra("price3",(worldpopulationlist.get(position).getPrice3()));

				intent.putExtra("newprice",(worldpopulationlist.get(position).getNewprice()));



				// Pass all data flag
				// Start SingleItemView Class
				mContext.startActivity(intent);
			}
		});

		return view;
	}

	// Filter Class
	public void filter(String charText) {
		charText = charText.toLowerCase(Locale.getDefault());
		worldpopulationlist.clear();
		if (charText.length() == 0) {
			worldpopulationlist.addAll(arraylist);
		} 
		else 
		{
			for (WorldPopulation wp : arraylist) 
			{
				if (wp.getName().toLowerCase(Locale.getDefault()).contains(charText))
				{
					worldpopulationlist.add(wp);
				}
			}
		}
		notifyDataSetChanged();
	}

}
