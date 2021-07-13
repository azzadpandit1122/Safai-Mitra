package com.example.safai_mitra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Lager_Fragment extends Fragment {
    LinearLayoutManager layoutManager;
    RecyclerView recyclerView, recyclerViewAdvTable;
    Adapter adapter;
    ArrayList<itemModel> arrayList;
    ArrayList<itemModel> arrayListadvTable;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lager_, container, false);
        recyclerView = view.findViewById(R.id.rv);
        recyclerViewAdvTable = view.findViewById(R.id.advtable);


        arrayList = new ArrayList<>();

        itemModel itemModel = new itemModel();
        itemModel.setName("WellMax stifan");
        itemModel.setImage(R.drawable.c);
        itemModel.setProfileIcon(R.drawable.linkedin);
        itemModel.setLocation("India");
        itemModel.setDecription("jhsdf sdkjkfsd dskkjf fhf dhd ");

        itemModel itemMode1 = new itemModel();
        itemMode1.setName("Jitu");
        itemMode1.setImage(R.drawable.f);
        itemMode1.setProfileIcon(R.drawable.facebook);
        itemMode1.setLocation("India");
        itemMode1.setDecription("aajhsdf sdkjkfsd dskkjf fhf dhd ");

        itemModel itemMode2 = new itemModel();
        itemMode2.setName("Raju");
        itemMode2.setImage(R.drawable.c);
        itemMode2.setProfileIcon(R.drawable.instagram);
        itemMode2.setLocation("Chaina");
        itemMode2.setDecription("sfdsdjhsdf sdkjkfsd dskkjf fhf dhd ");

        itemModel itemMode3 = new itemModel();
        itemMode3.setName("Geeta");
        itemMode3.setImage(R.drawable.f);
        itemMode3.setProfileIcon(R.drawable.linkedin);
        itemMode3.setLocation("India");
        itemMode3.setDecription("dsfdsjhsdf sdkjkfsd dskkjhgfdjf fhf dhd ");

        itemModel itemMode4 = new itemModel();
        itemMode4.setName("Sunil");
        itemMode4.setImage(R.drawable.f);
        itemMode4.setProfileIcon(R.drawable.linkedin);
        itemMode4.setLocation("India");
        itemMode4.setDecription("dsfdsjhsdf sdkjkfsd dskkjhgfdjf fhf dhd ");

        arrayList.add(itemModel);
        arrayList.add(itemMode1);
        arrayList.add(itemMode2);
        arrayList.add(itemMode3);
        arrayList.add(itemMode4);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(getContext(), arrayList);
        recyclerView.setAdapter(adapter);

        arrayListadvTable = new ArrayList<>();
        itemModel itemModelAdvTable = new itemModel();
        itemModelAdvTable.setProductname("Incredble Frozen Pizza");
        itemModelAdvTable.setPrice("127.00");
        itemModelAdvTable.setData("12/07/2021");

        itemModel itemModelAdvTable1 = new itemModel();
        itemModelAdvTable1.setProductname("Small Metal tuan");
        itemModelAdvTable1.setPrice("129.00");
        itemModelAdvTable1.setData("22/07/2021");

        itemModel itemModelAdvTable2 = new itemModel();
        itemModelAdvTable2.setProductname("Gorgeous Woorden Soap");
        itemModelAdvTable2.setPrice("129.00");
        itemModelAdvTable2.setData("19/07/2021");


        layoutManager = new LinearLayoutManager(getContext());
        recyclerViewAdvTable.setLayoutManager(layoutManager);
        recyclerViewAdvTable.setHasFixedSize(true);
        AdapterAdvTable AdapterAdvTable = new AdapterAdvTable(getContext(), arrayListadvTable);
        recyclerViewAdvTable.setAdapter(AdapterAdvTable);

        arrayListadvTable.add(itemModelAdvTable);
        arrayListadvTable.add(itemModelAdvTable);
        arrayListadvTable.add(itemModelAdvTable1);
        arrayListadvTable.add(itemModelAdvTable2);

        return view;
    }
}