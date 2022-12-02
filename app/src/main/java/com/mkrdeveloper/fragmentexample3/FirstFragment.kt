package com.mkrdeveloper.fragmentexample3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class FirstFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val edt = view.findViewById<EditText>(R.id.edtFr1)
        val btn = view.findViewById<Button>(R.id.btnFr1)

        val myInterface : MyInterface = activity as MyInterface


        btn.setOnClickListener {

            val msg =  edt.text.toString()

           /* val intent = Intent(requireContext(), MainActivity::class.java)

            intent.putExtra("xx", msg)

            startActivity(intent)

            */

            myInterface.transferredMessage(msg)

        }

        return view
    }


}