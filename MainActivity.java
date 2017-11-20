package com.example.pc.customlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent intent;
    ListView list;
    String [] itemname = {"Persegi","Lingkaran","Segitiga","Persegi Panjang","Trapesium"};

    Integer [] imgid = {R.drawable.persegi, R.drawable.lingkaran, R.drawable.segitiga, R.drawable.persegi_panjang, R.drawable.trapesium};
    String [] descriptionitem = {"1","2","3","4","5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        customlist adapter = new customlist(this, itemname, imgid, descriptionitem);
        list = (ListView) findViewById(R.id.list_item);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
        intent = new Intent(MainActivity.this , Main2Activity.class);
        list.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        switch(position){
            case 0 :
                intent.putExtra("judul","bl");
                intent.putExtra("text","ajsdg");
                intent.putExtra("gambar","asdadf");
                //buat Gambar
                intent.putExtra("gambar",R.drawable.persegi);
                startActivity(intent);
                break;
            case 1 :
                intent.putExtra("judul","cr");
                intent.putExtra("text","ajsdg");
                intent.putExtra("gambar","asdadf");
                intent.putExtra("gambar",R.drawable.lingkaran);
                startActivity(intent);
                break;
            case 2 :
                intent.putExtra("judul","crc");
                intent.putExtra("text","ajsdg");
                intent.putExtra("gambar","asdadf");
                intent.putExtra("gambar",R.drawable.segitiga);
                startActivity(intent);
                break;

            case 3 :
                intent.putExtra("judul","crc");
                intent.putExtra("text","ajsdg");
                intent.putExtra("gambar","asdadf");
                intent.putExtra("gambar",R.drawable.persegi_panjang);
                startActivity(intent);
                break;
            case 4 :
                intent.putExtra("judul","crc");
                intent.putExtra("text","ajsdg");
                intent.putExtra("gambar","asdadf");
                intent.putExtra("gambar",R.drawable.trapesium);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}


