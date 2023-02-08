package com.example.koitlinstarted

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()  {
    private lateinit var rvCard:RecyclerView
    private lateinit var adapter: MainAdapter
    private lateinit var onClickListener: onClickListener;
    private lateinit var addNotesText:TextView;
    private lateinit var jobDetails:List<MainModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        rvCard=findViewById(R.id.main_rv)
        addNotesText=findViewById(R.id.main_add_notes)



        addNotesText.setOnClickListener {
            addNotes();
        }





        rvCard.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        jobDetails= listOf(
            MainModel("Shubham Chauhan","26","Android developer with 2 year experience",R.drawable.ic_launcher_foreground),
            MainModel("Sonu","26","Node  developer with 5 year experience",R.drawable.ic_launcher_background),
            MainModel("Sanjay Yadav","26","Node And React Js  developer with 8 year experience",R.drawable.ic_launcher_background),

            )
        adapter= MainAdapter(jobDetails ,this)

        rvCard.adapter=adapter


    }

    fun addNotes(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_add_notes)
        val body = dialog.findViewById(R.id.notes_title) as TextView
        val notesDesc=dialog.findViewById<TextView>(R.id.notes_desc)
        val addNotes=dialog.findViewById<TextView>(R.id.add_notes);

        addNotes.setOnClickListener {
            dialog.dismiss()
        }
//        body.text = title

//        val yesBtn = dialog.findViewById(R.id.yesBtn) as Button
//        val noBtn = dialog.findViewById(R.id.noBtn) as Button
//        yesBtn.setOnClickListener {
//            dialog.dismiss()
//        }
//        noBtn.setOnClickListener {
//            dialog.dismiss()
//        }
        dialog.show()
    }
}