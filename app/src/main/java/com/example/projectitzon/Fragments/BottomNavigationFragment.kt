package com.example.projectitzon.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectitzon.R
import com.example.projectitzon.databinding.FragmentBottomNavigationBinding


class BottomNavigationFragment : Fragment() {
  private var binding:FragmentBottomNavigationBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentBottomNavigationBinding.inflate(LayoutInflater.from(context),container,false)

//        loadFragment(LogInFragment())
//        binding?.bottomNav?.setOnItemSelectedListener {
//            when (it.itemId) {
//                R.id.home -> {
//                    loadFragment(LogInFragment())
//                    true
//                }
//                R.id.message -> {
//                    loadFragment(RegistrationFragment())
//                    true
//                }
//                R.id.settings -> {
//                    loadFragment(RegistrationFragment())
//                    true
//                }
//
//                else -> {
//                    loadFragment(HomeFragment())
//                    true
//                }
//            }
//        }



        return (binding?.root)
    }
//
//    private  fun loadFragment(fragment: Fragment){
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container,fragment)
//        transaction.commit()
//    }


}