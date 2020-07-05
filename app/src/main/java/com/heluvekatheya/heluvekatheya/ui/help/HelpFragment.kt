package com.heluvekatheya.heluvekatheya.ui.help

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.heluvekatheya.heluvekatheya.R
import androidx.lifecycle.Observer

class HelpFragment : Fragment() {
    private lateinit var helpViewModel: HelpViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        helpViewModel =
            ViewModelProviders.of(this).get(HelpViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_language, container, false)
        val textView: TextView = root.findViewById(R.id.help)
        helpViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}