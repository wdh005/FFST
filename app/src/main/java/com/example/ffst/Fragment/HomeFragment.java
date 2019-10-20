package com.example.ffst.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ffst.CardItem;
import com.example.ffst.HomeRecyclerAdapter;
import com.example.ffst.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        super.onViewCreated(view,savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.rv_note);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataList.add(new CardItem(i + "번째", "설명" + i,"날짜" + i));
        }
        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(dataList);
        recyclerView.setAdapter(adapter);


        return v;
    }

}
