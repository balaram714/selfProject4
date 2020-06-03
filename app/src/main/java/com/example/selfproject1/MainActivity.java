package com.example.selfproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<groupAdmin> list1=new ArrayList<>();
private ArrayList<groupAdmin> list2=new ArrayList<>();
private ArrayList<groupAdmin> list3=new ArrayList<>();
public int c=0;
public void addadminToList(groupAdmin g)
{
    if(c==1)
    { if(g.getPassword().equals(g.getRePassword())){
    list1.add(g);
        Toast.makeText(this,"addedSuccessfully",Toast.LENGTH_SHORT).show();}
    else
        Toast.makeText(this,"notadded",Toast.LENGTH_SHORT).show();
    }
    else if(c==2){
        if(g.getPassword().equals(g.getRePassword())){
        list2.add(g);
            Toast.makeText(this,"addedSuccessfully",Toast.LENGTH_SHORT).show();}
    else
            Toast.makeText(this,"notAdded",Toast.LENGTH_SHORT).show();}
    else{
        if(g.getPassword().equals(g.getRePassword())){
        list3.add(g);
            Toast.makeText(this,"addedSuccessfully",Toast.LENGTH_SHORT).show(); }
    else
            Toast.makeText(this,"notAdded",Toast.LENGTH_SHORT).show();}
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDialog myDialog=new MyDialog();
        myDialog.show(getSupportFragmentManager(),"123");
    }
    public void moveToOpeningPage(View x)
    {
        setContentView(R.layout.opening_page);
        Button button1=findViewById(R.id.button15);
        c=1;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog2 dialog2=new Dialog2();
                dialog2.show(getSupportFragmentManager(),"123");
            }
        });

    }
    public void moveToOpenPage(View x)
    {
        setContentView(R.layout.opening_page);
        Button button1=findViewById(R.id.button15);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=2;
                Dialog2 dialog2=new Dialog2();
                dialog2.show(getSupportFragmentManager(),"123");
            }
        });

    }
    public void moveToOpen(View x)
    {
        setContentView(R.layout.opening_page);
        Button button1=findViewById(R.id.button15);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=3;
                Dialog2 dialog2=new Dialog2();
                dialog2.show(getSupportFragmentManager(),"123");
            }
        });

    }
    public void moveToOpenBack(View x)
    {
        setContentView(R.layout.activity_main);
    }
public void abc(View x)
{
    if(list1.isEmpty())
        Toast.makeText(this,"1",Toast.LENGTH_SHORT).show();
    else
        Toast.makeText(this,"list1="+list1.size(),Toast.LENGTH_SHORT).show();
    if(list2.isEmpty())
        Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
    else
        Toast.makeText(this,"list2="+list2.size(),Toast.LENGTH_SHORT).show();
    if(list3.isEmpty())
        Toast.makeText(this,"5",Toast.LENGTH_SHORT).show();
    else
        Toast.makeText(this,"list3="+list3.size(),Toast.LENGTH_SHORT).show();
}

}
