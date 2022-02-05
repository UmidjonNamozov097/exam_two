package com.example.exam_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.exam_recycler.Adapter.AdvertsAdapter;
import com.example.exam_recycler.Adapter.ServicesAdapter_2;
import com.example.exam_recycler.Adapter.TopServicesAdapter;
import com.example.exam_recycler.Model.Adverts;
import com.example.exam_recycler.Model.TopServices;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView advertsRecyclerview, topServicesRecyclerView, services2RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        advertsRecyclerview = findViewById(R.id.advertsRecyclerview);
        advertsRecyclerview.setHasFixedSize(true);
        advertsRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<Adverts> advertsList = new ArrayList<>();
        advertsList.add(new Adverts(R.drawable.img, "Birinchi xizmat uchun 25% chegirma"));
        advertsList.add(new Adverts(R.drawable.img_7, "Kiyimlar uchun 50% lik chegirma"));
        advertsList.add(new Adverts(R.drawable.img_8, "Noutbuklar uchun 30% chegirma"));
        advertsList.add(new Adverts(R.drawable.img_9, "Mevalar uchun 20% chegirma"));
        advertsList.add(new Adverts(R.drawable.img_10, "Internet uchun 50% li chegirma"));
        AdvertsAdapter advertsAdapter = new AdvertsAdapter(advertsList);
        advertsRecyclerview.setAdapter(advertsAdapter);


        topServicesRecyclerView = findViewById(R.id.topServicesRecyclerView);
        topServicesRecyclerView.setHasFixedSize(true);
        topServicesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<TopServices> topServicesList = new ArrayList<>();
        topServicesList.add(new TopServices(R.drawable.beauty, "Beauty"));
        topServicesList.add(new TopServices(R.drawable.car_wash, "Car Wash"));
        topServicesList.add(new TopServices(R.drawable.settings, "Tamirlash"));
        topServicesList.add(new TopServices(R.drawable.home_repair, "Uylarni tamirlash"));
        topServicesList.add(new TopServices(R.drawable.exchange, "Valyuta"));
        topServicesList.add(new TopServices(R.drawable.buy_sell, "Oldi Sotdi"));
        topServicesList.add(new TopServices(R.drawable.house_rent, "Ijara"));
        TopServicesAdapter topServicesAdapter = new TopServicesAdapter(topServicesList);
        topServicesRecyclerView.setAdapter(topServicesAdapter);

        services2RecyclerView = findViewById(R.id.services2RecyclerView);
        services2RecyclerView.setHasFixedSize(true);
        services2RecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.img_1);
        imageList.add(R.drawable.img_2);
        imageList.add(R.drawable.img_3);
        imageList.add(R.drawable.img_4);
        imageList.add(R.drawable.img_5);
        imageList.add(R.drawable.img_6);
        ServicesAdapter_2 servicesAdapter_2 = new ServicesAdapter_2(imageList);
        services2RecyclerView.setAdapter(servicesAdapter_2);
    }
}