package com.example.selfproject1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;

public class Dialog2 extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder1=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View dialogView=inflater.inflate(R.layout.signup_page,null);
       final EditText id=(EditText)dialogView.findViewById(R.id.editText);
       final EditText password=(EditText)dialogView.findViewById(R.id.editText2);
       final EditText repassword=(EditText)dialogView.findViewById(R.id.editText3);
        Button donebutton=(Button)dialogView.findViewById(R.id.button);
        builder1.setView(dialogView);
        donebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               groupAdmin g=new groupAdmin();
               g.setId(id.getText().toString());
               g.setPassword(password.getText().toString());
               g.setRePassword(repassword.getText().toString());
               MainActivity mainActivity=(MainActivity)getActivity();
               mainActivity.addadminToList(g);

               dismiss();}

    });
        return builder1.create();
}}
