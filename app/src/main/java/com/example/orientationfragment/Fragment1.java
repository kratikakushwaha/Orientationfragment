package com.example.orientationfragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment1 extends Fragment {

    private EditText e1;
    TextView t;
    Button btn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        t = v.findViewById(R.id.txtview);
        if (savedInstanceState == null) {
        } else {
            t.setText(savedInstanceState.getString("savetxt"));
            Toast.makeText(getActivity(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        }

        e1 = v.findViewById(R.id.ettext);

        btn = v.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(e1.getText().toString());
            }
        });

        setRetainInstance(true);
        return v;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String save = e1.getText().toString();
        outState.putString("savetxt", save);
        Toast.makeText(getActivity(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();

    }

}
