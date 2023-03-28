package com.example.projectitzon.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectitzon.Adapters.CustomAdapter
import com.example.projectitzon.DataClasses.ItemsViewModel
import com.example.projectitzon.R
import com.example.projectitzon.databinding.FragmentRecyclerViewBinding


class RecyclerViewFragment : Fragment() {
   private var binding:FragmentRecyclerViewBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentRecyclerViewBinding.inflate(LayoutInflater.from(context),container,false)
        val recyclerview = binding?.recyclerview
        recyclerview?.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<ItemsViewModel>()
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.baseline_folder_shared_24, "Item " + i))
        }
        val adapter = CustomAdapter(data)
        recyclerview?.adapter = adapter

        return (binding?.root)
    }


}