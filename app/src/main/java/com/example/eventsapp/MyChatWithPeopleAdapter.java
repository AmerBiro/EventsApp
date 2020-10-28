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

//    String playerName[];
//    int images[], playerAge[], playerScore[];
//    public RecyclerViewAdapter(Context context, String playerName[], int playerAge[], int playerScore[], int images[]) {
//        this.context = context;
//        this.playerName = playerName;
//        this.playerAge = playerAge;
//        this.playerScore = playerScore;
//        this.images = images;
//    }

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

//            holder.my_chat_with_people.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(context, ChildPlayerView.class);
//                    intent.putExtra("childPlayerIcon", player.playerIcon);
//                    intent.putExtra("childPlayerScore", player.playerScore);
//                    intent.putExtra("childPlayerAge", player.playerAge);
//                    intent.putExtra("childPlayerName", player.playerName);
//                    context.startActivity(intent);
//                }
//            });


//        holder.playerScore.setText("" + playerScore[position]);
//        holder.playerAge.setText("" + playerAge[position]);
//        holder.playerName.setText(playerName[position]);
//        holder.playerIcon.setImageResource(images[position]);
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
