package com.example.roomdbtutorials.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomdbtutorials.R;
import com.example.roomdbtutorials.notedb.models.Note;

import java.util.ArrayList;

public class NoteAdapter extends  RecyclerView.Adapter<NoteAdapter.viewHolder>{

    ArrayList<Note> list;
    Context context;

    public NoteAdapter(ArrayList<Note> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
            final Note noteModel = list.get(position);
            holder.titleText.setText(noteModel.getTitle());
            holder.descriptionText.setText(noteModel.getContent());

            holder.editBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,noteModel.getTitle() + " is edited",Toast.LENGTH_SHORT);
                }
            });
            holder.deleteBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,noteModel.getTitle() + " is deleted",Toast.LENGTH_SHORT);
                }
            });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class  viewHolder extends RecyclerView.ViewHolder {

        TextView titleText;
        TextView descriptionText;
        Button editBtn;
        Button deleteBtn;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.note_title);
            descriptionText = itemView.findViewById(R.id.note_description);
            editBtn = itemView.findViewById(R.id.btn_edit);
            deleteBtn = itemView.findViewById(R.id.btn_delete);
        }
    }
}
