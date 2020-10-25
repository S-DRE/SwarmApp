package pmdm.swarmteam.swarm_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayAdapterNoticia extends ArrayAdapter<Noticia> {

    private final int resource;

    public ArrayAdapterNoticia(@NonNull Context context, @NonNull Noticia[] objects) {
        super(context, R.layout.item_noticias, objects);
        resource = R.layout.item_noticias;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View fila = inflater.inflate(resource, null);

        ImageView ivFotoNoticia = (ImageView) fila.findViewById(R.id.ivFotoNoticia);
        TextView titularNoticia = (TextView) fila.findViewById(R.id.tvTitularNoticia);
        TextView previewNoticia = (TextView) fila.findViewById(R.id.tvPreviewNoticia);

        Noticia noticia = getItem(position);

        ivFotoNoticia.setImageResource(R.drawable.news_logo);
        titularNoticia.setText(noticia.getTitular());
        previewNoticia.setText(noticia.getPreview());

        return fila;
    }
}
