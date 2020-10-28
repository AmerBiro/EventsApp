package com.example.eventsapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.eventsapp.databinding.FragmentMyChatBinding;

import java.util.ArrayList;
import java.util.List;

public class MyChatFragment extends Fragment {
    Button button;

    RecyclerView recyclerView;
    List<MyChatWithPeople> myChatWithPeopleList;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_my_chat, container, false);
            recyclerView = view.findViewById(R.id.rv);

            button = view.findViewById(R.id.creatEvent);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), CreateEvent.class);
                    startActivity(intent);
                }
            });

            myChatWithPeopleList = new ArrayList<>();
            MyChatWithPeople perosn1 = new MyChatWithPeople(R.drawable.event_avatar_01, "Amer", "Hey there", "28/10/2020");
            MyChatWithPeople perosn2 = new MyChatWithPeople(R.drawable.event_avatar_01, "Sulaiman", "Hey there", "28/10/2020");
            MyChatWithPeople perosn3 = new MyChatWithPeople(R.drawable.event_avatar_01, "Jacson", "Hey there", "14/07/2020");
            MyChatWithPeople perosn4 = new MyChatWithPeople(R.drawable.event_avatar_01, "Mario", "Hey there", "23/10/2020");
            MyChatWithPeople perosn5 = new MyChatWithPeople(R.drawable.event_avatar_01, "Zaid", "Hey there", "12/11/2020");
            MyChatWithPeople perosn6 = new MyChatWithPeople(R.drawable.event_avatar_01, "Mony", "Hey there", "26/04/2020");
            MyChatWithPeople perosn7 = new MyChatWithPeople(R.drawable.event_avatar_01, "Pony", "Hey there", "3/03/2020");
            MyChatWithPeople perosn8 = new MyChatWithPeople(R.drawable.event_avatar_01, "Jacbson", "Hey there", "15/12/2018");
            MyChatWithPeople perosn9 = new MyChatWithPeople(R.drawable.event_avatar_01, "Mickel", "Hey there", "17/01/2017");
            MyChatWithPeople perosn10 = new MyChatWithPeople(R.drawable.event_avatar_01, "Henry", "Hey there", "14/09/2017");

            MyChatWithPeople perosn11 = new MyChatWithPeople(R.drawable.event_avatar_01, "Henry", "Hey there", "14/09/2017");
            MyChatWithPeople perosn12 = new MyChatWithPeople(R.drawable.event_avatar_01, "Henry", "Hey there", "14/09/2017");
            MyChatWithPeople perosn13 = new MyChatWithPeople(R.drawable.event_avatar_01, "Henry", "Hey there", "14/09/2017");
            MyChatWithPeople perosn14 = new MyChatWithPeople(R.drawable.event_avatar_01, "Henry", "Hey there", "14/09/2017");

            myChatWithPeopleList.add(perosn1);
            myChatWithPeopleList.add(perosn2);
            myChatWithPeopleList.add(perosn3);
            myChatWithPeopleList.add(perosn4);
            myChatWithPeopleList.add(perosn5);
            myChatWithPeopleList.add(perosn6);
            myChatWithPeopleList.add(perosn7);
            myChatWithPeopleList.add(perosn8);
            myChatWithPeopleList.add(perosn9);
            myChatWithPeopleList.add(perosn10);

            myChatWithPeopleList.add(perosn11);
            myChatWithPeopleList.add(perosn12);
            myChatWithPeopleList.add(perosn13);
            myChatWithPeopleList.add(perosn14);

            MyChatWithPeopleAdapter myChatWithPeopleAdapter = new MyChatWithPeopleAdapter(getActivity(), myChatWithPeopleList);
            recyclerView.setAdapter(myChatWithPeopleAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

            return view;
    }
}