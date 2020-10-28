package com.example.eventsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyChatWithPeopleAdapter extends RecyclerView.Adapter<MyChatWithPeopleAdapter.MyViewHolderAdapter> {

        Context context;
        List<MyChatWithPeople> myChatWithPeopleList;

        public MyChatWithPeopleAdapter(Context context, List<MyChatWithPeople> myChatWithPeople) {
            this.context = context;
            this.myChatWithPeopleList = myChatWithPeople;
        }

        @NonNull
        @Override
        public MyViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.my_chat_with_people, parent, false);
            return new MyViewHolderAdapter(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolderAdapter holder, final int position) {
            final MyChatWithPeople myChatWithPeople = myChatWithPeopleList.get(position);
            holder.person_name.setText(myChatWithPeople.getName());
            holder.person_last_message.setText(""+ myChatWithPeople.getLastMessage());
            holder.person_last_message_date.setText(""+ myChatWithPeople.getLatMessageDate());
            holder.person_avatar.setImageResource(myChatWithPeople.getAvatar());

        }

        @Override
        public int getItemCount() {
            return myChatWithPeopleList.size();
        }

        public class MyViewHolderAdapter extends RecyclerView.ViewHolder {
            ImageView person_avatar;
            TextView person_name, person_last_message, person_last_message_date;
            ConstraintLayout my_chat_with_people;

            public MyViewHolderAdapter(@NonNull View itemView) {
                super(itemView);
                person_name = itemView.findViewById(R.id.id_person_name);
                person_last_message = itemView.findViewById(R.id.id_person_last_message);
                person_last_message_date = itemView.findViewById(R.id.id_person_message_date);
                person_avatar = itemView.findViewById(R.id.id_person_avatar);
                my_chat_with_people = itemView.findViewById(R.id.my_chat_with_people);
            }
        }
    }
