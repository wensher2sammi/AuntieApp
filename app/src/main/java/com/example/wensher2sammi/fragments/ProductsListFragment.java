package com.example.wensher2sammi.fragments;

/**
 * Created by wensher2sammi on 10/13/2016.
 */

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.wensher2sammi.auntieapp.MainPage;
import com.example.wensher2sammi.auntieapp.R;

public class ProductsListFragment extends Fragment {
    private ListView listview;
    MainPage mainActivity;
    private String productCategory;

    ProgressDialog progressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainPage) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater
                .inflate(R.layout.productlist, container, false);
        productCategory = mainActivity.getProducts_category();

        listview = (ListView) rootView.findViewById(R.id.products_listview);

        mainActivity.getSupportActionBar().setTitle(productCategory);
        // selecting single ListView item
        ListView lv = listview;
        // listening to single listitem click
        lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            }
        });
        return rootView;
    }

    private boolean isProductlistRetrieved = false;

    public boolean isProductlistRetrieved() {
        return isProductlistRetrieved;
    }

    public void setProductlistRetrieved(boolean isProductlistRetrieved) {
        this.isProductlistRetrieved = isProductlistRetrieved;
    }

}
