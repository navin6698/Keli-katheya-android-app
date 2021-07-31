package com.heluvekatheya.heluvekatheya.ui.language

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.heluvekatheya.heluvekatheya.R

class LanguageFragment : Fragment() {

    private lateinit var languageViewModel: LanguageViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        languageViewModel =
            ViewModelProviders.of(this).get(LanguageViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_language, container, false)
        val textView: TextView = root.findViewById(R.id.language)
        languageViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}