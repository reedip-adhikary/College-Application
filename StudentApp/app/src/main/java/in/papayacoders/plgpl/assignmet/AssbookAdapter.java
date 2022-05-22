package in.papayacoders.plgpl.assignmet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.papayacoders.plgpl.R;

public class AssbookAdapter extends RecyclerView.Adapter<AssbookAdapter.AssbookViewHolder> {

    public class AssbookViewHolder extends RecyclerView.ViewHolder {

        private TextView assbookName;
        private ImageView assbookDownload;

        public AssbookViewHolder(@NonNull View itemView) {
            super(itemView);

            assbookName = itemView.findViewById(R.id.assbookName);
            assbookDownload = itemView.findViewById(R.id.assbookDownload);
        }
    }

    private Context context;
    private List<AssbookData> list;

    public AssbookAdapter(Context context, List<AssbookData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AssbookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.assignment_item_layout, parent, false);
        return new AssbookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssbookViewHolder holder, final int position) {

        holder.assbookName.setText(list.get(position).getPdfTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PdfViewerActivity.class);
                intent.putExtra("pdfUrl",list.get(position).getPdfUrl());
                context.startActivity(intent);
            }
        });

        holder.assbookDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(list.get(position).getPdfUrl()));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void Filteredlist(ArrayList<AssbookData> filterlist) {
        list = filterlist;
        notifyDataSetChanged();
    }
}
