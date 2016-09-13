package com.example.coderguru.sunshine;

import android.app.Activity;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_main, parent, false);
            String[] arr={"Today - cloudy - 27/21","Tomorrow - cloudy - 27/21","Thrusday - cloudy - 27/21","Friday - cloudy - 27/21",
                    "Saturday - cloudy - 27/21","Sunday - cloudy - 27/21","Monday - cloudy - 27/21","Tuesday - cloudy - 27/21"};

            ArrayAdapter adapter = new ArrayAdapter(getActivity(),R.layout.list_item_forecast, R.id.listitemforecast_textview,arr);
            ListView listView= (ListView) rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(adapter);
            return rootView;
        }
    }
}
