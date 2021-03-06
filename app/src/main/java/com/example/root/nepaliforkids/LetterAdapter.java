package com.example.root.nepaliforkids;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.sip.SipSession;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class LetterAdapter extends RecyclerView.Adapter<LetterAdapter.MyViewHolder> {

    private List<ItemModel> itemsList;
    private Context c;


    public LetterAdapter(List<ItemModel> list, Context c) {
        this.itemsList = list;
        this.c = c;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_alphabet_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final ItemModel listItem = (ItemModel) itemsList.get(position);
            switch (position)
            {
                case 1:
                    holder.startingElement.setCardBackgroundColor(Color.parseColor("#607D8B"));
                    holder.middleElement.setCardBackgroundColor(Color.parseColor("#009688"));
                    holder.endElement.setCardBackgroundColor(Color.parseColor("#FF9800"));
                    break;
                case 2:
                    holder.startingElement.setCardBackgroundColor(Color.parseColor("#795548"));
                    holder.middleElement.setCardBackgroundColor(Color.parseColor("#9E9E9E"));
                    holder.endElement.setCardBackgroundColor(Color.parseColor("#FF5722"));
                    break;

                case 3:
                    holder.startingElement.setCardBackgroundColor(Color.parseColor("#000000"));
                    holder.middleElement.setCardBackgroundColor(Color.parseColor("#9C27B0"));
                    holder.endElement.setCardBackgroundColor(Color.parseColor("#F44336"));
                    break;

                case 4:
                    holder.startingElement.setCardBackgroundColor(Color.parseColor("#2196F3"));
                    holder.middleElement.setCardBackgroundColor(Color.parseColor("#009688"));
                    holder.endElement.setCardBackgroundColor(Color.parseColor("#FFC107"));
                    break;

                case 5:
                    holder.startingElement.setCardBackgroundColor(Color.parseColor("#795548"));
                    holder.middleElement.setCardBackgroundColor(Color.parseColor("#9E9E9E"));
                    holder.endElement.setCardBackgroundColor(Color.parseColor("#FF5722"));
                    break;

                case 6:
                    holder.startingElement.setCardBackgroundColor(Color.parseColor("#000000"));
                    holder.middleElement.setCardBackgroundColor(Color.parseColor("#9C27B0"));
                    holder.endElement.setCardBackgroundColor(Color.parseColor("#F44336"));
                    break;

                case 7:
                    holder.startingElement.setCardBackgroundColor(Color.parseColor("#2196F3"));
                    holder.middleElement.setCardBackgroundColor(Color.parseColor("#FF5722"));
                    holder.endElement.setCardBackgroundColor(Color.parseColor("#FFC107"));
                    break;

                    default:
                        break;
            }

            holder.startingText.setText(listItem.getStartingItem());
            holder.middleText.setText(listItem.getMiddleItem());
            holder.endingText.setText(listItem.getEndItem());

            if(listItem.getMiddleItem()=="")
            {
                holder.middleElement.setVisibility(View.INVISIBLE);
            }

            if(listItem.getEndItem()=="")
            {
                holder.endElement.setVisibility(View.INVISIBLE);
            }

            holder.startingElement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(c,EveryLetterActivity.class);
                    intent.putExtra("letterValue",listItem.getStartingItem());
                    c.startActivity(intent);
                }
            });

            holder.middleElement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(c,EveryLetterActivity.class);
                    intent.putExtra("letterValue",listItem.getMiddleItem());
                    c.startActivity(intent);
                }
            });

            holder.endElement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(c,EveryLetterActivity.class);
                    intent.putExtra("letterValue",listItem.getEndItem());
                    c.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView startingText;
        private TextView middleText;
        private TextView endingText;

        private CardView startingElement;
        private CardView middleElement;
        private CardView endElement;

        public MyViewHolder(final View itemView) {
            super(itemView);
            startingText = itemView.findViewById(R.id.StartingElementText);
            middleText = itemView.findViewById(R.id.MiddleElementText);
            endingText = itemView.findViewById(R.id.EndingElementText);

            startingElement= itemView.findViewById(R.id.StartingElement);
            middleElement = itemView.findViewById(R.id.MiddleElement);
            endElement = itemView.findViewById(R.id.EndElement);

        }


    }


}
