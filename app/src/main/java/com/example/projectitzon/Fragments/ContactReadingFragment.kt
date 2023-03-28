package com.example.projectitzon.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectitzon.Adapters.ContactAdapter
import com.example.projectitzon.DataClasses.Contact
import com.example.projectitzon.databinding.FragmentContactReadingBinding


class ContactReadingFragment : Fragment() {
    
    
    private var binding:FragmentContactReadingBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


       
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentContactReadingBinding.inflate(LayoutInflater.from(context),container,false)

        val contacts = getContacts()
        val contactRecyclerView = binding?.contactRecyclerView
        contactRecyclerView?.layoutManager = LinearLayoutManager(context)
        contactRecyclerView?.adapter = ContactAdapter(contacts)

        return (binding?.root)
    }

    @SuppressLint("Range")
    private fun getContacts(): List<Contact> {
        val contacts = mutableListOf<Contact>()
        val cursor = activity?.contentResolver?.query(
            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
            null,
            null,
            null,
            ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC"
        )
        if (cursor != null && cursor.moveToFirst()) {
            do {
                val name =
                    cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))
                val phoneNumber =
                    cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
                contacts.add(Contact(name, phoneNumber))
            } while (cursor.moveToNext())
            cursor.close()
        }
        return contacts
    }


}