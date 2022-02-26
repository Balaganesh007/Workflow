package com.example.workflow

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


class BlankFragment : Fragment() {


    private  val isEnabled = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_blank, container, false)
        val Button = v.findViewById<Button>(R.id.button)
        Button.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_mainActivity2)}
        if (isEnabled) Log.v("Fragment Android","onCreateView()")
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isEnabled) Log.v("Fragment Android","onCreate()")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (isEnabled) Log.v("Fragment Android","onViewCreated()")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        if (isEnabled) Log.v("Fragment Android","onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        if (isEnabled) Log.v("Fragment Android","onStart()")
    }

    override fun onResume() {
        super.onResume()
        if (isEnabled) Log.v("Fragment Android","onResume()")
    }

    override fun onPause() {
        super.onPause()
        if (isEnabled) Log.v("Fragment Android","onPause()")
    }

    override fun onStop() {
        super.onStop()
        if (isEnabled) Log.v("Fragment Android","onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if (isEnabled) Log.v("Fragment Android","onSavedInstanceState()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (isEnabled) Log.v("Fragment Android","onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isEnabled) Log.v("Fragment Android","onDestroy()")
    }
}