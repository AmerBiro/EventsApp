package com.example.eventsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyEventsAdapter extends RecyclerView.Adapter<MyEventsAdapter.EventsViewHolder> {

    Context context;
    List<MyEvents> myEventsList;

    public MyEventsAdapter(Context context, List<MyEvents> myEvents) {
        this.context = context;
        this.myEventsList = myEvents;
    }

    @NonNull
    @Override
    public EventsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.events_view, parent,false);
        return new EventsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsViewHolder holder, int position) {
        MyEvents myEvents = myEventsList.get(position);
        holder.event_name.setText(myEvents.getEvent_name());
        holder.event_age.setText(myEvents.getEvent_age());
        holder.events_logo.setImageResource(myEvents.getEvent_logo());
    }

    @Override
    public int getItemCount() {
        return myEventsList.size();
    }

    public class EventsViewHolder extends RecyclerView.ViewHolder {

        ImageView events_logo;
        TextView event_name, event_age;

        public EventsViewHolder(@NonNull View itemView) {
            super(itemView);

            events_logo = itemView.findViewById(R.id.id_imageview_logo);
            event_name = itemView.findViewById(R.id.id_textview_Name);
            event_age = itemView.findViewById(R.id.id_textview_Age);
        }
    }
}
