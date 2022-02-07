package com.example.dsapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.widget.EditText
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tolinkedlist = findViewById<CardView>(R.id.linkedlist)
        val toTree = findViewById<CardView>(R.id.tree)
        val toStack = findViewById<CardView>(R.id.stack)
        val toQueue = findViewById<CardView>(R.id.queue)
        val toGraph = findViewById<CardView>(R.id.graph)
        val toHash = findViewById<CardView>(R.id.hash)

        tolinkedlist.setOnClickListener{
            val startLinkedlist = Intent(this, LinkedlistPage::class.java)
            startActivity(startLinkedlist)
        }

        toTree.setOnClickListener{
            val startTree = Intent(this, TreePage::class.java)
            startActivity(startTree)
        }

        toStack.setOnClickListener{
            val startStack = Intent(this, StackPage::class.java)
            startActivity(startStack)
        }

        toQueue.setOnClickListener{
            val startQueue= Intent(this, QueuePage::class.java)
            startActivity(startQueue)
        }

        toGraph.setOnClickListener{
            val startGraph = Intent(this, GraphPage::class.java)
            startActivity(startGraph)
        }

        toHash.setOnClickListener{
            val startHash = Intent(this, HashPage::class.java)
            startActivity(startHash)
        }
    }
}